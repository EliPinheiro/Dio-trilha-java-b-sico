import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        Scanner scanner = new Scanner(System.in);
                                                                        
        //Exibir as mensagens para o nosso usuário
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("What is yours numbers account ?");
        int number_account = scanner.nextInt();
        scanner.nextLine();

        System.err.println("What is yours agency account?");
        String agency_account = scanner.nextLine();
       

        System.out.println("What is your current balance ? ");
        Double balance = scanner.nextDouble();

        System.out.println("Hello, "+ name +". Good to see your here. Your number account is " + number_account +" and you agency account is "+ agency_account + ". You have $"+ balance +" available");
        // Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

    }
}
