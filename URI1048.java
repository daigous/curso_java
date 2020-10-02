/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela
abaixo:

Salário
Percentual de Reajuste
0 - 400.00          15%
400.01 - 800.00     12%
800.01 - 1200.00    10%
1200.01 - 2000.00   7%
Acima de 2000.00    4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice
reajustado, em percentual.
Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho,
conforme exemplo abaixo:
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %
*/

import java.util.Scanner;
public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double sal, novo_sal, reajuste;
        sal = teclado.nextDouble();
        if (sal >= 0 && sal <= 400){
            reajuste = 15.0;
        }
        else if (sal > 400 && sal <= 800){
            reajuste = 12.0;
        }
        else if (sal > 800 && sal <= 1200){
            reajuste = 10.0;
        }
        else if (sal > 1200 && sal <= 2000){
            reajuste = 7.0;
        }
        else {
            reajuste = 4.0;
        }
        novo_sal = sal + (sal * (reajuste/100));
        System.out.printf("Novo salario: %.2f\n", novo_sal);
        System.out.printf("Reajuste ganho: %.2f\n", (novo_sal - sal));
        System.out.printf("Em percentual: %.0f", reajuste);
        System.out.println(" %");
    }
}

