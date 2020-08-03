package clases;

public class Caja {

    private int alto;
    private int ancho;
    private int profundo;

    public Caja() {
    }

    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    // region getters and setters
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    // endregion

    public double getVolume(){
        return this.alto * this.ancho * this.profundo;
    }
}
