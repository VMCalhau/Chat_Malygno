package chat;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class Salas extends Thread
{
	private ArrayList<Sala> salas;
	/*protected ServerSocket server;
	protected Socket conexao;*/

	/*public Salas (Socket c)
	{
		this.conexao = c;
	}

	public static void main(String[] args)
	{
		try
		{
			server = new ServerSocket(12345);

			for (;;)
			{
			    conexao = server.accept();
				Thread t = new Salas(conexao);
				t.start();
			}
		}
		catch (Exception e)
		{}
	}*/
}