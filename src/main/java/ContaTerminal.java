import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Britto's");
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua agência:");
        String agencia = scanner.nextLine();
        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
