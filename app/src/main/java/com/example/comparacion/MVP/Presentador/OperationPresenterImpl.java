package com.example.comparacion.MVP.Presentador;


import com.example.comparacion.MVP.Interfaces.OperationInteractor;
import com.example.comparacion.MVP.Interfaces.OperationPresenter;
import com.example.comparacion.MVP.Interfaces.OperationView;

public class OperationPresenterImpl implements OperationInteractor.OnLoginFinishedListener, OperationPresenter {

    private OperationView loginView;
    private OperationInteractor operationInteractor;

    public OperationPresenterImpl(OperationView loginView, OperationInteractor operationInteractor) {
        this.loginView = loginView;
        this.operationInteractor = operationInteractor;
    }

    @Override
    public void onUsernameError() {
        if(loginView!=null){
            loginView.setUsernameError();
        }
    }

    @Override
    public void onPasswordError() {
        if(loginView!=null){
            loginView.setPasswordError();
        }
    }

    @Override
    public void onSucess() {
        if(loginView!=null){
            loginView.setAceptado();
        }
    }

    @Override
    public void validaCredenciales(String username, String password) {
        if(loginView!=null){
            operationInteractor.login(username, password,this);
        }
    }

    @Override
    public void onDestroy() {
        //evitamos fugas de memoria
        loginView=null;
    }
}
