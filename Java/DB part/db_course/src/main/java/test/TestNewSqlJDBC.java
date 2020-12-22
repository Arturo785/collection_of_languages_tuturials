package test;

import test.db.PersonaDAO;
import test.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class TestNewSqlJDBC {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        List<Persona> personsRetrieved;

        Persona persona1 = new Persona(4,"Changed", "update", "bbc@aa", "12541");
       // System.out.println(personaDAO.insertPerson(persona1));
        System.out.println(personaDAO.deletePerson(persona1.getIdPersona()));

        personsRetrieved = personaDAO.getAllPersons();

        personsRetrieved.forEach(System.out::println);

    }


}
