package chat;
import java.io.*;
import java.net.*;
public class Usuario
{
	private Socket conexao;
	private PrintWriter transmissor;    // ou ObjectIn/OutputStream
	private BufferedReader receptor;
	private String nome;
	private Sala sala; // construtor manda salas disponiveis e coloca ele na sala

	public String getNome()
	{
		return this.nome;
	}

	public void envia()
	{

	}

	public void recebe()
	{

	}


	//enviar msg, receber,

	public Usuario (Socket con, PrintWriter transmissor, BufferedReader receptor, String nome,Sala sala) throws Exception
	{
		// validar parametros
		// instanciar PrintWriter e BufferedReader
		// mandar todos nomes de salas
		// guardar parametros nos atributos
	}
}