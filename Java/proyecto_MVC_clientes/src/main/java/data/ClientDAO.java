package data;

import beans.Client;

import java.util.List;

public interface ClientDAO {

    List<Client> listClients();
    Client findClient(int idClient);
    int insertClient(Client clientToInsert);
    int updateClient(Client clientToUpdate);
    int deleteClient(int idClient);


}
