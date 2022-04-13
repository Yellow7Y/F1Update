import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome");

		String nome = scanner.nextLine();

		System.out.println("Digite sobrenome");

		String sobrenome = scanner.nextLine();

		System.out.println("Digite sua idade");
		
		Double idade = scanner.nextDouble();

		System.out.print("Ola "+ nome + " "+ sobrenome + " Sua idade é: " +idade+ " Anos");

		scanner.close();
	}

}
