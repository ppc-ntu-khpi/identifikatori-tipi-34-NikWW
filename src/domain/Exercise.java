package domain;
/**
 *  ���� ������� ������������ ������ � �������� ���������� ������� 
 * @author Lenovo
 *
 */
public class Exercise {
	/**
	 * ����� ������� ������������ �������� ������ � ���������� �� ��������
	 * @param R �������� 6-�� ������� �����
	 * @return str ������ ������� ������������ � ����� ���������� R
	 */
    public static String Calculate(int R) {
    	/**
    	 * ������ ��� �������� ���� ���������
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
