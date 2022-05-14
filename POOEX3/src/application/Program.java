package application;

import java.util.Locale;
import java.util.Scanner;

import entitities.avaliation;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		avaliation Avaliation = new avaliation();
		
		System.out.println("Primeira nota: ");
		double nota = sc.nextDouble();
		Avaliation.somarNota(nota);
		
		System.out.println("Segunda nota: ");
		nota = sc.nextDouble();
		Avaliation.somarNota(nota);
		
		System.out.println("Terceira nota: ");
		nota = sc.nextDouble();
		Avaliation.somarNota(nota);
		
		System.out.println("\n" + Avaliation.retornarSituacao());
		
		
		
		
		sc.close();
	}

}
