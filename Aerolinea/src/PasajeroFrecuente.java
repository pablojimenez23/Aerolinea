/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ProBook
 */
public class PasajeroFrecuente {
    private String idpasajero;
    private int puntos;

    public PasajeroFrecuente() {
    }

    public PasajeroFrecuente(String idpasajero, int puntos) {
        this.idpasajero = idpasajero;
        this.puntos = puntos;
    }

    public String getIdpasajero() {
        return idpasajero;
    }

    public void setIdpasajero(String idpasajero) {
        this.idpasajero = idpasajero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "PasajeroFrecuente{" + "idpasajero=" + idpasajero + ", puntos=" + puntos + '}';
    }

    
}
