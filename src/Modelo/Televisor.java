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
        double precioInc;
        if (this.pulgadas > 40 && tipo == tipoTele.PLASMA) {
            precioInc = (precioBase * 1.10);
            precio = precioInc - (precioInc / 0.1);
        } else if (this.pulgadas > 40) {
            precio = precioBase * 1.10;
        } else if (tipo == tipoTele.PLASMA) {
            precio = precioBase - (precioBase * 0.10);
        } else {
            precio = precioBase;
        }

    }

    @Override
    public String imprimirProducto() {
        String res = super.imprimirProducto() + "tipo de TV: " + this.tipo + "con " + this.pulgadas + " pulgadas";
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
