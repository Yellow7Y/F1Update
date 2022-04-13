import java.util.Scanner;

public class exer9 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a temperatura em graus Fahrenheit");
        Double F =scanner.nextDouble();



        Double divi = (F-32)*5/9;   

        System.out.println("A temperatura em F para Graus Celsius é: "+divi);






        scanner.close();

        
}
}
