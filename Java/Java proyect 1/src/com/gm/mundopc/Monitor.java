package com.gm.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    static {
        contadorMonitores = 1;
    }

    private Monitor(){
        idMonitor = Monitor.contadorMonitores++;
    }

    public Monitor(String marca, double tamano){
        this();// calls the private constructor
        this.marca = marca;
        this.tamano = tamano;
    }

    // region getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }


    //endregion


    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamano=" + tamano +
                '}' +
                "numero de monitores creados " + Monitor.contadorMonitores
                + "\n";
    }
}
