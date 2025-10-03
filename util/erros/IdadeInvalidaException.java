package util.erros;

/**
 * Exceção lançada quando a quantidade de livros é inválida.
 */

public class IdadeInvalidaException extends RuntimeException
{
    public IdadeInvalidaException(String mensagem)
    {
        super(mensagem);
    }    
}
