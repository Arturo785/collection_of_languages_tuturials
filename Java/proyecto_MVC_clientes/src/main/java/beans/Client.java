package beans;

public class Client {

    private int idClient;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private double amount;


    public Client(){

    }

    public Client(int idClient, String name, String lastname, String email, String phone, double amount) {
        this.idClient = idClient;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
    }

    public Client(String name, String lastname, String email, String phone, double amount) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", amount=" + amount +
                '}';
    }
}
