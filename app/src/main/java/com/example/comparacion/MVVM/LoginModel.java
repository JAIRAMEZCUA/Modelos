package com.example.comparacion.MVVM;

import androidx.annotation.Nullable;

public class LoginModel {
    @Nullable
    String Usuario, Password;

    String UsuarioCorrecto="JAIR",PassCorrecto="JAIRNAAT";

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean setValidaUsu() {
        if((Usuario.equals(UsuarioCorrecto) && Password.equals(PassCorrecto))){
            return true;
        }else{
            return false;
        }
    }

}
