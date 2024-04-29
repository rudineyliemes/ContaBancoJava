import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Conta> contas = new HashMap<>();
    public static void main(String[] args) throws Exception {
        

        String opcao;

        while (true) {
            opcao = JOptionPane.showInputDialog("O que você deseja fazer?\n" +
                    "1 - Criar conta.\n" +
                    "2 - Consulta saldo.\n" +
                    "3 - Depositar.\n" +
                    "4 - Sacar.\n" +
                    "5 - Sair");

            switch (opcao) {
                case "1":
                    criarconta();
                    break;

                case "2":
                    consultaSaldo();
                    break;

                case "3":
                    depositar();
                    break;

                case "4":
                    sacar();
                    break;

                case "5":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Selecione outra opção");
                    break;
            }
        }

        
    }

    

    public static void criarconta() {
        System.out.print("Digite um nome para sua conta: ");
        String nome = sc.nextLine();
        if (contas.containsKey(nome)) {
            System.out.println("Uma conta com esse nome já existe.");
        } else {
            Conta novaConta = new Conta(nome);
            contas.put(nome, novaConta);
            System.out.println("Olá " + nome + ", sua conta foi criada com sucesso...");
        }
    }

   
    public static void consultaSaldo() {
        System.out.print("Digite o nome da conta: ");
        String nome = sc.nextLine();
        Conta conta = contas.get(nome);
        if (conta != null) {
            System.out.println("Saldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void depositar() {
        System.out.print("Digite o nome da sua conta: ");
        String nome = sc.nextLine();
        Conta conta = contas.get(nome);
        if (conta != null) {
            System.out.print("Digite o valor a ser depositado: ");
            double valor = Double.parseDouble(sc.nextLine());
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void sacar() {
        System.out.print("Digite o nome da sua conta: ");
        String nome = sc.nextLine();
        Conta conta = contas.get(nome);
        if (conta != null) {
            System.out.print("Digite o valor a ser sacado: ");
            double valor = Double.parseDouble(sc.nextLine());
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    
}

class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <=saldo ){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para saque ou saldo insuficiente.");
        }
        
    }
}