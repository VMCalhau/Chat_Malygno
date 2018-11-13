import java.io.*;
import javax.swing.*;
import java.net.*;

public class Salas
{
	private ArrayList<Sala> salas;
	private int quantidade = 0;

	public Salas(){
		salas = new ArrayList<Sala>();
	}

	public Sala[] getSalas() {
		return this.salas.toArray();
	}


}