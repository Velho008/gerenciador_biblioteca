package util;

import util.Erros;
import util.Erros.IdadeInvalidaException;

public class Regras 
{
    public static void VerificarIdade(int minima, int atual) throws IdadeInvalidaException
    {
        if (atual < minima)
        {
            String mensagem = ".";

            if (minima == 0)
            {
                mensagem = " não pode ser negativa.";
            }
            else if (minima == 18)
            {
                mensagem = " não pode ser menor de idade.";
            }
            throw new IdadeInvalidaException("ERRO: idade invalida"+mensagem);
        }
    }
}
