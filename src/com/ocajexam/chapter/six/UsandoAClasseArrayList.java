package com.ocajexam.chapter.six;

import java.util.ArrayList;

/**
 * @since 16/01/2020
 * @author willian
 * 
 * É uma classe usada para criar um objeto que possa armazenar outros objetos incluindo enums, 
 * faz uso do índice para acesso aos objetos, fornece bem mais flexibilidade que um array padrão
 * podendo ser redimensionado dinamicamente.
 * 
 * OBS: Diferentemente do array padrão, o ArrayList não armazena tipos primitivos, 
 * caso um primitivo seja adicionado a um ArrayList, um autoboxing ocorrerá.
 */
public class UsandoAClasseArrayList {

	public static void main(String[] args) {
		
		Integer integerOne = new Integer(1300);
		Integer integerTwo = new Integer(2000);
		
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(integerOne);
		integers.add(integerTwo);

		System.out.println("--> " + integers.get(0) + " " + integers.get(1)); // 1300 - 2000
		System.out.println("1º size: " + integers.size());
		
		/* Adicionando elemento em um índice específico */
		
		Integer integer3 = new Integer(900);
		integers.add(1, integer3);
		
		System.out.println("--> " + integers.get(0) + " " + integers.get(1) + " " + integers.get(2));
		System.out.println("2º size: " + integers.size());
		
		/* Removendo elemento do array */
		integers.remove(0); // remove o elemento cujo índice é 0
		integers.remove(integer3); // remove o elemento especificado por parâmetro
		
		System.out.println("--> " + integers.get(0));
		System.out.println("3º size: " + integers.size());	
	}
}