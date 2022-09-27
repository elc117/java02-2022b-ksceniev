import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Qual a caor do seu carro");
		String corDoCArro = scan.next();
		carro.setCor(corDoCArro);
		
		System.out.println("A cor do carro é " + carro.getCor());
	}

}