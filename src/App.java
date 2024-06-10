import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double bankAccount = 400.00;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String userName = scanner.nextLine();  

            System.out.println("Digite o valor a depositar:");
            double depositAmount = scanner.nextDouble(); 

            System.out.println("Digite o valor a sacar:");
            double withdrawAmount = scanner.nextDouble(); 

            if (withdrawAmount > bankAccount) 
            {
                System.out.println("O valor solicitado não está disponiível!");  
            } else
            {
                System.out.println("Nome do usuário: " + userName); 
                System.out.println("Valor depositado: " + depositAmount + "R$"); 
                System.out.println("Valor sacado: " + withdrawAmount + "R$");
                System.out.println("Saldo: " + (bankAccount +depositAmount - withdrawAmount));
            }
        } catch (InputMismatchException e){
            System.err.println("Por favor, digite apenas números nos valores a sacar e depositar!");
        }
    }
}
