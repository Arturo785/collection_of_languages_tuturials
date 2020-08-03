package FinalKwordExample;

//public class Empleado extends FinalPerson{ error ya que esa clase es final
public class Empleado extends HeredablePerson{

    public Empleado(){

    }
    //Just to use the method sayHello from heredableClass


    @Override
    public void sayHelloToNotFinal(String name) {
        super.sayHelloToNotFinal(name);
        System.out.println("Overriden method");
    }

    /*@Override
    public void sayHelloTo(String name) {
        super.sayHelloToNotFinal(name);
    }*/ // error because is final
}
