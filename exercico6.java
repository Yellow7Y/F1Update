import java.util.Scanner;
public class exercico6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pi = Math.PI;

        System.out.println("Digite um raio de um circulo");
        Double raio = scanner.nextDouble();

        

        Double resultado = (pi*raio*raio);

        System.out.println("raios multiplicados" +resultado);

        scanner.close();

    }
}
