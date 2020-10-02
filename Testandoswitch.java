import java.util.Scanner;
public class Testandoswitch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();

        switch(valor){
            case 1:
                System.out.println("Digitou o valor 1");
                break;  // o comando break serve para interromper o switch. Se não coloca-lo fica acumulativo.
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Digitou qualquer outro valor");
        }
    }
}