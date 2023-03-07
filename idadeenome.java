import java.util.Scanner;

public class idadeenome {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int Idade1, Idade2;
        String n1, n2;
        
        System.out.println("informe seu nome : ");
        n1 = input.next();
        System.out.println("informe sua idade");
        Idade1 = input.nextInt();
    
        
        System.out.println("informe seu nome : ");
        n2 = input.next();
        System.out.println("informe sua idade");
        Idade2 = input.nextInt();
    

        if (Idade1 > Idade2 )
        {
            System.out.print( n1 + "é mais velha que " + n2 + "\n");
            
        } else if ( Idade2  > Idade1) {
            System.out.print(n2 +  " é mais velha " + n1 + "\n" );         
        } else{
            System.out.print("mesma idade \n");  
        }
    }      
    
}