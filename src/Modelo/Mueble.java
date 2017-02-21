package Modelo;

import java.text.DecimalFormat;
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
        String res = "";
        
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        String fechaTipo1 = anyoFab.format(fechaFormateada);

        res += String.format("%1s %15s %15s %20s %15s %15s %1s", " ID", "PRECIO", "NOMBRE", "AÑO FABRICACION", "MADERA",  "ESTILO" + "\n"
                                                               , "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        
        res += String.format("%1s %18s %15s %15s", super.imprimirProducto(), fechaTipo1, this.tipoMadera, getEstilo());
        return res;

    }

    @Override
    public void setPrecio(double precioBase) {
        double precioFinal;

        if (tipoMadera == Madera.ROBLE) {
            precioFinal = precioBase * 1.10;
        } else if (tipoMadera == Madera.PINO) {
            precioFinal = precioBase / 1.10;
        } else {
            precioFinal = precioBase;
        }

        this.precio = Math.round(precioFinal * 100.0) / 100.0;
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
