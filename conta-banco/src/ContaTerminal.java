import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //ToDo: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        int agencia = 1021;
        double saldo = 237.48;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Olá, seja Bem vindo(a) informe seu nome!");
        // Obter pelo scanner os valores digitados no terminal
        String nomeCli = scanner.nextLine();
        // Exibir a mensagem final de conta criada
        System.out.println("Olá por gentileza informe o número da Conta!");
        int conta = scanner.nextInt();

        if(conta == 1021){
            System.out.println("Olá " + nomeCli +", obrigado por criar uma conta em nosso banco, sua agência é "
            +agencia+", conta "+conta+" e seu saldo de "+saldo+" já está disponível para saque");
        }else{
            System.out.println("Desculpe mas não encontramos essa conta em nossa base de dados!");
        }
    }
}
