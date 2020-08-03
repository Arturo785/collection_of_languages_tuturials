package secondexample;

public class myTestMain {

    public static void main(String[] args) {
        IAccesoDatos datosSql = new ImplementacionSQL();
        IAccesoDatos datosoracle = new ImplementacionOracle();
        ImplementacionSQL datosSql2 = new ImplementacionSQL();
        ImplementacionOracle datosoracle2 = new ImplementacionOracle();

        receiveImpl(datosSql);
        receiveImpl(datosSql2);
        receiveImpl(datosoracle);
        receiveImpl(datosoracle2);
    }

    public static void receiveImpl(IAccesoDatos datos){
        datos.listar();
        //Do stuff
    }
}
