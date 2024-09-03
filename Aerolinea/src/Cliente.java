
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Cliente {
    private String idCliente,nombre,apellido;
    private PasajeroFrecuente pasajeroFrecuente;
    private Reserva reserva;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, String apellido, PasajeroFrecuente pasajeroFrecuente, Reserva reserva) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido=apellido;
        this.pasajeroFrecuente = pasajeroFrecuente;
        this.reserva = null; // esto es inicialmente por que el cliente no tiene reserva
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PasajeroFrecuente getPasajeroFrecuente() {
        return pasajeroFrecuente;
    }

    public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
        this.pasajeroFrecuente = pasajeroFrecuente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void mostrarDatosCliente(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("ID: "+idCliente);
        if (pasajeroFrecuente!= null) {
            System.out.println("Usted es un Cliente Frecuente");
            System.out.println("Puntos: "+pasajeroFrecuente.getPuntos());
        } else {
            System.out.println("Usted No es un Cliente Frecuente");
        }
        if (reserva!=null) {
            System.out.println("reserva: "+reserva);
        } else {
            System.out.println("Usted No tiene reserva");
        }
    }
    public void realizarReserva(Vuelo vuelo1, Vuelo vuelo2, Vuelo vuelo3){
        Scanner datos=new Scanner(System.in);
        String asiento;
        boolean reservaexitosa;
        Vuelo vueloelejido = null;
        System.out.println("Vuelos Disponibles");
        System.out.println("Vuelo 1: ID: "+vuelo1.getId()+"Origen: "+vuelo1.getOrigen()+" Destino: "+vuelo1.getDestino());
        System.out.println("Vuelo 2: ID: "+vuelo2.getId()+"Origen: "+vuelo2.getOrigen()+" Destino: "+vuelo2.getDestino());
        System.out.println("Vuelo 3: ID: "+vuelo3.getId()+"Origen: "+vuelo3.getOrigen()+" Destino: "+vuelo3.getDestino());
        int seleccionvuelo;
        do {
            System.out.println("Elija el vuelo que desee reservar: ");
            seleccionvuelo=datos.nextInt();
            if (seleccionvuelo==1)
            {
                vueloelejido=vuelo1;
            } else if(seleccionvuelo==2) 
            {
                vueloelejido=vuelo2;
            } else if(seleccionvuelo==3)
            {
                vueloelejido=vuelo3;
            }else{
                    
            }
        } while (vueloelejido==null);
        vueloelejido.mostrarDatosVuelo();
//    do {
//        System.out.println("Ingrese el asiento que desee reservar:");
//        asiento = datos.next();

       
//        if (vueloelejido.getAsientosdisponibles(asiento)) {
//            Reserva nuevaReserva = new Reserva(vueloElegido, asiento);
//            this.reserva = nuevaReserva;
//
//           
//            if (pasajeroFrecuente != null) {
//                pasajeroFrecuente.getPuntos(); 
//            }
//
//            System.out.println("Reserva realizada correctamente.");
//            reservaexitosa = true;
//        } else {
//            System.out.println("Asiento no disponible, por favor elija otro asiento.");
//        }
//    } while (!reservaexitosa);
    }
    
}
