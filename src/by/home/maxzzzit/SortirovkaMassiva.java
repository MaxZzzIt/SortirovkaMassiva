package by.home.maxzzzit;

import java.util.Arrays;
import java.util.Collections;

public class SortirovkaMassiva {

	public static void main(String[] args) {
		// Сотритовка массива встроенным методом
		Integer [] MyMass = new Integer[]{34,54,23,6,2,-45,4,12,3,-5,3};
		System.out.println("Оригинальный массив: "+Arrays.toString(MyMass));//Оригинальный массив
		Arrays.sort(MyMass);
		System.out.println("Отсортированный массив: "+Arrays.toString(MyMass));//Отсортированный массив
		//Сортировка массива в обратном порядке подходит только "для оберток" например Integer
		Arrays.sort(MyMass,Collections.reverseOrder());
		System.out.println(Arrays.toString(MyMass));
	}

}
