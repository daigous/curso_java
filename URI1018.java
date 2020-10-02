// Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode
// ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a
// relação de notas necessárias.

// Entrada
// O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
// Saída
// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o
// exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa
// apresentará a mensagem: “Presentation Error"

import java.util.Scanner;
public class URI1018{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
    	int N, C, L, XX, X, V, II, I, resto;
        N = teclado.nextInt();
        C = N / 100;
        resto = N % 100;
        L = resto / 50;
        resto = resto % 50;
        XX = resto / 20;
        resto = resto % 20;
        X = resto / 10;
        resto = resto % 10;
        V = resto / 5;
        resto = resto % 5;
        II = resto / 2;
        I = resto % 2;
        System.out.println(N);
        System.out.println(C + " nota(s) de R$ 100,00");
        System.out.println(L + " nota(s) de R$ 50,00");
        System.out.println(XX + " nota(s) de R$ 20,00");
        System.out.println(X + " nota(s) de R$ 10,00");
        System.out.println(V + " nota(s) de R$ 5,00");
        System.out.println(II + " nota(s) de R$ 2,00");
        System.out.println(I + " nota(s) de R$ 1,00");        
    }
}
