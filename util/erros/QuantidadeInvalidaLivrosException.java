package util.erros;

/**
 * Exceção lançada quando a quantidade de livros é inválida.
 */

public class QuantidadeInvalidaLivrosException extends RuntimeException 
{
    public QuantidadeInvalidaLivrosException(String mensagem)
    {
        super(mensagem);
    }
}
