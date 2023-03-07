import java.util.Scanner;

public class salarioi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double seunovoSalario, salarioAtual;
        
        System.out.println("Qual é o seu salário atual? ");
        salarioAtual = input.nextDouble();
        
        
        
        if (salarioAtual >= 1000 && salarioAtual < 2000) {
            seunovoSalario = salarioAtual * 1.15;
        } else if (salarioAtual >= 2000 && salarioAtual < 3000) {
            seunovoSalario = salarioAtual * 1.10;
        } else if (salarioAtual >= 3000) {
            seunovoSalario = salarioAtual * 1.05;
        } else {
            seunovoSalario = salarioAtual;
        }
        
        System.out.printf("Seu novo salário é R$ %.2f.\n", seunovoSalario);
    }
}