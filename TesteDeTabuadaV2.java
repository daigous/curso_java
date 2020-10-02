import java.util.Scanner;
public class TesteDeTabuadaV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int contador = 1;

        System.out.println("---------- Inicio da Tabuada ----------");
        do{
            System.out.println(num + "x" + contador + " = " + (num*contador));
            contador = contador + 1;
        }while (contador <= 10);
        System.out.println("----------- Fim da Tabuada -----------");
    }
}