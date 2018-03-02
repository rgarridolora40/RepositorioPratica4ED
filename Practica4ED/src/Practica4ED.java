import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica4ED
{
	// Soy Felix y te estoy dejando un comentario :D
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int numero1, numero2, comodin;
		
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("dame el número 1: ");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número 2: ");
		numero2 = Integer.parseInt(lectura.readLine());
		
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
	}
	//Comentario realizado a través de commit.
}
