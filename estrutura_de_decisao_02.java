import java.util.Scanner;

/*
Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.
Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial
do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).

Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
 ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
 seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
No final, mostre de quanto será o prêmio desse funcionário(a).
 */

public class estrutura_de_decisao_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("POR FAVOR, INFORME O FATURAMENTO ANUAL DA EMPRESA: ");
        Double faturamento_anual = scanner.nextDouble();
        System.out.print("AGORA INFORME QUAL O FATURAMENTO REAL DA EMPRESA DOS ÚLTIMOS 12 MESES: ");
        Double faturamento_real = scanner.nextDouble();
        System.out.print("´POR ÚLTIMO, QUAL SUA MÉDIA SALARIAL?");
        Double media_salarial = scanner.nextDouble();
        Double oitenta_por_cento_da_media = (faturamento_anual * 80) / 100;
        Boolean bateu_a_meta = faturamento_real >= faturamento_anual;
        Boolean faturouPeloMenosOitentaPorCento = faturamento_real >= oitenta_por_cento_da_media;
        boolean resultadoParaBonus = false;
        if (resultadoParaBonus) {
            Double resultado_para_bonus = media_salarial * 2;
            System.out.println("PARABÉNS, VOCÊ VAI GANHAR UM BÔNUS DE " + resultado_para_bonus);
        }
        else if (faturouPeloMenosOitentaPorCento) { 
            Double oitentaPorCentoDaMediaSalarial = (media_salarial * 80) / 100; 
            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
        }
            else {
           System.out.println("INFELIZMEMTE, VOCÊ NÃO RECEBERÁ AUMENTO!");
            scanner.close();
        }
    }
}