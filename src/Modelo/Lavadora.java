
package Modelo;


public class Lavadora extends Electrodomestico {
    int revoluciones;
    double carga;
    public Lavadora(){
        super();
    }
    
    @Override
    public void setPrecio(double precioBase){
        double precioInc;
    
        if (this.revoluciones > 500) {
            precio = precioBase * 1.10;
        } else if (this.carga < 8){
            precio = precioBase / 1.15;
        } else if (this.revoluciones > 500 && this.carga < 8){
            precioInc = precioBase * 1.10;
            precio = precioInc - (precioBase * 0.15);
        } else {
            precio = precioBase;
        }
        
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
        String res = super.imprimirProducto() + "de revoluciones: "+this.revoluciones+ "con carga: "+this.carga;
        return res;
    }
    
 
}
