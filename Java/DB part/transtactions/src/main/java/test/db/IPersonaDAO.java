package test.db;

import test.models.Persona;

import java.sql.SQLException;
import java.util.List;

public interface IPersonaDAO {

    int insert(Persona persona) throws SQLException;

    List<Persona> select() throws SQLException;

    int update(Persona persona) throws SQLException;

    int delete(int idPersona)throws SQLException;

}
