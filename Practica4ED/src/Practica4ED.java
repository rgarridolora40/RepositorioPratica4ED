import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica4ED
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int numero1, numero2, comodin;
		
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("dame el n�mero 1: ");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Dame el n�mero 2: ");
		numero2 = Integer.parseInt(lectura.readLine());
		
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
	}
	//Comentario realizado a trav�s de commit.
}