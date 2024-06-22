import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List<Transacao> transacoes;

    public SistemaFinanceiro() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            for (int i = 0; i < transacoes.size(); i++) {
                System.out.println((i + 1) + ". " + transacoes.get(i));
            }
        }
    }

    public void removerTransacao(int index) {
        if (index >= 0 && index < transacoes.size()) {
            transacoes.remove(index);
            System.out.println("Transação removida com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public double calcularSaldo() {
        double saldo = 0.0;
        for (Transacao transacao : transacoes) {
            saldo += transacao.getValor();
        }
        return saldo;
    }
}