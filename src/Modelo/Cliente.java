
package Modelo;

import java.util.ArrayList;
import java.util.List;



public abstract class Cliente {
   protected  int idCliente;
   protected  String nombre;
   protected  String razonSocial;
   protected  List<Venta> compras;
   private static int numClientes;
   
   Cliente(){       
       idCliente=numClientes;
       numClientes++;
       compras= new ArrayList();
   }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Venta> getCompras() {
        return compras;
    }

    public void setCompras(List<Venta> compras) {
        this.compras = compras;
    }
   
   public String imprimir(){
       //id, nombre, razon social
      String res = String.format("%-7s %-17s %18s %6s %16s %24s %1s %-6s %-22s %10s", " ID", "NOMBRE", "RAZON SOCIAL", "CIF", "TIPO", "DESCUENTO" + "\n"
                               ,"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n"
                               , this.idCliente, this.nombre, this.razonSocial);
      return res;
       
   }

    
}
