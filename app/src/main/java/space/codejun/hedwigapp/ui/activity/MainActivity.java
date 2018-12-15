package space.codejun.hedwigapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.databinding.ActivityMainBinding;
import space.codejun.hedwigapp.ui.fragment.HomeFragment;
import space.codejun.hedwigapp.ui.fragment.MessageFragment;
import space.codejun.hedwigapp.ui.fragment.StatsFragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private androidx.fragment.app.Fragment fragment = new HomeFragment();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

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

            fragment = new HomeFragment();
            commitFragment();
        });

        binding.statsButton.setOnClickListener(view -> { //통계버튼 클릭
            binding.statsButton.setBackgroundResource(R.drawable.gradient_main_button);
            binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_white);

            binding.homeButton.setBackgroundResource(0);
            binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_gray);

            binding.messageButton.setBackgroundResource(0);
            binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_gray);

            fragment = new StatsFragment();
            commitFragment();
        });

        binding.messageButton.setOnClickListener(view -> {
            binding.messageButton.setBackgroundResource(R.drawable.gradient_main_button);
            binding.messageButtonImage.setBackgroundResource(R.drawable.ic_message_white);

            binding.homeButton.setBackgroundResource(0);
            binding.homeButtonImage.setBackgroundResource(R.drawable.ic_home_gray);

            binding.statsButton.setBackgroundResource(0);
            binding.statsButtonImage.setBackgroundResource(R.drawable.ic_insert_chart_gray);

            fragment = new MessageFragment();
            commitFragment();
        });

    }

    private void commitFragment() {
        androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
