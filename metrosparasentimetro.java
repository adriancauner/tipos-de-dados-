import java.util.Scanner;

public class metrosparasentimetro {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n1,n2;
        
        System.out.println("\n Informe os metros : ");
        n1 = input.nextInt();
        
        n2 = n1 * 100 ;

        System.out.printf(" são = " + n2);

    }
}