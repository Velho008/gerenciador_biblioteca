package util.erros;

/**
 * Exceção lançada quando um número está fora do intervalo permitido.
 */

public class NumeroForaDoIntervaloException extends RuntimeException 
{
    public NumeroForaDoIntervaloException(String mensagem)
    {
        super(mensagem);
    }
}
