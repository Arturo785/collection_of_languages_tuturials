package Generic;

import clases.Persona;

import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        GenericClass<String> objetoStr = new GenericClass<>("holaaa");
        GenericClass<Integer> objetoint = new GenericClass<>(25);
        GenericClass<Persona> objetoPersona = new GenericClass<>(new Persona("Jorge",22));

        objetoStr.imprimir();
        objetoint.imprimir();
        objetoPersona.imprimir();

       // objetoint.setObjeto("ddd"); // no acepta cambio de tipo cuando ya se hace



    }

    public static <T> void printListsContennt (List<T> collection){
        for (T element: collection) {
            System.out.println("The inside is:" + element);
        }
    }
}
