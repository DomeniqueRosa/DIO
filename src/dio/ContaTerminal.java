
package dio;

import java.util.Scanner;

/**
 *
 * @author Rosa
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int numeroConta;
        String numeroAgencia;
        float saldo;

       System.out.println("Por favor, digite o numero da conta: ");
        numeroConta = sc.nextInt();
        
        System.out.println("Por favor, digite o numero da agencia: ");
        numeroAgencia = sc.next();
        
        System.out.println("Por favor, digite o nome completo: ");
        nome = sc.next();
        
        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextFloat();
        ContaBanco contaNova = new ContaBanco(numeroConta, numeroAgencia, nome, saldo);
        
        
        contaNova.mensagem();
       
        sc.close();
    }
}
