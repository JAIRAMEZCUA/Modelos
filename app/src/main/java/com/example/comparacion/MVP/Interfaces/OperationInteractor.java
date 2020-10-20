package com.example.comparacion.MVP.Interfaces;

public interface OperationInteractor {

    //operaciones que pueden existir en la vista
    interface OnLoginFinishedListener{
        void onUsernameError();
        void onPasswordError();
        void onSucess();
    }

    //Es el puente que permite escuchar la actividad OnLoginFinishedListener listener
    void login(String username,String password, OnLoginFinishedListener listener);
}
