package space.codejun.hedwigapp.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();

        binding.button.setOnClickListener(buttonView -> Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show());

        return view;
    }
}
