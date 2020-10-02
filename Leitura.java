import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        Scanner teclado; // declarei um compnente do tipo Scanner e chamei de teclado
        teclado = new Scanner(System.in); // esse teclado le o dispositivo de entrada padrao, o teclado
        int valor1;
        System.out.println("Digite um valor inteiro:");
        valor1 = teclado.nextInt();
        System.out.println("Digitou o valor: " + valor1);
        
        float valor2;
        System.out.println("Digite um valor real separado por '.':");
        valor2 = teclado.nextFloat();
        System.out.println("Digitou o valor: " + valor2);
    }
}