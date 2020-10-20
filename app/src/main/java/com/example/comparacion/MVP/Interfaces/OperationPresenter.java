package com.example.comparacion.MVP.Interfaces;

public interface OperationPresenter {
    //Es el intermediario entre el interactor y la vista (manda a llamar los métodos correspondientes en las interfaces)
    void validaCredenciales(String username,String password);
    void onDestroy();

}
