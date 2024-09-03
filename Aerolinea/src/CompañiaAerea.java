/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class CompañiaAerea {
    private String idCompañia,nombre,vuelos;

    public CompañiaAerea() {
    }

    public CompañiaAerea(String idCompañia, String nombre, String vuelos) {
        this.idCompañia = idCompañia;
        this.nombre = nombre;
        this.vuelos = vuelos;
    }

    public String getIdCompañia() {
        return idCompañia;
    }

    public void setIdCompañia(String idCompania) {
        this.idCompañia = idCompañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelos() {
        return vuelos;
    }

    public void setVuelos(String vuelos) {
        this.vuelos = vuelos;
    }

    public void mostrarDatosCompañia(){
        System.out.println("ID: "+idCompañia);
        System.out.println("Nombre: "+nombre);
        System.out.println("Vuelos: "+vuelos);
    }
    
}
