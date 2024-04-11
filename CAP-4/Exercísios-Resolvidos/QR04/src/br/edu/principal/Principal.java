package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa recebe três números e mostra-os em ordem crescente.");
		System.out.print("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		int n3 = sc.nextInt();
		if(n1 < n2 && n1 < n3) {
			if(n2 < n3) {
				System.out.print("A ordem crescente é: "+n1+"-"+n2+"-"+n3);
			}
			else {
				System.out.print("A ordem crescente é "+n1+"-"+n3+"-"+n2);
			}
		if(n2 < n1 && n2 < n3) {
			if(n1 < n3) {
				System.out.print("A ordem crescente é: "+n2+"-"+n1+"-"+n3);
				}
			else {
				System.out.print("A ordem crescente é: "+n2+"-"+n3+"-"+n1);
			}
		if(n3 < n1 && n3 < n2) {
			if(n1 < n2) {
				System.out.print("A ordem crescente é: "+n3+"-"+n1+"-"+n2);
					}
			else {
				System.out.print("A ordem crescente é: "+n3+"-"+n2+"-"+n1);
					}
				}
			}
		}
	}
}
