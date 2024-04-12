package application;

import domain.Autor;
import domain.Livro;

import java.text.DecimalFormat;

public class Program {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Autor autor1 = new Autor("Luiz Duarte", "luizduarte@gmail.com", "123.456.789-90");
        Autor autor2 = new Autor("Alfredo Goldman", "alfredogoldman@gmail.com", "987.654.321-10");
        Livro livro1 = new Livro("Java Para Iniciantes", "Aprenda rapidamente os fundamentos de programação com Java", 105.68, "8582603363", autor1);
        Livro livro2 = new Livro("Introdução à Ciência da Computação com Java", "Consolidar o alicerce de computação com Java", 92.37, "7684884835", autor2);

        livro1.mostrarDetalhes();
        System.out.println("Valor com desconto : R$ " + df.format(livro1.aplicaDesconto(0.05)) + "\n");
        livro2.mostrarDetalhes();
        System.out.println("Valor com desconto : R$ " + df.format(livro2.aplicaDesconto(0.12)));

    }
}