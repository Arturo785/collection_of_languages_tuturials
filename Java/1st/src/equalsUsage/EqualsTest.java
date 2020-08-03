package equalsUsage;

import clases.Persona;

public class EqualsTest {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jorge",21);
        Persona persona2 = new Persona("Jorge",21);

        //comparara referencias de memoria
        /*if(persona1 == persona2){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }*/

        // compara objetos y su contenido solo si sobreEscribo su metodo equals
        if(persona1.equals(persona2)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }

        // compara objetos y su contenido solo si sobreEscribo su metodo hash
        if(persona1.hashCode() == persona2.hashCode()){
            System.out.println("Son iguales en hash");
        }
        else {
            System.out.println("No son iguales en hash");
        }

    }
}
