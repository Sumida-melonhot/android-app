package space.codejun.hedwigapp.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.databinding.FragmentMessageBinding;
import space.codejun.hedwigapp.ui.activity.AddWordActivity;

public class MessageFragment extends androidx.fragment.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMessageBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message, container, false);
        View view = binding.getRoot();

        binding.button.setOnClickListener(buttonView -> startActivity(new Intent(getContext(), AddWordActivity.class)));

        return view;
    }
}
