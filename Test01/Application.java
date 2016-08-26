public class Application {
    public static void main(String[] args) {
        Banco b = new Banco();

        // Criar ContaCorrente
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();

        // Depósitos Válidos
        cc1.depositar(200.52);
        cc2.depositar(354.94);
        // Depósitos Inválidos
        cc1.depositar(-31.12);
        cc2.depositar(0);

        // Saques Válidos
        cc1.sacar(12.40);
        cc2.sacar(7.00);
        // Saques Inválidos
        cc1.sacar(96546.14);
        cc2.sacar(-46.45);

        // Tranferência entre contas
        cc1.transferir(20.00, cc2);

        // Adiciona Contas ao Banco
        b.addConta(cc1);
        b.addConta(cc2);


        // Criar ContaInvestimento
        ContaInvestimento ci1 = new ContaInvestimento();
        ContaInvestimento ci2 = new ContaInvestimento();

        // Depósitos Válidos
        ci1.depositar(200.52);
        ci2.depositar(354.94);
        // Depósitos Inválidos
        ci1.depositar(-31.12);
        ci2.depositar(0);

        // Saques Válidos
        ci1.sacar(12.40);
        ci2.sacar(7.00);
        // Saques Inválidos
        ci1.sacar(96546.14);
        ci2.sacar(-46.45);

        // Tranferência entre contas
        ci1.transferir(20.00, ci2);

        // Adiciona Contas ao Banco
        b.addConta(ci1);
        b.addConta(ci2);


        // Criar ContaPoupanca
        ContaPoupanca cp1 = new ContaPoupanca(416.54);
        ContaPoupanca cp2 = new ContaPoupanca(654.65);
        ContaPoupanca cp3 = new ContaPoupanca(10.00);

        // Depósitos Válidos
        cp1.depositar(200.52);
        cp2.depositar(354.94);
        // Depósitos Inválidos
        cp1.depositar(-31.12);
        cp2.depositar(0);

        // Saques Válidos
        cp1.sacar(12.40);
        cp2.sacar(7.00);
        // Saques Inválidos
        cp1.sacar(96546.14);
        cp2.sacar(-46.45);

        // Tranferência entre contas
        cp1.transferir(20.00, cp2);

        // Adiciona Contas ao Banco
        b.addConta(cp1);
        b.addConta(cp2);

        // Lista todas as contas
        b.listarContas();

        // Lista apenas ContaCorrente
        b.listarCC();

        // Lista apenas ContaInvestimento
        b.listarCI();

        // Lista apenas ContaPoupanca
        b.listarCP();
    }
}
