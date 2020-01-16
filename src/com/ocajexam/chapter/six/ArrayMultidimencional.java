package com.ocajexam.chapter.six;

/**
 * @since 16/01/2020
 * @author willian
 * 
 *         Os arrays multidimensionais tem mais de um �ndice.
 *
 */
@SuppressWarnings("unused")
public class ArrayMultidimencional {

	public static void main(String[] args) {

		/*
		 * Exemplo de um array de primitivos tipo char bidimensional com dois �ndices, o
		 * primeiro identificando a linha e o segundo a coluna, da posi��o de armazenamento.
		 */
		char[][] ticTacToeBoard = new char[3][3];

		for (int i = 0; i < ticTacToeBoard.length; i++) {
			for (int j = 0; j < ticTacToeBoard.length; j++) {
				ticTacToeBoard[i][j] = '-';
			}
		}
		// L C
		ticTacToeBoard[0][0] = 'X';
		ticTacToeBoard[1][1] = 'O';
		ticTacToeBoard[2][0] = 'X';

		/*
		 * Legenda
		 * 
		 * L - linha C - coluna
		 */

		for (int i = 0; i < ticTacToeBoard.length; i++) {
			for (int j = 0; j < ticTacToeBoard.length; j++) {
				System.out.print(ticTacToeBoard[i][j] + " ");
			}
			System.out.println();
		}

		/** Declarando arrays multidimensionais */

		/* Declara��o v�lida de array bidimensional de objetos e de primitivos */
		String[][] chessBoard;
		int[][] table;

		/* Declara��o v�lida de array tridimensional de primitivos */
		int[][][] cube;

		/*
		 * Declara��o v�lida e equivalente as declara��es anteriores 
		 * Essa � uma sint�xe menos comum e raramente � utilizada
		 */
		String contacts[][];
		int dimensions[][];

		/** Inicializando arrays multidimencionais */
		/*
		 * S�o semelhantes aos arrays unidimensionais podem usar o operador new ou
		 * chaves ({}) contendo os valores a serem armazenados
		 */
		int[][][] cubeTwo = new int[3][3][3];
		String[][] square = { { "1", "2" }, { "3", "4" } };

		/** Usando arrays multidimensionais */

		/*
		 * Seu uso � semelhantes aos arrays unidimensionais, com a diferen�a de que as
		 * dimen��es adicionais devem ser consideradas.
		 */
		int[][] grid = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}