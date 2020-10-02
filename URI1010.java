// Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor
// a ser pago.

// Entrada
// O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois
// inteiros e um valor com 2 casas decimais.
// Saída
// A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os
// dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

import java.util.Scanner;
public class URI1010{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int num1, num2, qtde1, qtde2;
        double preco1, preco2, total;
        num1 = teclado.nextInt();
        qtde1 = teclado.nextInt();
        preco1 = teclado.nextDouble();
        num2 = teclado.nextInt();
        qtde2 = teclado.nextInt();
        preco2 = teclado.nextDouble();
        total = qtde1 * preco1 + qtde2 * preco2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}