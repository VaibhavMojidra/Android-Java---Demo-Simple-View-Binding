package com.vaibhavmojidra.androidjavademosimpleviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.vaibhavmojidra.androidjavademosimpleviewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.greetButton.setOnClickListener(view -> {
            binding.greetTextView.setText("Hello "+binding.nameEditTextText.getText());
        });
    }
}