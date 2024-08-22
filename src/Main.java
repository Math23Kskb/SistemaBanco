public class Main {
    public static void main(String[] args) {

        Cliente matheos = new Cliente();
        matheos.setNomeCliente("Matheos");

        Conta cc = new ContaCorrente(matheos);
        Conta cp = new ContaPoupanca(matheos);

        Banco banco = new Banco();
        banco.setNome("Meu banco");
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}