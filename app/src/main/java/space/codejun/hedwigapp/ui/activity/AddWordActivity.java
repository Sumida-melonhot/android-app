package space.codejun.hedwigapp.ui.activity;

import android.os.Bundle;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.databinding.ActivityAddWordBinding;

public class AddWordActivity extends AppCompatActivity {

    private ActivityAddWordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_word);

        binding.backButton.setOnClickListener(view -> finish());

        //TODO 태일이는 여기다 파베스토어 이니셜라이징 하시오.

        binding.addButton.setOnClickListener(view -> {
            if (Objects.requireNonNull(binding.addWordInputText.getText()).length() == 0) {
                binding.addWordInputLayout.setErrorEnabled(true);
                binding.addWordInputLayout.setError("この項目を満たしてください。");
            } else {
                binding.addWordInputLayout.setErrorEnabled(false);

                //TODO 파베 추가 ㄱ
                //binding.addWordInputText.getText().toString();

            }
        });

    }
}
