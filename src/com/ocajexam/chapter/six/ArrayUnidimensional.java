package com.ocajexam.chapter.six;

/**
 * @since 15/01/2020
 * @author willian
 * 
 *         Um array Java � um objeto que age como um container, que armazena um
 *         n�mero fixo de valores do mesmo tipo.
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

		/* Declara��o v�lida de array de objetos e de primitivos */
		String[] clockTypes;
		int[] alarms;

		/*
		 * Declara��o v�lida e equivalente as declara��es anteriores Essa � uma sint�xe
		 * manos comum e raramente � utilizada
		 */
		String names[];
		int numbers[];

		/** Inicializando arrays unidimencionais */

		/*
		 * A inicializa��o de um array � semelhante a inicializa��o de um objeto Usa-se
		 * o operador new seguido do tipo, em seguida os colchetes contendo o tamanho do
		 * array. Abaixo, todas s�o maneiras de inicializar um array com o operador new
		 */
		String[] titlesOfBooks = new String[3];
		String emails[] = new String[3];
		clockTypes = new String[4];

		/* At� mesmo arrays de primitivos fazem uso do operador new */
		int[] codesErrors = new int[3];

		/*
		 * Tamb�m � poss�vel inicializar um array com todos seus valores imadiatamente
		 * ap�s a declara��o, Faz-se isso com a insser��o dos valores a serem
		 * armazenados entre chaves com cada um dos valores sendo separados por v�rgula
		 * 
		 */
		int[] httpCodesStatus = { 200, 300, 400, 500 };
		String[] zipcodes = { "91250-001", "91250-020", "91250-040" };

		/** Usando arrays unidimensionais */

		/*
		 * S�o bem f�ceis de usar, ap�s sua declara��o e inicializa��o cada elemento do
		 * array pode ser acessado a partir do seu �ndice, pois cada elemento do array
		 * possui um �ndice assocido a s�. O primeiro �ndice de um array � sempre 0
		 * (zero).
		 */
		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.printf("weekdays[1]: %s%n", weekdays[1]); // Tuesday

		/* Obtem o tamanho do array */
		System.out.printf("weekdays length: ".concat(Integer.toString(weekdays.length)));

		/*
		 * Java tem m�todos internos para c�pia de dados de um array para outro Esses
		 * m�todos copiam os dados e criam dois arrays independentes um do outro
		 */
		String[] weekend = new String[2];

		/**
		 * O m�todo est�tico arraycopy pertence a classe System, sua assinatura possui
		 * cinco par�metros Que s�o: [src] � o array de origem [srcPos] � a posi��o
		 * inicial do array de origem de onde a c�pia come�ar� [dest] � o array de
		 * destino, ou seja � o array em que os dados ser�o copiados [destPos] � a
		 * posi��o inicial em que os dados ser�o inseridos(copiados) no array de destino
		 * [length] � o n�mero de elementos que ser�o copiados do array de origem para o
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