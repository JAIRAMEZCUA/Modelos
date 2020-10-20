package com.example.comparacion.MVC;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.comparacion.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edpers) EditText edpersona;
    @BindView(R.id.edpass) EditText edpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnIng)
    public void clickingresar() {
        String usuarioingresado = edpersona.getText().toString();
        String passwordingresado = edpass.getText().toString();

        if (usuarioingresado.isEmpty() || passwordingresado.isEmpty()) {
            Toast.makeText(this, "FALTA LLENAR UN CAMPO ", Toast.LENGTH_LONG).show();
        } else {
            //se valida
            com.example.comparacion.MVC.ValidacionModelo validaUsuario = new ValidacionModelo();
            validaUsuario.setValidaUsu(usuarioingresado, passwordingresado);
            Toast.makeText(this, "EL USUARIO " + usuarioingresado + " Es " + validaUsuario.getValidaUsu(), Toast.LENGTH_LONG).show();
        }
    }

}
