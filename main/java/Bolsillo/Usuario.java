package Bolsillo;

public class Usuario {

    public boolean validarUsuNequi(String Celular, String pass, Object ContraseñaN){
        boolean validarUsuNequi=false;

        if(Celular.equals(123) && ContraseñaN.equals(123))
        {
            validarUsuNequi=true;
        }
        else{
            validarUsuNequi=false;
        }
        return validarUsuNequi;
    }



    public boolean ValidarUsuarioDaviplata(String DocumentoD, String ContraseñaD){
        boolean ValidarUsuarioDaviplata=false;

        if(DocumentoD.equals(854)&& ContraseñaD.equals(854))
        {
            ValidarUsuarioDaviplata=true;
        }
        else{
            ValidarUsuarioDaviplata=false;
        }
        return ValidarUsuarioDaviplata;
    }



    public boolean ValidarUsuNequi(String celular, String contraseñaN) {
        return false;
    } 
}
