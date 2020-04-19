package test;

import domain.Exercise;
/**
 *  Клас который подсчитывает и выводит данные и содержит реализацию методов, запускается при запуске программы
 * @author Lenovo
 *
 */
public class TestResult {
	/**
	 * Метод запускается при запуске программы и подсчитывает все делители входящего числа
	 * @param args указывает на то что нужно запустить при запуске программы
	 */
    public static void main(String[] args) {
    	/**
    	 *  Bходное число
    	 */
        int R = 999999; 
        /**
         *  В класе Exercise выполнить Calculate(вывод данных)
         */
        System.out.println(Exercise.Calculate(R));
    }
}
