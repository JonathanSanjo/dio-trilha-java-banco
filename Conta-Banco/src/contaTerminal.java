import java.util.Scanner;
import java.util.Locale;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, Digite o seu nome: ");
          String nome = scanner.next();

        System.out.println("Por Favor, Digite o número da sua Agência: ");
          String agencia = scanner.next();

        System.out.println("Por Favor, Digite o número da sua Conta: ");
          int conta = scanner.nextInt();
        
        System.out.println("Por Favor, Digite o Saldo da sua Conta: ");
          double saldo = scanner.nextDouble();



        System.out.println(" Olá " + nome + " Bem vindo a sua conta, o número da sua Agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque " );
    }
}
