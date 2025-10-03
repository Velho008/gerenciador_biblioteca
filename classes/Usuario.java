package classes;

import util.Regras;
import util.erros.*;

public class Usuario 
{
    private final String nome;
    private final String CPF;
    private int idade;
    private int livros;
    
    public Usuario(String nome, String CPF, int idade, int livros)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.livros = livros;
    }

    public Usuario(String nome, String CPF, int idade)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.livros = 0;
    }

    //getters e setters
    public String getNome()
    {
        return this.nome;
    }
    public String getCPF()
    {
        return this.CPF;
    }
    public int getIdade()
    {
        return this.idade;
    }
    public int getLivros()
    {
        return this.livros;
    }

    public void setIdade(int idade)
    {
        try
        {
            Regras.verificarIdade(0, idade);
            this.idade = idade;
        }
        catch(IdadeInvalidaException e )
        {
            System.out.println(e.getMessage());
        }
    }
    public void setLivros(int livros)
    {
        this.livros = livros;
    }

    public void AddLivros(int quantidade)
    {
        this.livros+=quantidade;
    }
    public void RemoveLivros(int quantidade)
    {
        this.livros-=quantidade;
    }
    public void AddLivro()
    {
        AddLivros(1);
    }
    public void RemoverLivro()
    {
        RemoveLivros(1);
    }
}
