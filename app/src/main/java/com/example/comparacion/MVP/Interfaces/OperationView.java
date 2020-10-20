package com.example.comparacion.MVP.Interfaces;

public interface OperationView {
    //operaciones encargadas de determinar y mostrar en la vista si el usuario o contraseña son incorrectas
    void setUsernameError();
    void setPasswordError();
    void setAceptado();
}
