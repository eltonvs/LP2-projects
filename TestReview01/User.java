public class User {
    private String name;
    private String cpf;

    public User() {
        this.name = "";
        this.cpf = "";
    }

    public User(String _name, String _cpf) {
        this.name = _name;
        this.cpf = _cpf;
    }

    public String getName() {
        return this.name;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setCPF(String _cpf) {
        this.cpf = _cpf;
    }
}