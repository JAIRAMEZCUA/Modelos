package com.example.comparacion.MVVM;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.example.comparacion.R;
import com.example.comparacion.databinding.ActivityMain2Binding;

public class MainActivity extends AppCompatActivity implements LoginCallbacks{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain2Binding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,new LoginViewModelFactory(this)).get(LoginViewModel.class));

    }

    @Override
    public void onError(String message) {
        Toast.makeText(this,"APROBADO",Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onSucess(String message) {
        Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();
    }
}