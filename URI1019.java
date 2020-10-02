// Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e
// informe-o expresso no formato horas:minutos:segundos.

// Entrada
// O arquivo de entrada contém um valor inteiro N.
// Saída
// Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme
// exemplo fornecido.

import java.util.Scanner;
public class URI1019{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
    	int N, h, m, s;
        N = teclado.nextInt();
        h = N / (60 * 60);
        m = (N % (60 * 60)) / 60;
        s = (N % (60 * 60)) % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}