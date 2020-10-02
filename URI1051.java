/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa
é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso
com duas casas decimais.
Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
*/

import java.util.Scanner;
public class URI1051{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        double sal, imposto, faixa1, faixa2;
        sal = teclado.nextDouble();
        faixa1 = ((3000.0 - 2000.0)*(8.0 / 100));
        faixa2 = ((4500.0 - 3000.0)*(18.0 / 100)) + faixa1;
        // System.out.printf("Imposto = %.2f\n", faixa1);
        // System.out.printf("Imposto = %.2f\n", faixa2);
        if (sal <= 2000.0){
            System.out.println("Isento");
        }
        else{
            if (sal <= 3000.0){
                imposto = ((sal - 2000.0)*(8.0 / 100));
            }
            else if (sal <= 4500.0){
                imposto = ((sal - 3000.0)*(18.0 / 100)) + faixa1;
            }
            else{
                imposto = ((sal - 4500.0)*(28.0/100)) + faixa2;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}

        
