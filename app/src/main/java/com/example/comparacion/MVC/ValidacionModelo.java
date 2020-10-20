package com.example.comparacion.MVC;

public class ValidacionModelo {
        private String Usuario;
        private String Password;
        private String ValidaUsu;
        private String UsuarioCorrecto="JAIR";
        private String PassCorrecto="JAIRNAAT";

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

        public String getValidaUsu() {
            return ValidaUsu;
        }

        public void setValidaUsu(String Usuario, String Password) {
            if((Usuario.equals(UsuarioCorrecto) && Password.equals(PassCorrecto))){
                ValidaUsu="Usuario Correcto";
            }else{
                ValidaUsu="Usuario Incorrecto";
            }
        }

    }
