
package Modelo;


public class Lavadora extends Electrodomestico {
    int revoluciones;
    double carga;
    public Lavadora(){
        super();
    }
    
    @Override
    public void setPrecio(double precioBase){
        double precioInc, precioFinal;
    
        if (this.revoluciones > 500) {
            precioFinal = precioBase * 1.10;
        } else if (this.carga < 8){
            precioFinal = precioBase / 1.15;
        } else if (this.revoluciones > 500 && this.carga < 8){
            precioInc = precioBase * 1.10;
            precioFinal = precioInc - (precioBase * 0.15);
        } else {
            precioFinal = precioBase;
        }
        
        precio = Math.round(precioFinal * 100.0) / 100.0; 
        
    }

    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    @Override
    public String imprimirProducto(){
        String res = "";
        
        res += String.format("%1s %15s %15s %15s %15s %15s %16s %10s %1s", " ID", "PRECIO", "NOMBRE", "MARCA", "TAMAÑO", "FABRICANTE", "REVOLUCIONES", "CARGA" + "\n"
                                                               , "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        
        res += String.format("%1s %14s %16s", super.imprimirProducto(), this.revoluciones, this.carga);
        return res;
    }
    
 
}
