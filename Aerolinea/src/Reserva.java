/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Reserva {
    private Vuelo vuelo;
    private String asientoreservado;

    public Reserva() {
    }

    public Reserva(Vuelo vuelo, String asientoreservado) {
        this.vuelo = vuelo;
        this.asientoreservado = asientoreservado;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getAsientoreservado() {
        return asientoreservado;
    }

    public void setAsientoreservado(String asientoreservado) {
        this.asientoreservado = asientoreservado;
    }

    public void mostrarDatosReserva(){
        if (vuelo!=null){
            vuelo.mostrarDatosVuelo();
        } else {
            System.out.println("Vuelo no Disponible");
        }
        System.out.println("Asiento Reservado: "+asientoreservado);
    }
    
    
}
