package domain;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    public Livro(String nome, String descricao, double valor, String isbn, Autor autor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro:\n" +
                "Nome : " + nome + "\n" +
                "Descrição : " + descricao + "\n" +
                "Valor : R$ " + valor  + "\n" +
                "ISBN : " + isbn + "\n");
        if (temAutor()){
            autor.mostrarDetalhes();
        }
        else{
            System.out.println("Sem autor.\n");
        }
    }
    public double aplicaDesconto(double porcentagem){
        return this.valor -= this.valor * porcentagem;
    }
    public boolean temAutor(){
        boolean naoNulo = this.autor != null;
        return naoNulo;
    }
}
