import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Banco {
    private int numContas;
    private ArrayList<ContaCorrente> listaCC;
    private ArrayList<ContaInvestimento> listaCI;
    private ArrayList<ContaPoupanca> listaCP;

    public Banco() {
        this.numContas = 0;
        this.listaCC = new ArrayList<ContaCorrente>();
        this.listaCI = new ArrayList<ContaInvestimento>();
        this.listaCP = new ArrayList<ContaPoupanca>();
    }

    public void addConta(ContaCorrente _conta) {
        this.listaCC.add(_conta);
    }

    public void addConta(ContaInvestimento _conta) {
        this.listaCI.add(_conta);
    }

    public void addConta(ContaPoupanca _conta) {
        this.listaCP.add(_conta);
    }

    public void listarContas() {
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Iterator<ContaCorrente> it_cc = listaCC.iterator();
        Iterator<ContaInvestimento> it_ci = listaCI.iterator();
        Iterator<ContaPoupanca> it_cp = listaCP.iterator();

        StringBuilder text = new StringBuilder();

        while (it_cc.hasNext()) {
            ContaCorrente cc = (ContaCorrente) it_cc.next();
            text.append("" + cc.getNumeroConta() + " - " + money.format(cc.calcularSaldo()) + "\n");
        }

        while (it_ci.hasNext()) {
            ContaInvestimento ci = (ContaInvestimento) it_ci.next();
            text.append("" + ci.getNumeroConta() + " - " + money.format(ci.calcularSaldo()) + "\n");
        }

        while (it_cp.hasNext()) {
            ContaPoupanca cp = (ContaPoupanca) it_cp.next();
            text.append("" + cp.getNumeroConta() + " - " + money.format(cp.calcularSaldo()) + "\n");
        }

        if (text.toString().equals("")) {
            text.append("Nenhuma conta encontrada.");
        }

        JOptionPane.showMessageDialog(
            null,
            text.toString(),
            "Listagem de Contas (Geral)",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void listarCC() {
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Iterator<ContaCorrente> it_cc = listaCC.iterator();

        StringBuilder text = new StringBuilder();

        while (it_cc.hasNext()) {
            ContaCorrente cc = (ContaCorrente) it_cc.next();
            text.append("" + cc.getNumeroConta() + " - " + money.format(cc.calcularSaldo()) + "\n");
        }

        if (text.toString().equals("")) {
            text.append("Nenhuma conta encontrada.");
        }

        JOptionPane.showMessageDialog(
            null,
            text.toString(),
            "Listagem de Contas (Conta Corrente)",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void listarCI() {
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Iterator<ContaInvestimento> it_ci = listaCI.iterator();

        StringBuilder text = new StringBuilder();

        while (it_ci.hasNext()) {
            ContaInvestimento ci = (ContaInvestimento) it_ci.next();
            text.append("" + ci.getNumeroConta() + " - " + money.format(ci.calcularSaldo()) + "\n");
        }

        if (text.toString().equals("")) {
            text.append("Nenhuma conta encontrada.");
        }

        JOptionPane.showMessageDialog(
            null,
            text.toString(),
            "Listagem de Contas (Conta Investimento)",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void listarCP() {
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Iterator<ContaPoupanca> it_cp = listaCP.iterator();

        StringBuilder text = new StringBuilder();

        while (it_cp.hasNext()) {
            ContaPoupanca cp = (ContaPoupanca) it_cp.next();
            text.append("" + cp.getNumeroConta() + " - " + money.format(cp.calcularSaldo()) + "\n");
        }

        if (text.toString().equals("")) {
            text.append("Nenhuma conta encontrada.");
        }

        JOptionPane.showMessageDialog(
            null,
            text.toString(),
            "Listagem de Contas (Conta Poupança)",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}