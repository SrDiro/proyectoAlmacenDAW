package Negocio;

public class Pruebas {

    public static void main(String[] args) {
        String res = "";
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

        res += String.format("%3s %10s %18s %12s %13s %24s %1s", "ID", "NOMBRE", "RAZON SOCIAL", "CIF/DNI", "TIPO", "DESCUENTO" + "\n"
                               ,"¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + "\n");
        res += String.format("%2s %15s %14s %13s %23s %7s" + "\n",
                                         0, "Rasul Diro", "123456781", "54015429K", "GRAN_SUPERFICIE", 0.0 + "\n");
        res += String.format("%2s %15s %14s %13s %23s %8s" + "\n",
                                         1, "Sergio Masao", "123456782", "54014660BK", "NULL", "NULL" + "\n");

        System.out.println(res);
    }

}
