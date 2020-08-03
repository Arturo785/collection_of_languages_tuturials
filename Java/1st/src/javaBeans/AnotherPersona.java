package javaBeans;

import java.io.Serializable;

// All of this is necessary if we want the class to be a JavaBean
public class AnotherPersona implements Serializable {

    private String name;
    private String lastName;

    // A must if want class to be a JavaBeanClass
    public AnotherPersona() { }

    public AnotherPersona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //region getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //endregion


    @Override
    public String toString() {
        return "AnotherPersona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
