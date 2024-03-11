import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Conta> contas = new ArrayList<>();
    private static List<String> numerosExistentes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner leitorIn = new Scanner(System.in);
        System.out.println("Sistema bancario!\n");
        ExibirMenuPrincipal(leitorIn);
        leitorIn.close();
    }
    public static void ExibirMenuPrincipal(Scanner leitor){
        System.out.println("1- Abrir Conta\n2- Acessar Conta\n0- Encerrar programa");
        System.out.println("\nDigite a opcao desejada:");

        String opcao = leitor.next();
        switch (opcao) {
            case "1":
                criarConta(leitor);
                break;
            case "2":
                acessarConta(leitor);
                break;
            case "0":
                System.out.println("Encerrando...");
                leitor.close();
                break;
            default:
                System.out.println("Digite uma opcao valida.");
                ExibirMenuPrincipal(leitor);
                break;
        }
    }
    public static void criarConta(Scanner leitor){
        System.out.println("============== CRIAR CONTA ==============");
        Conta novaConta = new Conta();

        String nome = SolicitarNome(leitor);
        novaConta.setNomeTitular(nome);

        String num = SolicitarNumeroConta(leitor);
        if(numerosExistentes.contains(num)) {
            System.out.println("Nao foi possivel criar a conta, esse numero ja esta registrado.");
            ExibirMenuPrincipal(leitor);
        }
        novaConta.setNumero(num);
        numerosExistentes.add(num);

        contas.add(novaConta);

        System.out.println("Conta criada com sucesso!\n");
        ExibirMenuPrincipal(leitor);
    }
    public static void acessarConta(Scanner leitor){
        System.out.println("============== ACESSAR CONTA ==============\n");

        String numeroInformado = SolicitarNumeroConta(leitor);
        Conta contaEncontrada = encontrarContaPeloNumero(numeroInformado);

        if(contaEncontrada == null){
            System.out.println("Nenhuma Conta com esse numero foi encontrada.");
        }else{
            SolicitarAcaoDaConta(contaEncontrada, leitor);
        }
    }

    public static Conta encontrarContaPeloNumero(String numero){
        for(Conta c : contas){
            if(c.getNumero().equals(numero)){
                return c;
            }
        }
        return null;
    }

    public static void SolicitarAcaoDaConta(Conta conta, Scanner leitor){
        boolean continueLoop = true;

        System.out.println("\nTITULAR: " + conta.getNomeTitular());
        System.out.println("SALDO: " + conta.getSaldo());
        System.out.println("1- Depositar\n2- Sacar\n0- Voltar");

        String opcao = leitor.next();
        switch (opcao){
            case "1":
                if(conta.depositar(SolicitarValorDeposito(leitor))){
                    System.out.println("Deposito Realizado com sucesso!");
                }else {
                    System.out.println("Ocorreu um erro ao tentar realizar deposito.");
                }
                SolicitarAcaoDaConta(conta, leitor);
                break;
            case "2":
                if(conta.sacar(SolicitarValorSaque(leitor))){
                    System.out.println("Saque Realizado com sucesso!");
                }else {
                    System.out.println("Ocorreu um erro ao tentar realizar saque.");
                }
                SolicitarAcaoDaConta(conta, leitor);
                break;
            case "0":
                ExibirMenuPrincipal(leitor);
                break;
            default:
                System.out.println("Digite uma opcao valida.");
                SolicitarAcaoDaConta(conta, leitor);
                break;
        }
    }

    public static String SolicitarNome(Scanner leitor){
        System.out.println("Digite o nome do titular:");
        String nome = leitor.next();
        return nome;
    }

    public static String SolicitarNumeroConta(Scanner leitor){
        System.out.println("Digite o numero da conta: ");
        String numero = leitor.next();
        return numero;
    }

    public static double SolicitarValorDeposito(Scanner leitor){
        System.out.println("Digite o valor do deposito:\n");
        double valor = leitor.nextDouble();
        return valor;
    }

    public static double SolicitarValorSaque(Scanner leitor){
        System.out.println("Digite o valor do saque:\n");
        double valor = leitor.nextDouble();
        return valor;
    }
}