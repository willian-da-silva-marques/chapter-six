package com.ocajexam.chapter.six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Exercicio6_1 {

	public static void main(String[] args) {

		int[] temperaturasMaximasSemanaArray = new int[7];

		temperaturasMaximasSemanaArray[0] = 36;
		temperaturasMaximasSemanaArray[1] = 30;
		temperaturasMaximasSemanaArray[2] = 31;
		temperaturasMaximasSemanaArray[3] = 38;
		temperaturasMaximasSemanaArray[4] = 36;
		temperaturasMaximasSemanaArray[5] = 31;
		temperaturasMaximasSemanaArray[6] = 32;
		
		List<Integer> temperaturasMaximasSemanaList = new ArrayList<>();
		temperaturasMaximasSemanaList.add(36);
		temperaturasMaximasSemanaList.add(30);
		temperaturasMaximasSemanaList.add(31);
		temperaturasMaximasSemanaList.add(38);
		temperaturasMaximasSemanaList.add(36);
		temperaturasMaximasSemanaList.add(31);
		temperaturasMaximasSemanaList.add(32);

		calcularTemperaturaMedia(temperaturasMaximasSemanaArray);
		System.out.println();
		calcularTemperaturaMedia(temperaturasMaximasSemanaList.stream().mapToInt(Integer::intValue).toArray());
	}

	private static void calcularTemperaturaMedia(int[] temperaturasMaximasSemanaArray) {
		BigDecimal temperaturaMedia = new BigDecimal(0);
		BigDecimal soma = new BigDecimal(0);
		int j = 0;
		for (int i = 0; i < temperaturasMaximasSemanaArray.length; i++) {
			j = i;
			soma = soma.add(new BigDecimal(temperaturasMaximasSemanaArray[i]));
			if (i > 0) {
				temperaturaMedia = soma.divide(new BigDecimal(++i), 2, RoundingMode.HALF_UP);
				i = j;
				switch (i) {
				case 1:
					System.out.println("Temperatura m�dia\n " + (i) + "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				case 2:
					System.out.println("Temperatura m�dia\n " + (i - 1) + "� dia, " + (i) + "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				case 3:
					System.out.println("Temperatura m�dia\n " + (i - 2) + "� dia, " + (i - 1) + "� dia, " + (i)	+ "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				case 4:
					System.out.println("Temperatura m�dia\n " + (i - 3) + "� dia, " + (i - 2) + "� dia, " + (i - 1) + "� dia, " + (i) + "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				case 5:
					System.out.println("Temperatura m�dia\n " + (i - 4) + "� dia, " + (i - 3) + "� dia, " + (i - 2)	+ "� dia, " + (i - 1) + "� dia, " + (i) + "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				case 6:
					System.out.println("Temperatura m�dia\n " + (i - 5) + "� dia, " + (i - 4) + "� dia, " + (i - 3)	+ "� dia, " + (i - 2) + "� dia, " + (i - 1) + "� dia, " + (i) + "� dia e " + (i + 1) + "� dia: " + (temperaturaMedia) + " �C");
					break;
				}
			}
		}
	}
}