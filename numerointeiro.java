import java.util.Scanner;

public class numerointeiro {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n1;
        
        System.out.println("Informe um numero : ");
        n1 = input.nextInt();
    
        if (n1 == 1){ 
            System.out.print("segunda feira  \n");      
        } else if (n1 == 2){ 
            System.out.print("terça feira  \n");      
        } else if (n1 == 3){ 
            System.out.print("quarta feira  \n");      
        } else if (n1 == 4){ 
            System.out.print("quinta feira  \n");      
        } else if (n1 == 5){ 
            System.out.print("sexta feira  \n");      
        } else if (n1 == 6){ 
            System.out.print("sabado   \n");      
        } else if (n1 == 7){ 
            System.out.print("domingo  \n");      
        }
    }
}