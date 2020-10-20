package com.example.comparacion.MVP.Interactor;

import android.text.TextUtils;
import android.util.Log;

import com.example.comparacion.MVP.Interfaces.OperationInteractor;

public class OperationInteractorImpl implements OperationInteractor {
    //aqui va todas las funciones sobreescritas o acciones , eventos que se pueden ejecutar
    @Override
    public void login(final String username, String password, OperationInteractor.OnLoginFinishedListener listener) {
        if(TextUtils.isEmpty(username)){
            listener.onUsernameError();
        }
        if(TextUtils.isEmpty(password)){
            listener.onPasswordError();
        }
        Log.d("USU",username);
        Log.d("Pass",password);
        if(username.equals("JAIR") && password.equals("JAIRNAAT")){
            listener.onSucess();
        }
    }
}
