import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero da conta:");
        int numero_conta = sc.nextInt();
        System.out.println("Digite a agência da conta:");
        String agencia_conta = sc.next();
        System.out.println("Digite o nome do titular:");
        String titular_conta = sc.next();
        System.out.println("Digite o saldo do titular:");
        double saldo_conta = sc.nextDouble();

        System.out.println("Olá " +titular_conta
                +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia_conta
                +", conta "+numero_conta
                +" e seu saldo "+saldo_conta+" já está disponível para saque");

    }
}
