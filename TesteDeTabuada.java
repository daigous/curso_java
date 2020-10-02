import java.util.Scanner;
public class TesteDeTabuada{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int contador = 1;

        System.out.println("---------- Inicio da Tabuada ----------");
        while (contador <= 10){
            System.out.println(num + "x" + contador + " = " + (num*contador));
            contador = contador + 1;
        }
        System.out.println("----------- Fim da Tabuada -----------");
    }
}