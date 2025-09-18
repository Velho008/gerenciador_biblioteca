package util;

import java.util.Scanner;

import util.Erros.NumeroForaDoIntervaloException;

public class InputHandler 
{
    public static int receberInt(String mensagem, Scanner scanner)
    {
        while(true)
        {
            try
            {
                System.out.println(mensagem);
                int numero = Integer.parseInt(scanner.nextLine().trim());
                return (numero);
            }catch(NumberFormatException e)
            {
                System.out.println("Erro: digite um numero para prosseguir");
            }
        }
    }

    public static int receberIntIntervalo(String mensagem, Scanner scanner, int min, int max)
    {
        while(true)
        {
            try
            {
                System.out.println(mensagem);
                int numero = Integer.parseInt(scanner.nextLine().trim());
                if (numero < min || numero > max)
                {
                    throw new Erros.NumeroForaDoIntervaloException("Numero fora do intervalo esperado ("+min+"-"+max+")");
                }
                return (numero);
            }catch(NumberFormatException e)
            {
                System.out.println("Erro: digite um numero para prosseguir");
            }catch(NumeroForaDoIntervaloException e)
            {
                System.out.println("Erro: "+e.getMessage());
            }
        }
    }
}
