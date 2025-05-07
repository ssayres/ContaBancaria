public abstract class  Conta implements IConta {
// o abstract deve ser usado com inteligencia -> faz sentido alguem instanciar, fazer um new Conta ? sem tipo corrente ou poupança ? não faz, pode ser só conta
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected static final int AGENCIA_PADRAO = 1;
    protected double saldo; // se deixar como private as classes filhas nao acessam


    public Conta(){
        //Construtor padrão para a conta corrente
        this.agencia = AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;

    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double depositar) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
