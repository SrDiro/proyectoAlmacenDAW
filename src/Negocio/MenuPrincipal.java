package Negocio;

import Modelo.Cliente;
import Modelo.Lavadora;
import Modelo.Mayorista;
import Modelo.Mueble;
import Modelo.Particular;
import Modelo.Producto;
import Modelo.Televisor;
import Modelo.TipoMayorista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Modelo.ErrorDNI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuPrincipal {

    NegociosService servicio;

    MenuPrincipal() {
        servicio = new NegociosService();    
    }

    public void inciarAplicacion() throws ParseException {
        
        datosPorDefecto(servicio);
        
        try {
            // menu Principal
            int opcion = -1;
            do {
                System.out.println("1.Productos");
                System.out.println("2.Clientes");
                System.out.println("3.Ventas");
                System.out.println("0. Para Salir");
                System.out.println("Introduzca la opcion");
                Scanner sc = new Scanner(System.in);   
                opcion = sc.nextInt();
                if (opcion == 1) {
                    menuProductos();    
                }
                if (opcion == 2) {
                    menuClientes();
                }
                if (opcion == 3) {
                    menuVentas();
                }

            } while (opcion != 0);

            System.out.println("Gracias por usar nuestra aplicacion");
            System.out.println("Hasta la proxima");

        } catch (Exception e) {
            System.out.println("Opcion no valida");
            this.inciarAplicacion();
        }
    }

    private void menuProductos() {
        try {
            int opcionProductos = -1;
            do {
                System.out.println("1.Introducir Producto");
                System.out.println("2.Dar de baja un producto");
                System.out.println("3.Imprimir los datos de un producto");
                System.out.println("4.Imprimir todos los productos");
                System.out.println("0. Salir del menu");
                Scanner sc = new Scanner(System.in);
                opcionProductos = sc.nextInt();

                if (opcionProductos == 1) {
                    Producto p = datosProducto();
                    servicio.introducirProducto(p);
                }
                if (opcionProductos == 2) {
                    System.out.println("Introduzca el número de producto: ");
                    int num = sc.nextInt();
                    servicio.elimninarProducto(num);
                }
                if (opcionProductos == 3) {
                    System.out.println("Introduzca el número de producto: ");
                    int nprod = sc.nextInt();
                    System.out.println(servicio.buscarProducto(nprod).imprimirProducto());
                }
                if (opcionProductos == 4) {
                    System.out.println(servicio.imprimirTodosProductos());
                }

            } while (opcionProductos != 0);
        } catch (Exception e) {
            System.out.println("Opcion no valida" + e.getMessage());
            this.menuProductos();
        }
    }

    public Producto datosProducto() throws Exception {
        Scanner sc = new Scanner(System.in);
        Producto producto = null;
        String nombre;
        double precio;
        int opcion = -1;
        do {
            System.out.println("Introduzca el nombre: ");
            nombre = sc.nextLine();

            System.out.println("Introduzca precio base: ");
            precio = Double.parseDouble(sc.nextLine());

            System.out.println("Introduzca el tipo de producto: ");
            System.out.println("1. Mueble");
            System.out.println("2. Lavadora");
            System.out.println("3. Televisor");
            opcion = sc.nextInt();
            if (opcion == 1) {
                producto = pedirMueble();
            }
            if (opcion == 2) {
                producto = pedirLavadora();
            }
            if (opcion == 3) {
                producto = pedirTelevisor();
            }
            if (producto != null) {
                producto.setNombre(nombre);
                producto.setPrecio(precio);
            }

        } while (opcion != 1 && opcion != 2 && opcion != 3);

        return producto;
    }

    public Mueble pedirMueble() throws ParseException {
        Mueble m = new Mueble();
        Scanner sc = new Scanner(System.in);

        m.setTipoMadera(pedirMadera());

        System.out.println("Introduzca el estilo:");
        m.setEstilo(sc.nextLine());

        System.out.println("Introduzca la fecha (dd-mes-yy): ");
        m.setAnyoFab(this.validarFecha(sc.nextLine()));

        return m;

    }

    public Lavadora pedirLavadora() {
        Scanner sc = new Scanner(System.in);
        Lavadora l = new Lavadora();

        System.out.println("Introduzca las revoluciones(rpm): ");
        int rev = Integer.parseInt(sc.nextLine());
        l.setRevoluciones(rev);

        System.out.println("Introduzca la capacidad (kg): ");
        int c = Integer.parseInt(sc.nextLine());
        l.setCarga(c);

        return l;
    }

    public Televisor pedirTelevisor() {
        Televisor tv = new Televisor();
        Scanner sc = new Scanner(System.in);
        Televisor.tipoTele t = null;
        int contador = 0;

        String opcion;

        System.out.println("Introduzca las pulgadas: ");
        double pulgadas = Double.parseDouble(sc.nextLine());
        tv.setPulgadas(pulgadas);

        do {
            System.out.println("Introduzca el tipo de Televisor");
            
            for (Televisor.tipoTele t2 : Televisor.tipoTele.values()){
                contador++;
                System.out.println(contador + "." + t2);
            }

            opcion = sc.nextLine();

        } while (opcion.equals("1") == false && opcion.equals("2") == false && 
                opcion.equals("3") == false && opcion.equals("4") == false);

        if (opcion.equals("1")) {
            t = Televisor.tipoTele.LED;
        }
        if (opcion.equals("2")) {
            t = Televisor.tipoTele.OLED;
        }
        if (opcion.equals("3")) {
            t = Televisor.tipoTele.PLASMA;
        }
        if (opcion.equals("4")) {
            t = Televisor.tipoTele.LCD;
        }
        tv.setTipo(t);

        return tv;
    }

    private Mueble.Madera pedirMadera() {
        Mueble.Madera m = null;
        String opcion;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        do {
            
            for (Mueble.Madera m2 : Mueble.Madera.values()) {
                contador++;
                System.out.println(contador + "." + m2.toString());
            }
            
            System.out.println("Introduzca el tipo de Madera");
            System.out.println("1.Pino");
            System.out.println("2.Roble");
            System.out.println("3.Haya");

            opcion = sc.nextLine();

        } while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));

        if (opcion.equals("1")) {
            m = Mueble.Madera.PINO;
        }
        if (opcion.equals("2")) {
            m = Mueble.Madera.ROBLE;
        }
        if (opcion.equals("3")) {
            m = Mueble.Madera.HAYA;
        }
        return m;
    }

    private void menuClientes() {
        Scanner sc2 = new Scanner(System.in);

        try {
            int opcionClientes = -1;
            do {
                System.out.println("1.Introducir Cliente");
                System.out.println("2.Dar de baja un cliente");
                System.out.println("3.Imprimir los datos de un cliente");
                System.out.println("4.Imprimir todos los clientes");
                System.out.println("0. Salir del menu");

                opcionClientes = sc2.nextInt();
                if (opcionClientes == 1) {
                    datosClientes();
                }
                if (opcionClientes == 2) {
                    bajaCliente();
                }
                if (opcionClientes == 3) {
                    System.out.println("Introduzca el número de cliente: ");
                    int nCliente = sc2.nextInt();
                    System.out.println(servicio.buscarCliente(nCliente).imprimir());
                }
                if (opcionClientes == 4) {
                    System.out.println(servicio.imprimirTodosClientes());
                }

            } while (opcionClientes != 0);
        } catch (Exception e) {
            System.out.println("Opcion no valida");
            this.menuClientes();
        }

    }

    private void bajaCliente() {
        Scanner sc2 = new Scanner(System.in);

        int idCliente;
        System.out.println("¿Cuál es el id del cliente que quiere dar de baja?");
        idCliente = sc2.nextInt();
        servicio.eliminarCliente(idCliente);
    }

    private void datosClientes() {
        Scanner sc = new Scanner(System.in);         
        Scanner sc2 = new Scanner(System.in);

        String tipoCliente, nombre, razonSocial, cif, dni, opcion;
        boolean bucle = false;
        int contador = 0;

        Mayorista m = new Mayorista();
        TipoMayorista t = null;
        Particular p = new Particular();

        System.out.println("Introduce el tipo de Cliente");
        System.out.println("1.Mayorista");
        System.out.println("2.Particular");
        tipoCliente = sc.nextLine();

        if (tipoCliente.equals("1")) {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            m.setNombre(nombre);
            System.out.print("Dime tu razon social: ");
            razonSocial = sc.nextLine();
            m.setRazonSocial(razonSocial);
            System.out.print("Dime tu cif: ");
            cif = sc.nextLine();
            m.setCif(cif);
            System.out.println("");
            do {
                System.out.println("Introduzca el tipo de Mayorista");
                
                for (TipoMayorista m2 : TipoMayorista.values()){
                    contador++;
                    System.out.println(contador + "." + m2);
                }

                opcion = sc2.nextLine();

            } while (opcion.equals("1") == false && opcion.equals("2") == false);

            if (opcion.equals("1")) {
                t = TipoMayorista.GRAN_SUPERFICIE;
            }
            if (opcion.equals("2")) {
                t = TipoMayorista.TIENDA;
            }
            m.setTipoMayorista(t);

            servicio.introducirCliente(m);
        } else if (tipoCliente.equals("2")) {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            p.setNombre(nombre);
            System.out.print("Dime tu razon social: ");
            razonSocial = sc.nextLine();
            p.setRazonSocial(razonSocial);

            do {
                try {
                    System.out.print("Dime tu dni: ");
                    dni = sc.nextLine();
                    p.setDni(dni);
                    bucle = true;
                } catch (ErrorDNI a) {
                    System.out.println(a.getMessage());
                }
            } while (bucle == false);

            servicio.introducirCliente(p);
        }
    }

    private void menuVentas() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        try {
            String opcionVentas = "-1";
            do {
                System.out.println("1.Introducir Venta");
                System.out.println("2.Dar de baja una venta");
                System.out.println("3.Imprimir los datos de una venta");
                System.out.println("4.Imprimir todas las ventas");
                System.out.println("0. Salir del menu");
                opcionVentas = sc.nextLine();

                if (opcionVentas.equals("1")) {
                    System.out.println("Introduce el número de cliente.");
                    int nc = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el número de producto.");
                    int np = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el nombre del vendedor: ");
                    String v = sc.nextLine();
                    servicio.introducirVenta(nc, np, v);
                }
                if (opcionVentas.equals("2")) {
                    System.out.println("Introduzca número de venta: ");
                    int nv = Integer.parseInt(sc.nextLine());
                    servicio.eliminarVenta(nv);
                }
                if (opcionVentas.equals("3")) {
                    System.out.println("Introduzca número de venta: ");   
                    int nv = sc2.nextInt();
                    System.out.println(servicio.buscarVenta(nv)); 
                }
                if (opcionVentas.equals("4")) {
                    System.out.println(servicio.imprimirtodasVentas()); 
                }

            } while (!opcionVentas.equals("0"));

        } catch (Exception e) {
            System.out.println("Opcion no valida" + e.getMessage());
            this.menuVentas();
        }

    }

    private LocalDate validarFecha(String fecha) throws ParseException {

        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd-MMMM-yy");//FORMATO EN EL QUE TE LO INTRODUCE EL CLIENTE
        LocalDate fechaFormat = LocalDate.parse(fecha, patron);

        return fechaFormat;
    }
    
    public void datosPorDefecto(NegociosService servicio) throws ParseException {
        
        //OBEJTOS
        Producto producto = null;
        
        Particular p1 = new Particular();           
        Mayorista m1 = new Mayorista();
        
        Particular p2 = new Particular();
        Mayorista m2 = new Mayorista();
        
        Lavadora l1 = new Lavadora();
        Mueble mu1 = new Mueble();
        Televisor t1 = new Televisor();
        
        //ENUM TipoMayorista
        TipoMayorista tTienda = TipoMayorista.TIENDA;
        TipoMayorista tGranSuperficie = TipoMayorista.GRAN_SUPERFICIE;
        
        //ENUM Televisor
        Televisor.tipoTele tLCD = Televisor.tipoTele.LCD; 
        Televisor.tipoTele tLED = Televisor.tipoTele.LED;
        Televisor.tipoTele tOLED = Televisor.tipoTele.OLED;
        Televisor.tipoTele tPLASMA = Televisor.tipoTele.PLASMA;
        
        //ENUM Mueble
        Mueble.Madera mHAYA = Mueble.Madera.HAYA;
        Mueble.Madera mPINO = Mueble.Madera.PINO;
        Mueble.Madera mROBLE = Mueble.Madera.ROBLE;

        //MAYORISTA 1
        m1.setNombre("Rasul Diro");
        m1.setRazonSocial("123456781");
        m1.setCif("54015429K");
        m1.setTipoMayorista(tTienda);
        servicio.introducirCliente(m1);     
        
        //PARTICULAR 1
        p1.setNombre("Sergio Masao");
        p1.setRazonSocial("123456782");
        p1.setDni("54014660B");  
        servicio.introducirCliente(p1);
        
        //MAYORISTA 2
        m2.setNombre("Borja Riao");
        m2.setRazonSocial("123456783");
        m2.setCif("11501378K");
        m2.setTipoMayorista(tGranSuperficie);
        servicio.introducirCliente(m2);
        
        //PARTICULAR 2
        p2.setNombre("Joselu Toloco");
        p2.setRazonSocial("123456784");
        p2.setDni("50154658F");
        servicio.introducirCliente(p2);
          
        //MUEBLE 1
        mu1.setTipoMadera(mPINO);     
        mu1.setEstilo("Chino");
        mu1.setAnyoFab(this.validarFecha("01-febrero-17"));
        producto = mu1;
        producto.setNombre("Mesa 3.0");
        producto.setPrecio(75);
        servicio.introducirProducto(mu1);        
        
        //LAVADORA 1
        l1.setRevoluciones(3500);     
        l1.setCarga(80);
        producto = l1;
        producto.setNombre("Lava 3000");
        producto.setPrecio(159);
        servicio.introducirProducto(l1);
        
        //TELEVISOR 1
        t1.setPulgadas(35);
        t1.setTipo(tPLASMA);
        producto = t1;
        producto.setNombre("Telaca");   
        producto.setPrecio(450);  
        servicio.introducirProducto(t1);
        
        //INTRODUCIR UNA VENTA
        servicio.introducirVenta(2, 1, "David"); 
        
    }

}
