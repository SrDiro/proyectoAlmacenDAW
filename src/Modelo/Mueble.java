package Modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Mueble extends Producto {

    public enum Madera {
        PINO, ROBLE, HAYA
    };

    private LocalDate anyoFab;
    private Madera tipoMadera;
    private String estilo;

    public Mueble() {
        super();
    }

    @Override
    public String imprimirProducto() {

        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        String fechaTipo1 = anyoFab.format(fechaFormateada);

        String res = super.imprimirProducto() + "el año de fabricación: " + fechaTipo1 + " el tipo de madera: " + this.tipoMadera + "el estilo: " + getEstilo();
        return res;

    }

    @Override
    public void setPrecio(double precioBase) {

        if (tipoMadera == Madera.ROBLE) {
            precio = precioBase * 1.10;
        } else if (tipoMadera == Madera.PINO) {
            precio = precioBase / 1.10;
        } else {
            precio = precioBase;
        }
    }

    public String getAnyoFab() {
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        String fechaTipo1 = anyoFab.format(fechaFormateada);
        return fechaTipo1;
    }

    public void setAnyoFab(LocalDate anyoFab) {
        this.anyoFab = anyoFab;
    }

    public Madera getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(Madera madera) {
        this.tipoMadera = madera;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

}
