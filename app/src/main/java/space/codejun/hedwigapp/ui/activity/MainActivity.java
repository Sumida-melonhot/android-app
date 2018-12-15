package space.codejun.hedwigapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import space.codejun.hedwigapp.R;
import space.codejun.hedwigapp.data.TestData;
import space.codejun.hedwigapp.databinding.ActivityMainBinding;

import android.os.Bundle;

import static space.codejun.hedwigapp.network.HedwigRequestReturn.getTestData;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //test code
        TestData data = getTestData();
    }
}
