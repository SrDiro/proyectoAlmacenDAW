package Modelo;

public class Televisor extends Electrodomestico {

    protected double pulgadas;
    protected tipoTele tipo;

    public enum tipoTele {
        LED, LCD, OLED, PLASMA
    };

    public Televisor() {
        super();
    }

    @Override
    public void setPrecio(double precioBase) {
        double precioInc, precioFinal;
        if (this.pulgadas > 40 && tipo == tipoTele.PLASMA) {
            precioInc = (precioBase * 1.10);
            precioFinal = precioInc - (precioInc / 0.1);
        } else if (this.pulgadas > 40) {
            precioFinal = precioBase * 1.10;
        } else if (tipo == tipoTele.PLASMA) {
            precioFinal = precioBase - (precioBase * 0.10);
        } else {
            precioFinal = precioBase;
        }

        precio = Math.round(precioFinal * 100.0) / 100.0;
        
    }

    @Override
    public String imprimirProducto() {
        String res = "";
        
        res += String.format("%1s %15s %15s %15s %15s %15s %12s %15s %1s", " ID", "PRECIO", "NOMBRE", "MARCA", "TAMAÑO", "FABRICANTE", "TIPO TV", "PULGADAS" + "\n"
                                                               , "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        
        res += String.format("%1s %17s %11s", super.imprimirProducto(), this.tipo, this.pulgadas);
        return res;

    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public tipoTele getTipo() {
        return tipo;
    }

    public void setTipo(tipoTele tipo) {
        this.tipo = tipo;
    }

}
