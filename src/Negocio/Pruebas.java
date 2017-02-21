package Negocio;

import java.text.DecimalFormat;

public class Pruebas {

    public static void main(String[] args) {
        String res = "", res2 = "";
//        System.out.format("%3s %10s %18s %7s %13s %24s %1s", "ID", "NOMBRE", "RAZON SOCIAL", "CIF", "TIPO", "DESCUENTO" + "\n"
//                               ,"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
//        if (clientes.isEmpty()) {
//            res = "No hay clientes introducidos.";
//            
//        } else {
//            for (Cliente c : clientes) {
//
//                if (c instanceof Mayorista) {
//                    Mayorista m = (Mayorista) c;
//                    res += "\n ID NOMBRE  RAZON SOCIAL  CIF   TIPO  DESCUENTO" + "\n" + m.getIdCliente() + "   " + m.getNombre() + "   " + m.getRazonSocial() + "   " + m.getCif() + "   " + m.getTipoMayorista() + "   " + m.getDescuento();
//                    res += String.format("%2s %15s %14s %13s %18s %7s" + "\n",
//                                         m.getIdCliente(), m.getNombre(), m.getRazonSocial(), m.getCif(), m.getTipoMayorista(), m.getDescuento() + "\n");
//                if (c instanceof Particular) {
//                    Particular p = (Particular) c;
//                    res += p.getIdCliente(), p.getNombre(), p.getRazonSocial(), p.getDni();

//        res += String.format("%3s %10s %18s %12s %24s %13s %1s", "ID", "NOMBRE", "RAZON SOCIAL", "CIF/DNI", "TIPO MAYORISTA", "DESCUENTO" + "\n"
//                               ,"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
//        res += String.format("%2s %15s %14s %13s %23s %7s" + "\n",
//                                         0, "Rasul Diro", "123456781", "54015429K", "GRAN_SUPERFICIE", 0.0 + "\n");
//        res += String.format("%2s %15s %14s %13s %23s %15s" + "\n",
//                                         1, "Sergio Masao", "123456782", "54014660BK", "El Cliente es", "particular " + "\n");
//        res += "\n ID NOMBRE  PRECIO  MARCA   FABRICANTE  TAMAÑO   TIPO    PULGADAS" + "\n" + t.getId() + "   " + t.getNombre() + "   " + t.getPrecio() + t.getMarca() + "   " + t.getFabricante() + "   " + t.getTamanyo() + t.getTipo() + "  " + t.getPulgadas();
//
//    }
//    if (p instanceof Lavadora) {
//                    Lavadora l = (Lavadora) p;
//        res += "\n ID NOMBRE  PRECIO  MARCA   FABRICANTE  REVOLUCIONES  CARGA" + "\n" + l.getId() + "   " + l.getNombre() + "   " + l.getPrecio() + "  " + l.getMarca() + "         " + l.getFabricante() + "   " + l.getTamanyo() + "     " + l.getRevoluciones() + "     " + l.getCarga();
//
//    }
//
//    if (p instanceof Mueble ) {
//
//                    Mueble m = (Mueble) p;
//
//        res += "\n ID NOMBRE  PRECIO     AÑO FABRICACION              MADERA  ESTILO" + "\n"
//                + m.getId() + "   " + m.getNombre() + "   " + m.getPrecio() + "  " + m.getAnyoFab()
//                + "   " + m.getTipoMadera() + "     " + m.getEstilo();
        res += String.format("%3s %10s %12s %12s %16s %13s %10s %15s %18s %10s %18s %10s %10s %1s", "ID", "NOMBRE", "PRECIO", "MARCA", "FABRICANTE",
                "TAMAÑO", "TIPO", "PULGADAS", "REVOLUCIONES", "CARGA", "AÑO FABRICACION", "MADERA", "ESTILO" + "\n",
                "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
//            res += String.format("%2s %11s %13s %13s %17s %14s %11s %16s %11s %11s %19s %11s %11s" , t.getId(), t.getNombre(), t.getPrecio(), t.getMarca(), t.getFabricante(), t.getTamanyo(), t.getTipo(), t.getPulgadas(), " ", " ", " ", " ", " " + "\n");
        res += String.format("%2s %11s %12s %12s %17s %14s %7s %16s %11s %11s %19s %11s %11s",
                1, "Tele 3000", 150, " ", " ", " ", "LED", 40, " ", " ", " ", " ", " " + "\n");
//                res += String.format("%2s %11s %12s %12s %17s %14s %11s %16s %9s %14s %19s %11s %11s", l.getId(), l.getNombre(, l.getPrecio(), l.getMarca(), l.getFabricante(), l.getTamanyo(), l.getRevoluciones(), l.getCarga();
        res += String.format("%2s %11s %12s %12s %16s %13s %10s %15s %18s %10s %18s %10s %10s",
                2, "Lava 6", 174.9, "null", "null", "0.0", "null", "null", "3500", "80.0", " ", " ", " " + "\n");

//        res +=  String.format("%2s %11s %12s %12s %17s %14s %11s %16s %9s %14s %19s %11s %8s", m.getId(), m.getNombre(), m.getPrecio(), " ", " ", " ", " ", " ", " ", " ", m.getAnyoFab(), m.getTipoMadera(), m.getEstilo();
        res += String.format("%2s %11s %12s %12s %17s %14s %11s %16s %9s %14s %19s %10s %9s",
                3, "Mesa 2.0", 75.55, " ", " ", " ", " ", " ", " ", " ", "01-diciembre-17", "PINO", "Chino" + "\n");
        
        res2 += String.format("%1s %15s %15s %15s %20s %1s", " ID VENTA", "VENDEDOR", "CLIENTE", "PRODUCTO", "PRECIO VENTA" + "\n"
                                  ,"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        
        res2 += String.format("%1s %19s %12s %14s %19s", " " + 1, "David", 2, 1, 174.9);
        
        res2 = "";
        
        res2 = String.format("%1s %15s %15s %20s %15s %15s %1s", " ID", "NOMBRE", "PRECIO", "AÑO FABRICACION", "MADERA",  "ESTILO" + "\n"
                                                               , "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        res2 += String.format("%1s %16s %15s %18s %15s %15s", " " + 1, "Mesa 2.0", 174.9, "01-febrero-17", "PINO", "Chino");
        
        System.out.println(res2);
        
//        System.out.println(res);
//    double precioInicial = 66.88888888, precioMostrar; 
//    
//            precioMostrar = Math.round(precioInicial*100.0)/100.0;
    
//        DecimalFormat myFormatter = new DecimalFormat("###,###");
//        String precioFormateado = myFormatter.format(precioInicial);
//        System.out.println(precioFormateado);
//        precioMostrar = Double.parseDouble(precioFormateado);
//        
//        System.out.println(precioMostrar);
    }

}
