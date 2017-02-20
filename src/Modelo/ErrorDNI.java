package Modelo;

public class ErrorDNI extends RuntimeException{
    
    public ErrorDNI(String mensaje) {
        super("El DNI introducido es incorrecto");
    }
    
}
