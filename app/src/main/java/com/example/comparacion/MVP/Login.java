package com.example.comparacion.MVP;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.comparacion.MVP.Interactor.OperationInteractorImpl;
import com.example.comparacion.MVP.Interfaces.OperationPresenter;
import com.example.comparacion.MVP.Interfaces.OperationView;
import com.example.comparacion.MVP.Presentador.OperationPresenterImpl;
import com.example.comparacion.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity implements OperationView {

    @BindView(R.id.edpers) EditText edpersona;
    @BindView(R.id.edpass) EditText edpass;
    private OperationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter= new OperationPresenterImpl(this,new OperationInteractorImpl());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @OnClick(R.id.btnIng)
    public void clickingresar() {
        String usuarioingresado = edpersona.getText().toString();
        String passwordingresado = edpass.getText().toString();
        presenter.validaCredenciales(usuarioingresado,passwordingresado);
    }


    @Override
    public void setUsernameError() {
        edpersona.setText("USUARIO INVALIDO");
    }

    @Override
    public void setPasswordError() {
        edpersona.setText("INGRESE CONTRASEÑA ");

    }

    @Override
    public void setAceptado() {
        Toast.makeText(this,"USUARIO CORRECTO", Toast.LENGTH_LONG).show();
    }

}
