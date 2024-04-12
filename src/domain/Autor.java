package domain;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do autor:\n" +
                "Nome : " + nome + "\n" +
                "Email : '" + email + "\n" +
                "CPF : " + cpf + "\n");
    }
}
