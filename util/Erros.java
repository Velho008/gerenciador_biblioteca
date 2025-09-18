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

}
