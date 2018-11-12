public class CuidadoraDeUsuario extends Thread  // só vai cuidar de receber
{
	private Usuario usuario;

	public CuidadoraDeUsuario (Socket conexao, Salas salas) throws Exception
	{
		// declarar e instanciar OOS e OIS com o socket recebido
		// (LOOP) interagir com o usuario via OOS e OIS ate descobrir o nome da sala em que ele deseja entrar, informando sala cheia, e o nome que ele deseja usar informando nome invalido ou usado
		// procurar em salas (parametro) a sala com o nome desejado (FAZER ISSO ANTES DE DESCOBRIR O NOME)
		// instanciar 1 usuario fornecendo conexao, OOS, OIS, nome e sala
		// incluir o usuario na sala
		// NÃO ir pro próximo comentário antes de concluir o atual
		// fazer varias vezes this.usuario.envia (new AvisoDeEntradaNaSala(i)), onde i é o nome de algum usuario que já estava na sala
		// enviar para todos os usuarios da sala new AvisoDeEntradaNaSala(usuario.getNome())
		// incluir o usuario na sala
	}

	public void run()
	{
		// RECEBE PEDIDOS DE SAIR DA SALA OU MENSAGEM
		Enviavel recebido = null;
		do
		{
			// recebe o enviavel
			// enquanto não for pedido vai ser mensagem
			// recebe aviso de entrada e saida e mensagens
		}
		while (!(recebido instanceof PedidoParaSairDaSala));

		// remover this.usuario da sala
		// mandar new AvisoDeSaidaDaSala(this.usuario.getNome()) para todos da sala
		this.usuario.fechaTudo();
	}
}