package util;

import java.util.Scanner;

import util.erros.*;

/**
 * Classe utilitária para lidar com entrada de dados via console.
 * Fornece métodos seguros para receber números inteiros,
 * com ou sem restrição de intervalo.
 *
 * Esta classe não deve ser instanciada.
 */

public final class InputHandler 
{
    // Construtor privado para impedir instância
    private InputHandler()
    {
        throw new UnsupportedOperationException("ERRO: Classe utilitária não deve ser instanciada.");
    }

    // Solicita ao usuario um numero inteiro
    public static int receberInt(final String mensagem, final Scanner scanner)
    {
        while(true)
        {
            System.out.println(mensagem+" ");
            final String entrada = scanner.nextLine().trim();

            try
            {
                return Integer.parseInt(entrada);
            }catch(NumberFormatException e)
            {
                System.out.println("ERRO: digite um numero inteiro para prosseguir");
            }
        }
    }

    // Solicita ao usuario um numero inteiro valido dentro de um intervalo
    public static int receberIntIntervalo(final String mensagem, final Scanner scanner, final int min, final int max)
    {
        while(true)
        {
            final int numero = receberInt(mensagem + String.format(" (%d-%d): ", min, max), scanner);

            try
            {
                if (numero < min || numero > max)
                {
                    throw new NumeroForaDoIntervaloException(String.format("Numero fora do intervalo esperado (%d-%d)",min,max));
                }

                return numero;
            }catch(NumeroForaDoIntervaloException e)
            {
                System.out.println("ERRO: "+e.getMessage());
            }
        }
    }
}
