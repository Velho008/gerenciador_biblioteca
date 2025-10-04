package util;

import util.erros.*;

/**
 * Classe utilitária responsável por centralizar regras de negócio e validações.
 * Fornece métodos estáticos para validação de idade e quantidade de livros.
 *
 * Esta classe não deve ser instanciada.
 */

public final class Regras
{

    /** Quantidade máxima de livros permitida por usuário. */
    private static final int MAX_LIVROS = 5;

    // Construtor privado para evitar instância
    private Regras() 
    {
        throw new UnsupportedOperationException("ERRO: Classe utilitária não deve ser instanciada.");
    }

    // verifica se a mudança na quantidade de livros é valida
    public static void verificarMudancaLivros(final int atual, final int mudanca) throws QuantidadeInvalidaLivrosException
    {
        final int quantidadePosMudanca = atual + mudanca;

        if (quantidadePosMudanca < 0 )
        {
            throw new QuantidadeInvalidaLivrosException(String.format("ERRO: quantidade invalida, o numero de livros não pode ser menor que 0."));
        }
        if (quantidadePosMudanca > MAX_LIVROS)
        {
            throw new QuantidadeInvalidaLivrosException(String.format("ERRO: quantidade invalida, o numero de livros não pode exceder %d.", MAX_LIVROS));
        }
    }

    //verifica se um numero de livros cabe no total
    public static void verificarQuantidadeLivros(final int quantidade) throws QuantidadeInvalidaLivrosException
    {
        verificarMudancaLivros(quantidade, 0);
    }

    //verifica se a idade atende aos requisitos
    public static void verificarIdade(final int minima, final int atual) throws IdadeInvalidaException
    {
        if (atual < minima)
        {
            final String mensagem;

            switch (minima)
            {
                case 0:
                    mensagem = " a idade não pode ser menor do que zero";
                    break;
            
                case 18:
                    mensagem = " o usuario não pode ser menor de idade";
                    break;
                    
                default:
                    mensagem = String.format(" a idade minima exigida é: %d", minima);
                    break;
            }

            throw new IdadeInvalidaException("ERRO: idade invalida"+mensagem);
        }
    }
}