package com.example.comparacion.MVVM;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private LoginModel loginModel;
    private LoginCallbacks loginCallbacks;

    public LoginViewModel(LoginCallbacks loginCallbacks) {
        this.loginModel = new LoginModel();
        this.loginCallbacks = loginCallbacks;
    }



    public LoginCallbacks getLoginCallbacks() {
        return loginCallbacks;
    }

    public void setLoginCallbacks(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
    }

    public TextWatcher userTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                loginModel.setUsuario(s.toString());
            }
        };
    }
    public TextWatcher passTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                loginModel.setPassword(s.toString());
            }
        };
    }
    public void onLoginBtnClick(View view) {
        if (loginModel.setValidaUsu()) {
            loginCallbacks.onSucess("BIENVENIDO");
        }else{

            loginCallbacks.onError("No Permitido");

        }
    }
}
