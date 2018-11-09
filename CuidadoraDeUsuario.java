public class CuidadoraDeUsuario extends Thread  // só vai cuidar de receber
{
	private Usuario usuario;

	public CuidadoraDeUsuario (Socket conexao, Salas salas) throws Exception
	{
		// declarar e instanciar PrintWriter e BufferedReader com o socket recebido
		// (LOOP) interagir com o usuario via PW e BR para descobrir o nome da sala em que ele deseja entrar, informando sala cheia, e o nome que ele deseja usar informando nome invalido ou usado
		// procurar em salas (parametro) a sala com o nome desejado (FAZER ISSO ANTES DE DESCOBRIR O NOME)
		// instanciar 1 usuario fornecendo conexao, PW, BR, nome e sala
		// incluir o usuario na sala
		// NÃO ir pro próximo comentário antes de concluir o atual
	}
}