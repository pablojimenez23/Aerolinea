
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Prueba {
    public static void main(String[] args) {
        CompañiaAerea ca1= new CompañiaAerea("22222", "LAN", "V01");
        Vuelo vuelo1= new Vuelo("V01", "Mexico", "España", "A1, A2, A3, A4, A5");
        Vuelo vuelo2= new Vuelo("V02", "Chicago", "Chile", "A1, A2, A3, A4, A5");
        Vuelo vuelo3= new Vuelo("V03", "Brazil", "Holanda", "A1, A2, A3, A4, A5");
        PasajeroFrecuente vip1 = new PasajeroFrecuente("VIP1", 50);
        Cliente cliente1= new Cliente("VIP1", "Raul", "Rojas", vip1, null);
        Reserva reserva1 = new Reserva(vuelo3, "A3");
        int opcion;
        Scanner teclado=new Scanner(System.in);
        do {    
            System.out.println("MENU");
            System.out.println("(1) Mostrar Datos");
            System.out.println("(2) Buscar Vuelos");
            System.out.println("(3) Mostrar Reserva");
            System.out.println("(4) Realizar Reserva");
            System.out.println("(5) Detalles Compañias");
            System.out.println("(6) Salir");
            opcion=teclado.nextInt();
            switch (opcion) {
                case 1:
                    cliente1.mostrarDatosCliente();
                    break;
                case 2:
                    System.out.println("Estos son los vuelos disponibles");
                    vuelo1.mostrarDatosVuelo();
                    vuelo2.mostrarDatosVuelo();
                    vuelo3.mostrarDatosVuelo();
                case 3:
                    if (cliente1.getReserva()!=null) {
                        cliente1.getReserva().mostrarDatosReserva();
                    } else {
                        System.out.println("Usted no tiene reserva");
                    }
                case 4:
                    cliente1.realizarReserva(vuelo1, vuelo2, vuelo3);
                    break;
                case 5:
                    ca1.mostrarDatosCompañia();
                    break;
                default:
                    System.out.println("Programa finalizado");
            }
        } while (opcion!=6);
    }
}
