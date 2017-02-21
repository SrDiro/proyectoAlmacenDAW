
package Modelo;

import java.util.ArrayList;
import java.util.List;



public abstract  class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected List<Venta> ventas;
    protected static int contador=1; 
    
    public Producto(){
        ventas= new ArrayList();
        this.id=contador;
        contador++;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getId() {
        return id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    
    
    public abstract void setPrecio(double precioBase);
    
    
    
    public String imprimirProducto(){
        String res = String.format("%1s %16s %15s", " " + this.id, this.precio, this.nombre);
        return res;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + '}';
    }
    
    
    public static String imprimirNumProductos(){
        String res = "El número de productos es: "+contador;
        return res;
    }

        
    }
    
    

