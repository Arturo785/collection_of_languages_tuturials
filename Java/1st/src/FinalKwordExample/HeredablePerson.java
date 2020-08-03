package FinalKwordExample;

public class HeredablePerson {

    public HeredablePerson() {
    }

    public final void sayHelloTo(String name){
        System.out.println("Hello :" + name);
    }

    public void sayHelloToNotFinal(String name){
        System.out.println("Hello not final:" + name);
    }



}
