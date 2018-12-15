package space.codejun.hedwigapp.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.databinding.FragmentMessageBinding;

public class MessageFragment extends androidx.fragment.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMessageBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message, container, false);
        View view = binding.getRoot();

        return view;
    }
}
