package Collections;

import java.util.*;

public class collectionsMain {

    public static void main(String[] args) {
        //Lista: ordenada, repite objectos
        List lista = new ArrayList();

        lista.add("aaaa");
        lista.add(23);
        lista.add(22.5);

        imprimir(lista);

        //Set no ordenado, no repite objetos
        Set set = new HashSet();
        set.add("100");
        set.add("200");
        set.add("100");
        set.add(300);

        imprimir(set);

        //Map: diccionario

        Map mapa = new HashMap();
        mapa.put("llave1",1);
        mapa.put("llave2",2);
        mapa.put("llave3",3);

        imprimir(mapa.entrySet()); // imprime todo
        imprimir(mapa.keySet()); // imprime llaves
        imprimir(mapa.values()); // imprime valor

        mapa.get("llave3"); // busca el valor


    }

    public static void imprimir(Collection collection){
        collection.forEach( element -> {
            System.out.println(element);
        });
    }
}
