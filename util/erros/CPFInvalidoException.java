package util.erros;

//ERRO gerado quando o usuario inserir um cpf invalido
public class CPFInvalidoException  extends RuntimeException
{
    public CPFInvalidoException(String mensagem)
    {
        super(mensagem);
    }
}
