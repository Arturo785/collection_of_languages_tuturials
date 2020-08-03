package com.gm.mundopc;

public class Orden {

    private final int MAX_COMPUTADORAS = 10;
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;

    static {
        Orden.contadorOrdenes = 1;
    }

    public Orden() {
        this.idOrden = Orden.contadorOrdenes++;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
        this.contadorComputadoras = 0;
    }

    public void agregarComputadora(Computadora computadora){
        if(computadora != null){

            if(contadorComputadoras < MAX_COMPUTADORAS){
                computadoras[contadorComputadoras] = computadora;
                System.out.println("Computadora no: " + this.contadorComputadoras + "agregada");
                this.contadorComputadoras++;
            }

            else {
                System.out.println("Limite de computadoras alcanzado");
            }
        }
    }

    public void mostrarComputadoras(){
        for (Computadora computadora: computadoras) {
            if(computadora == null){
                continue;
            }
            System.out.println(computadora);
            System.out.println("\n");
        }
    }

    public void mostrarOrden(){
        System.out.println("No de la orden: "+ this.idOrden);

        System.out.println("Computadoras de la orden: ");
        this.mostrarComputadoras();
    }
}
