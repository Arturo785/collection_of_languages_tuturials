package lambdas;

public interface ILambdaTest {

    int abstractFun(int param2);

    // A non-abstract (or default) function
    default int normalFun()
    {
        System.out.println("Hello");
        return 2+2;
    }
}
