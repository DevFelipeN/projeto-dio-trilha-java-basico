import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Informe o numero da agência: ");
        int numero = scanner.nextInt();
        System.out.println("Informe a agência: ");
        String agencia = scanner.next();
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.next(); 
        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu "+saldo+" já está disponível para saque");

        
    }
}
