package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    static {
        contadorRatones = 1;
    }

    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca); // calls the constructor from the parent class
        this.idRaton = Raton.contadorRatones;
        Raton.contadorRatones++;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "numero de ratones creados: "+ Raton.contadorRatones +
                '}' + "\n" +
                "Dispositivo" + super.toString();
    }
}
