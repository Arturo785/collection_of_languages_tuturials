package Generic;

public class GenericClass<T> {

    private T objeto;

    public GenericClass(T objeto){
        this.objeto = objeto;
    }

    public void imprimir(){
        System.out.println("Este es mi tipo generico que esta adentro " + this.objeto);
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
