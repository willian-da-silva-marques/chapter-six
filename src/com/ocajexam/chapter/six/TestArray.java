package com.ocajexam.chapter.six;

public class TestArray {

	public static void main(String[] args) {

//		String[] numbers = { "One", "Two", "Tree" };
////		System.out.println(numbers[3] + " " + numbers[2] + " " + numbers[1]);// ArrayIndexOutOfBoundsException
//
//		for (String s : numbers) {
//			System.out.print(s + " ");
//		}
//
//		System.out.println(numbers.length);
//
//		Integer[] integerArray1 = { new Integer(100), new Integer(1), new Integer(30), new Integer(50),
//				new Integer(121), new Integer(1434), new Integer(3754), new Integer(51) };
//		Integer[] integerArray2 = new Integer[6];
//		integerArray2[0] = new Integer(104);
//		integerArray2[1] = new Integer(12);
//		integerArray2[2] = new Integer(20);
//		System.arraycopy(integerArray1, 5, integerArray2, 3, 2);
//		for (Integer i : integerArray2) {
//			System.out.print(i + " ");
//		}

		int[][] square = new int[2][];
		square[0] = new int[5];
		square[1] = new int[3];
		
//		for (int i = 0; i < 3; i++) {
//			square[i][i] = 5;
//		}
//		
//		int sum = 0;
		
		for (int i = 0; i < square.length; i++) {
			for(int j = 0;j < square.length;j++) {
//				sum+=square[i][j];
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

	//saída prevista: 104,12,20,1434,3754,null
	
	
}
