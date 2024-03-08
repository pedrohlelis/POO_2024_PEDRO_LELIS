public class Conta {
    private String nomeTitular;
    private String numero;
    private double saldo;

    public Conta() {
        saldo = 0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        try{
            this.saldo += valor;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean sacar(double valor){
        try {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            }else{
                System.out.println("Voce nao possui saldo suficiente para sacar esse valor.");
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}
