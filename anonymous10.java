import java.util.Scanner;

public class anonymous10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Graus em celsius");
        Double C = scanner.nextDouble();

        Double divi = ((C*1.8+32));

        System.out.println("Temperatura em F é de :"+divi);

        scanner.close();
}
}
