package com.ocajexam.chapter.six;

/**
 * @since 15/01/2020
 * @author willian
 * 
 *         Um array Java é um objeto que age como um container, que armazena um
 *         número fixo de valores do mesmo tipo.
 *
 */
@SuppressWarnings("unused")
public class ArrayUnidimensional {

	public static void main(String[] args) {

		/* Exemplo de array de primitivos tipo int */
		int[] arrayOfInts = new int[3];
		arrayOfInts[0] = 5;
		arrayOfInts[1] = 10;
		arrayOfInts[2] = 15;

		/* Exemplo de array tipo String */
		String[] titles = new String[3];
		titles[0] = "First: ";
		titles[1] = "Second: ";
		titles[2] = "Third: ";

		for (int i = 0; i < arrayOfInts.length; i++) {
			for (int j = 0; j < titles.length; j++) {
				if (i == j) {
					System.out.println(titles[j] + arrayOfInts[i]);
				}
			}
		}

		/** Declarando arrays unidimensionais */

		/* Declaração válida de array de objetos e de primitivos */
		String[] clockTypes;
		int[] alarms;

		/*
		 * Declaração válida e equivalente as declarações anteriores Essa é uma sintáxe
		 * manos comum e raramente é utilizada
		 */
		String names[];
		int numbers[];

		/** Inicializando arrays unidimencionais */

		/*
		 * A inicialização de um array é semelhante a inicialização de um objeto Usa-se
		 * o operador new seguido do tipo, em seguida os colchetes contendo o tamanho do
		 * array. Abaixo, todas são maneiras de inicializar um array com o operador new
		 */
		String[] titlesOfBooks = new String[3];
		String emails[] = new String[3];
		clockTypes = new String[4];

		/* Até mesmo arrays de primitivos fazem uso do operador new */
		int[] codesErrors = new int[3];

		/*
		 * Também é possível inicializar um array com todos seus valores imadiatamente
		 * após a declaração, Faz-se isso com a insserção dos valores a serem
		 * armazenados entre chaves com cada um dos valores sendo separados por vírgula
		 * 
		 */
		int[] httpCodesStatus = { 200, 300, 400, 500 };
		String[] zipcodes = { "91250-001", "91250-020", "91250-040" };

		/** Usando arrays unidimensionais */

		/*
		 * São bem fáceis de usar, após sua declaração e inicialização cada elemento do
		 * array pode ser acessado a partir do seu índice, pois cada elemento do array
		 * possui um índice assocido a sí. O primeiro índice de um array é sempre 0
		 * (zero).
		 */
		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.printf("weekdays[1]: %s%n", weekdays[1]); // Tuesday

		/* Obtem o tamanho do array */
		System.out.printf("weekdays length: ".concat(Integer.toString(weekdays.length)));

		/*
		 * Java tem métodos internos para cópia de dados de um array para outro Esses
		 * métodos copiam os dados e criam dois arrays independentes um do outro
		 */
		String[] weekend = new String[2];

		/**
		 * O método estático arraycopy pertence a classe System, sua assinatura possui
		 * cinco parâmetros Que são: [src] é o array de origem [srcPos] é a posição
		 * inicial do array de origem de onde a cópia começará [dest] é o array de
		 * destino, ou seja é o array em que os dados serão copiados [destPos] á a
		 * posição inicial em que os dados serão inseridos(copiados) no array de destino
		 * [length] é o número de elementos que serão copiados do array de origem para o
		 * array de destino
		 */
		System.arraycopy(weekdays, 5, weekend, 0, 2);

		for (String s : weekdays) {
			System.out.println(s);
		}
		System.out.println("--------");
		for (String s : weekend) {
			System.out.println(s);
		}
	}
}