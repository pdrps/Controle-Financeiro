import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaFinanceiro sistema = new SistemaFinanceiro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nControle Financeiro Pessoal");
            System.out.println("1. Adicionar Transação");
            System.out.println("2. Listar Transações");
            System.out.println("3. Remover Transação");
            System.out.println("4. Calcular Saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();  // Consumir nova linha
                    System.out.print("Data (dd/MM/yyyy): ");
                    String data = scanner.nextLine();
                    sistema.adicionarTransacao(new Transacao(descricao, valor, data));
                    break;
                case 2:
                    sistema.listarTransacoes();
                    break;
                case 3:
                    System.out.print("Índice da transação a remover: ");
                    int index = scanner.nextInt();
                    sistema.removerTransacao(index - 1);
                    break;
                case 4:
                    double saldo = sistema.calcularSaldo();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}