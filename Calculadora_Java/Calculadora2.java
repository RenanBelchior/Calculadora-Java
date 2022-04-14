package Calculos;

import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor:  ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor:  ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtracao: " + subtracao);
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		System.out.println("Resultado da divisao: " + divisao);
		
	}

	public static int soma(int a, int b) {
        return a + b;	
 }
	public static int subtracao(int a, double d) {
		return (int) (a - d);
	}
	public static int divisao(int a, double d) {
		return (int) (a / d);
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

}
