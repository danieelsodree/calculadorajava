import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int opcao;
        String desejaRepetir;

        System.out.println("CALCULADORA BÁSICA");
        System.out.println("1- SOMA");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- MULTIPLICAÇÃO");
        System.out.println("4- DIVISÃO");
        System.out.println("0- SAIR");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        while (opcao > 0) {
            if (opcao == 1) {
                System.out.println("Você escolheu SOMA");
                System.out.print("Digite o primeiro número da soma: ");
                n1 = input.nextInt();
                System.out.print("Digite o segundo número da soma: ");
                n2 = input.nextInt();
                int nf = n1 + n2;
                System.out.println("A soma de " + n1 + " + " + n2 + " é = " + nf);

            } else if (opcao == 2) {
                System.out.println("Você escolheu SUBTRAÇÃO");
                System.out.print("Digite o primeiro número da subtração: ");
                n1 = input.nextInt();
                System.out.print("Digite o segundo número da subtração: ");
                n2 = input.nextInt();
                int nf = n1 - n2;
                System.out.println("A subtração de " + n1 + " - " + n2 + " é = " + nf);

            } else if (opcao == 3) {
                System.out.println("Você escolheu MULTIPLICAÇÃO");
                System.out.print("Digite o primeiro número da multiplicação: ");
                n1 = input.nextInt();
                System.out.print("Digite o segundo número da multiplicação: ");
                n2 = input.nextInt();
                int nf = n1 * n2;
                System.out.println("A multiplicação de " + n1 + " X " + n2 + " é = " + nf);

            } else if (opcao == 4) {
                System.out.println("Você escolheu DIVISÃO");
                System.out.print("Digite o primeiro número da divisão: ");
                n1 = input.nextInt();
                System.out.print("Digite o segundo número da divisão: ");
                n2 = input.nextInt();
                int nf = n1 / n2;
                System.out.println("A divisão de " + n1 + " / " + n2 + " é = " + nf);
            }

        break;
        }


    }
}
