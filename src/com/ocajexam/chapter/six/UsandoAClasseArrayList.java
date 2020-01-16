package com.ocajexam.chapter.six;

import java.util.ArrayList;

/**
 * @since 16/01/2020
 * @author willian
 * 
 * � uma classe usada para criar um objeto que possa armazenar outros objetos incluindo enums, 
 * faz uso do �ndice para acesso aos objetos, fornece bem mais flexibilidade que um array padr�o
 * podendo ser redimensionado dinamicamente.
 * 
 * OBS: Diferentemente do array padr�o, o ArrayList n�o armazena tipos primitivos, 
 * caso um primitivo seja adicionado a um ArrayList, um autoboxing ocorrer�.
 */
public class UsandoAClasseArrayList {

	public static void main(String[] args) {
		
		Integer integerOne = new Integer(1300);
		Integer integerTwo = new Integer(2000);
		
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(integerOne);
		integers.add(integerTwo);

		System.out.println("--> " + integers.get(0) + " " + integers.get(1)); // 1300 - 2000
		System.out.println("1� size: " + integers.size());
		
		/* Adicionando elemento em um �ndice espec�fico */
		
		Integer integer3 = new Integer(900);
		integers.add(1, integer3);
		
		System.out.println("--> " + integers.get(0) + " " + integers.get(1) + " " + integers.get(2));
		System.out.println("2� size: " + integers.size());
		
		/* Removendo elemento do array */
		integers.remove(0); // remove o elemento cujo �ndice � 0
		integers.remove(integer3); // remove o elemento especificado por par�metro
		
		System.out.println("--> " + integers.get(0));
		System.out.println("3� size: " + integers.size());	
	}
}