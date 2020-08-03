package mundopc;

import com.gm.mundopc.*;


public class MundoPc {

    public static void main(String[] args) {
        var quantity = 10;

        /*var mouses = makeMouses(quantity);
        var keyboards = makeKeyboards(quantity);
        var monitors = makeMonitors(quantity);

        var computers = makeComputers(quantity,monitors,mouses,keyboards);

        Orden myOrder = new Orden();
        Orden myOrder2 = new Orden();


        myOrder.agregarComputadora(computers[0]);

        myOrder.mostrarOrden();

        myOrder2.agregarComputadora(computers[4]);

        myOrder2.mostrarOrden();*/

        Monitor monitorGamer = new Monitor("Gamer",34);
        Teclado tecladoGamer = new Teclado("Bluetooth","gamer");
        Raton ratonGamer = new Raton("Bluetooth","gamer");
        Computadora computadoraGamer = new Computadora("Computadora gamer",
                                        monitorGamer,
                                        tecladoGamer,
                                        ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraGamer);

        orden1.mostrarComputadoras();

    }

    public static Raton[] makeMouses(int quantity){
        Raton[] objects = new Raton[quantity];
        String input = "entrada raton: ";
        String marca = "marca raton: ";
        for (int i = 0; i < quantity; i++){
            Raton mouse = new Raton(input+i, marca+i);
            objects[i]= mouse;
        }

        return objects;
    }

    public static Teclado[] makeKeyboards(int quantity){
        Teclado[] objects = new Teclado[quantity];
        String input = "entrada teclado: ";
        String marca = "marca teclado: ";
        for (int i = 0; i < quantity; i++){
            Teclado objectToFill = new Teclado(input+i, marca+i);
            objects[i]= objectToFill;
        }

        return objects;
    }

    public static Monitor[] makeMonitors(int quantity){
        Monitor[] objects = new Monitor[quantity];

        for (int i = 0; i < quantity; i++){
            Monitor objectToFill = new Monitor("Marca monitor" +i, 20);
            objects[i]= objectToFill;
        }

        return objects;
    }

    public static Computadora[]
    makeComputers(int quantity, Monitor[] monitors, Raton[] mouses, Teclado[] keyboards){

        Computadora[] objects = new Computadora[quantity];
        for (int i = 0; i < quantity; i++){
            Computadora objectToFill = new Computadora(
                    "nombre compu"+ i,
                    monitors[i],
                    keyboards[i],
                    mouses[i]
                    );
            objects[i]= objectToFill;
        }
        return objects;
    }
}
