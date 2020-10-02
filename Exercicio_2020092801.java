import java.util.Scanner;
public class Exercicio_2020092801{
    public static void main(String args[]){
        float largura, base, altura, base1, base2, area;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Exercicio A: Calculo da area do quadrado.");
        System.out.println("Digite a largura do quadrado:");
        largura = teclado.nextFloat();
        area = largura * largura;
        System.out.println("Area do quadrado: " + area);
        System.out.println("");
        System.out.println("Exercicio B: Calculo da area do retangulo.");
        System.out.println("Digite a base do retangulo:");
        base = teclado.nextFloat();
        System.out.println("Digite a altura do retangulo:");
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println("Area do retangulo: " + area);
        System.out.println("");
        System.out.println("Exercicio E: Calculo da area do trapezio.");
        System.out.println("Digite a primeira base do trapezio:");
        base1 = teclado.nextFloat();
        System.out.println("Digite a segunda base do trapezio:");
        base2 = teclado.nextFloat();
        System.out.println("Digite a altura do trapezio:");
        altura = teclado.nextFloat();
        area = ((base1 + base2)*altura)/2;
        System.out.println("Area do trapezio: " + area);
    }
}