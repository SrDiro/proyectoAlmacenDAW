package Modelo;

public class Particular extends Cliente {

    private String dni;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        
            this.dni = this.comprobarLetra(dni);
            
    }

    public String comprobarLetra(String dni) {
        String respuesta = "";
        int numero;
        int resto;
        String letra, letraFinal;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraBuena;
        numero = Integer.parseInt(dni.substring(0, dni.length() - 1));
        resto = numero % 23;
        letra = dni.substring(8);
        if (dni.length() == 7) {
            for (int i = 0; i < letras.length; i++) {
                letraBuena = letras[resto];
                letraFinal = String.valueOf(letraBuena);
                respuesta = dni + letraFinal + "";
            }
        }
        for (int i = 0; i < letras.length; i++) {
            letraBuena = letras[resto];
            letraFinal = String.valueOf(letraBuena);
            if (letraFinal.equals(letra)) {
                respuesta = dni;
            }
        }
        return respuesta;
    }

    @Override
    public String imprimir() {
        String res = super.imprimir() + " DNI: " + this.dni;
        return res;
    }

}
