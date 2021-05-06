package br.com.generation.lista01;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, j, f, x, y;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o valor de j: ");
		j = ler.nextDouble();
		
		System.out.println("Digite o valor de f: ");
		f = ler.nextDouble();
		
		x = ((c*j) - (b*f)) / ((a*j) - (b*d));
		y = ((a*f) - (c*d)) / ((a*j) - (b*d));
		
		System.out.println("O valor de x é: " + x + "e y é: " + y);
		

	}

}
