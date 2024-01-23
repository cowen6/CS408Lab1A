package com.example.cs408lab1a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cs408lab1a.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        list = getResources().getStringArray(R.array.outputs);

        binding.helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(list.length);
                String output = list[num];
                TextView t = binding.outputText;
                t.setText(output);
            }
        });
    }
}