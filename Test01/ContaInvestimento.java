import java.util.Random;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class ContaInvestimento {
    private double saldo;
    private int numeroConta;
    private LocalDateTime horaCriacao;
    private static int seq;

    static {
        seq = 0;
    }

    public ContaInvestimento() {
        Random r = new Random();

        this.saldo = 0;
        this.numeroConta = (++seq)*1000 + r.nextInt(999);
        this.horaCriacao = LocalDateTime.now();
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public boolean depositar(double _val)  {
        if (_val > 0) {
            this.saldo += _val;
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

    public boolean transferir(double _val, ContaInvestimento _acc) {
        if (this.sacar(_val)) {
            return _acc.depositar(_val);
        }

        return false;
    }

    public double calcularSaldo() {
        return this.saldo*1.05;
    }
}
