package space.codejun.hedwigapp.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.data.TestData;
import space.codejun.hedwigapp.databinding.FragmentMessageBinding;
import space.codejun.hedwigapp.ui.activity.AddWordActivity;
import space.codejun.hedwigapp.ui.adapters.MessageAdapter;

public class MessageFragment extends androidx.fragment.app.Fragment {

    private FirebaseFirestore db;
    private static String TAG = "firestore-word";
    private MessageAdapter mAdapter;

    private List<TestData> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMessageBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_message, container, false);
        View view = binding.getRoot();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        binding.recyclerView.setLayoutManager(linearLayoutManager);

        db = FirebaseFirestore.getInstance();
        db.collection("word")
                //.whereEqualTo("capital", true)
                .orderBy("count", Query.Direction.DESCENDING)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        list = new ArrayList<>();
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            final TestData testData = new TestData(document.getId(), Integer.valueOf(document.getData().get("count").toString()));
                            list.add(new TestData(document.getId(), Integer.valueOf(document.getData().get("count").toString())));
                        }
                        mAdapter = new MessageAdapter(getContext(), list);
                        binding.recyclerView.setAdapter(mAdapter);
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                });


        binding.button.setOnClickListener(buttonView -> startActivity(new Intent(getContext(), AddWordActivity.class)));

        return view;
    }
}
