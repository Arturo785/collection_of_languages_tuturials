package clases;

import java.util.Objects;

public class Persona {
    private String name;
    private int age;

    public Persona(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Persona(){ }

    //region Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //endregion

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return age == persona.age &&
                Objects.equals(name, persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
