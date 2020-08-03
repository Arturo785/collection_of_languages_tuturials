package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{

    private final int idTeclado;
    private static int contadorTeclados;

    static {
        contadorTeclados = 1;
    }

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca); // calls the constructor from the parent class
        this.idTeclado = Teclado.contadorTeclados;
        Teclado.contadorTeclados++;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                '}'+
                "Numero de teclados creados "+ Teclado.contadorTeclados +  "\n" +
                "Dispositivo" + super.toString();
    }
}
