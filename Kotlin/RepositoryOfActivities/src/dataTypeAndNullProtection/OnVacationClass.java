package dataTypeAndNullProtection;

public class OnVacationClass {

    public String onVacationFromJava(Boolean vacation){
        return vacation? "I'm on vacation from java" : "I'm working from java";
    }

    public static String onVacationFromJavaStatic(Boolean vacation){
        return vacation? "I'm on vacation from java" : "I'm working from java";
    }
}
