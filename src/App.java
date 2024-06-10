import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String userName = scanner.nextLine();  

            System.out.println("Digite o valor a depositar:");
            String depositAmount = scanner.nextLine(); 

            System.out.println("Digite o valor a sacar:");
            String withdrawAmount = scanner.nextLine(); 

            System.out.println("Nome do usuário: " + userName); 
            System.out.println("Valor depositado: " + depositAmount + "R$"); 
            System.out.println("Valor sacado: " + withdrawAmount + "R$");
        }
    }
}
