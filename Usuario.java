import java.io.*;
import java.net.*;
public class Usuario
{
	private Socket conexao;
	private ObjectOutputStream transmissor;    // ou ObjectIn/OutputStream
	private ObjectInputStream receptor;
	private String nome;
	private Sala sala; // construtor manda salas disponiveis e coloca ele na sala

	public String getNome()
	{
		return this.nome;
	}

	public void envia(Enviavel x)
	{

	}

	public Enviavel recebe()
	{

	}

	public void fechaTudo()
	{
		this.transmissor.close();
		this.receptor.close();
		this.conexao.close();
	}


	//enviar msg, receber,

	public Usuario (Socket con, ObjectOutputStream transmissor, ObjectInputStream receptor, String nome,Sala sala) throws Exception
	{
		// validar parametros
		// instanciar PrintWriter e BufferedReader
		// mandar todos nomes de salas
		// guardar parametros nos atributos
	}
}