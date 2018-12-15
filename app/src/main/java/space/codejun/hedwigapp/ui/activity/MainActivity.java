package space.codejun.hedwigapp.ui.activity;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.data.TestData;
import space.codejun.hedwigapp.databinding.ActivityMainBinding;

import android.os.Bundle;

import static space.codejun.hedwigapp.network.HedwigRequestReturn.getTestData;
import static space.codejun.hedwigapp.network.HedwigRequestReturn.getTestData1;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //test code
//        TestData data = getTestData("asd");
//        TestData data1 = getTestData1("hkjk");

        binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_white);
        binding.homeButton.setBackgroundResource(R.drawable.gradient_main_button);
        binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_gray);
        binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_gray);

        binding.homeButton.setOnClickListener(view -> { //홈버튼 클릭
            binding.homeButton.setBackgroundResource(R.drawable.gradient_main_button);
            binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_white);

            binding.statsButton.setBackgroundResource(0);
            binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_gray);

            binding.messageButton.setBackgroundResource(0);
            binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_gray);

            //TODO 태일이는 여기다 레이아웃 교체소스
        });

        binding.statsButton.setOnClickListener(view -> { //통계버튼 클릭
            binding.statsButton.setBackgroundResource(R.drawable.gradient_main_button);
            binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_white);

            binding.homeButton.setBackgroundResource(0);
            binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_gray);

            binding.messageButton.setBackgroundResource(0);
            binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_gray);

            //TODO 태일이는 여기다 레이아웃 교체소스
        });

        binding.messageButton.setOnClickListener(view -> {
            binding.messageButton.setBackgroundResource(R.drawable.gradient_main_button);
            binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_white);

            binding.homeButton.setBackgroundResource(0);
            binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_gray);

            binding.statsButton.setBackgroundResource(0);
            binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_gray);

            //TODO 태일이는 여기다 레이아웃 교체소스
        });

    }
}
