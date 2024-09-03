/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class Vuelo {
    private String id,origen,destino,asientosdisponibles;

    public Vuelo() {
        this.asientosdisponibles="";
    }

    public Vuelo(String id, String origen, String destino, String asientosdisponibles) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.asientosdisponibles = asientosdisponibles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsientosdisponibles() {
        return asientosdisponibles;
    }

    public void setAsientosdisponibles(String asientosdisponibles) {
        this.asientosdisponibles = asientosdisponibles;
    }
    
    public void mostrarDatosVuelo(){
        System.out.println("ID: "+id);
        System.out.println("Origen: "+origen);
        System.out.println("Destino: "+destino);
        System.out.println("Asientos disponibles: "+asientosdisponibles);
    }
}
