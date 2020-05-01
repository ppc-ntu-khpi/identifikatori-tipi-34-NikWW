package domain;
/**
 *   лас который подсчитывает данные и содержит реализацию методов 
 * @author Lenovo
 *
 */
public class Exercise {
	/**
	 * ћедот который подсчитывает вход€щие данные и возвращает их делители
	 * @param R вход€щие 6-ти значное число
	 * @return str строка котора€ возвращаетс€ с всеми делител€ми R
	 */
    public static String Calculate(int R) {
    	/**
    	 * —трока дл€ прин€ти€ всех делителей
    	 */
        String str = "";
        for (int i = 1; i <= R; i++) {
            if ((R%i) == 0) {
                str+= i + ", ";
            }
    }
        return str;
    }
}
