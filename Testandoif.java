import java.util.Scanner;
public class Testandoif{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1, n2, media;
        System.out.print("Digite a N1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextFloat();

        media = (n1+n2)/2;

        System.out.println("Media do aluno: " + media);

        if (media >= 6){
            System.out.println("Parabens! Você está aprovado");
        }
        else{
            System.out.println("Reprovado.");
        }
    }
}