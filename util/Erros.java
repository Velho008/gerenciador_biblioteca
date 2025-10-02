package util;

public class Erros
{
    public static class NumeroForaDoIntervaloException extends Exception 
    {
        public NumeroForaDoIntervaloException(String mensagem)
        {
            super(mensagem);
        }
    }
    public static class IdadeInvalidaException extends Exception
    {
        public IdadeInvalidaException(String mensagem)
        {
            super(mensagem);
        }
    }

}
