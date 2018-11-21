import java.io.*;

public class CuidadoraDeUsuario extends Thread  // s� vai cuidar de receber
{
	private Usuario usuario;
	public CuidadoraDeUsuario (Socket conexao, Salas salas) throws Exception
	{
		ObjectOutputStream transmissor = new ObjectOutputStream(conexao.getOutputStream());
		ObjectInputStream receptor = new ObjectInputStream(conexao.getInputStream());
		String sala = "", nome = "";

			do
			{
				transmissor.writeString("Digite a sala: ");
				sala = receptor.read();
			}
			while ();

			transmissor.writeString("Digite seu nome de usu�rio: ");
			nome = receptor.read();
			usuario = new Usuario(conexao, transmissor, receptor, nome, );

		//   *declarar e instanciar OOS e OIS com o socket recebido
		//  *(LOOP) interagir com o usuario via OOS e OIS ate descobrir o nome da sala em que ele deseja entrar, informando sala cheia, e o nome que ele deseja usar informando nome invalido ou usado
		// (LOOP) procurar em salas (parametro) a sala com o nome desejado (FAZER ISSO ANTES DE DESCOBRIR O NOME)
		// instanciar 1 usuario fornecendo conexao, OOS, OIS, nome e sala
		// incluir o usuario na sala
		// N�O ir pro pr�ximo coment�rio antes de concluir o atual
		// fazer varias vezes this.usuario.envia (new AvisoDeEntradaNaSala(i)), onde i � o nome de algum usuario que j� estava na sala
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
			// enquanto n�o for pedido vai ser mensagem
			// recebe aviso de entrada e saida e mensagens
		}
		while (!(recebido instanceof PedidoParaSairDaSala));

		// remover this.usuario da sala
		// mandar new AvisoDeSaidaDaSala(this.usuario.getNome()) para todos da sala
		this.usuario.fechaTudo();
	}
}