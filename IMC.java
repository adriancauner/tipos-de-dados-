import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Double altura,peso,imc;
        
        System.out.println("Digite seu peso (em kg): ");
        peso = input.nextDouble();
        System.out.println("Digite a sua altura  (em metros): ");
        altura = input.nextDouble();
        
        imc = peso / (altura * altura);

        
        if (imc < 18.5) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Abaixo do peso ta só o osso \n");
        } else if (imc >= 18.5 && imc <= 24.9 ) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Peso Normal parabéns você normal\n");
        } else if (imc >=25.0 && imc <= 29.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Sobre peso perde uns quilos né meu nobre \n");
        } else if (imc >=30.0 && imc <= 34.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Obesidade grau  tipo meteoro\n");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Obesidade grau   thaisplodindo \n");
        } else if (imc >= 40.0) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso  é : Obesidade grau  tipo thais carla \n");
        }
    }
}