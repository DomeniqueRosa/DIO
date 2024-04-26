
package dio;


/**
 *
 * @author Rosa
 */
public class ContaBanco {

    private int numero_conta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

     ContaBanco(int numeroConta, String numeroAgencia, String nome, float saldo) {
        this.numero_conta = numeroConta;
        this.agencia = numeroAgencia;
        this.nomeCliente = nome;
        this.saldo = saldo;
    }
    
    public void mensagem() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, numero_conta, saldo);
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
