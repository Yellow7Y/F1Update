import java.util.Scanner;

public class lkasd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu nome: ");
        String nome  = scanner.next();
        System.out.println("Digite seu cpf");
        Integer cpf = scanner.nextInt();
        System.out.println("Digite sua data de nascimento sem (/)");
        Integer data = scanner.nextInt();

        System.out.println("Seu nome é: "+ nome);
        System.out.println("Seu cpf é:  "+ cpf);
        System.out.println("Sua data de nascimento é: "+ data);

        System.out.println("Caso esteja tudo certo digite 1 para confirmar ou 2 para corrigir");
        Double escolha = scanner.nextDouble();

        if(escolha == 1){
            System.out.println("Registro feito com sucesso agora aguarde 3 dias para confirmacao(MUITO OBRIGADO POR ABRIR CONTA NA LKBANK)");
        }
        if(escolha == 2){
            System.out.println("Oque voce errou escolha abaixo o numero");
            System.out.println("(1) CPF");
            System.out.println("(2) Nome");
            System.out.println("(3) Data");
            Double opcao = scanner.nextDouble();
            if(opcao == 2){
                System.out.println("Corriga seu nome aqui: ");
                String novovome = scanner.next();
                System.out.println("Confirme seu nome aqui se estiver tudo correto digite 1 para concluir: " + novovome);
                Double concluido = scanner.nextDouble();
                if(concluido == 1){
                    System.out.println("Registro feito com sucesso agora aguarde 3 dias para confirmacao(MUITO OBRIGADO POR ABRIR CONTA NA LKBANK");
                }
            }


            if(opcao == 1){
                System.out.println("Digite seu cpf novo:");
                Integer novocpf = scanner.nextInt();
                System.out.println("Seu novo cpf é: " + novocpf);
                System.out.println("confirme se esta tudo correto abaixo");
                System.out.println("Seu cpf é:" + novocpf);
                System.out.println("Seu nome: " + nome);
                System.out.println("sua data de nascimento é: " + data);
                System.out.println("Caso esteja tudo certo digite 1 para concluir");
                Double opcao2 = scanner.nextDouble();
                if(opcao2 == 1){
                System.out.println("Registro feito com sucesso agora aguarde 3 dias para confirmacao(MUITO OBRIGADO POR ABRIR CONTA NA LKBANK)");

                scanner.close();
                }
            }
        }
    }
}
