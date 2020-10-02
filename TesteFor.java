import java.util.Scanner;
public class TesteFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int contador;

        for (contador = 1; contador <= 10; contador = contador+1){
            System.out.println(num + "x" + contador + " = " + (num*contador));
        }
    }
}
