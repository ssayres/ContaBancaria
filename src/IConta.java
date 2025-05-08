public interface IConta {

    //classe abstrata com os métodos abstratos
    // todo metodo em interface é publico

     void sacar(double valor); // parametro -> quem saca, saca algo-> precisa de valor

     void depositar(double depositar);

     void transferir(double valor, Conta contaDestino); // quem transfere, transfere alguma coisa, pra algum lugar

     void imprimirExtrato();




}
