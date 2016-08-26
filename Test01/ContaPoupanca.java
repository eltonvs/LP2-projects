import java.util.Random;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class ContaPoupanca {
    private double saldo;
    private int numeroConta;
    private LocalDateTime horaCriacao;
    private int numDepositos;
    private static int seq;

    static {
        seq = 0;
    }

    public ContaPoupanca(double _val) {
        if (_val >= 200) {
            Random r = new Random();

            this.saldo = _val;
            this.numeroConta = (++seq)*1000 + r.nextInt(999);
            this.horaCriacao = LocalDateTime.now();
            this.numDepositos = 0;

            if (seq == 1)  {
                this.rendimentosMensais();
            }
        } else {
            JOptionPane.showMessageDialog(
                null,
                "A conta poupança não pode ser criada com um saldo inicial menor que 200",
                "Criação da Conta poupança",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public boolean depositar(double _val)  {
        if (_val > 0) {
            this.saldo += _val;
            if (numDepositos == 0)
                this.rendimentosPromocao();
            numDepositos++;
            return true;
        }

        JOptionPane.showMessageDialog(
            null,
            "O valor de depósito deve ser maior que 0",
            "Depositar",
            JOptionPane.ERROR_MESSAGE
        );

        return false;
    }

    public boolean sacar(double _val) {
        if (_val >= 0 && _val <= this.saldo) {
            this.saldo -= _val;
            return true;
        }

        JOptionPane.showMessageDialog(
            null,
            "O valor de saque deve não pode ser maior que o saldo nem negativo",
            "Sacar",
            JOptionPane.ERROR_MESSAGE
        );

        return false;
    }

    public boolean transferir(double _val, ContaPoupanca _acc) {
        if (this.sacar(_val)) {
            return _acc.depositar(_val);
        }

        return false;
    }

    public double calcularSaldo() {
        return this.saldo;
    }

    public void rendimentosMensais() {
        this.saldo *= 1.05;
    }

    private void rendimentosPromocao() {
        this.saldo *= 1.02;
    }
}
