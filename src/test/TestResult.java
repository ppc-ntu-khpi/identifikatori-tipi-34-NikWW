package test;

import domain.Exercise;
/**
 *  ���� ������� ������������ � ������� ������ � �������� ���������� �������, ����������� ��� ������� ���������
 * @author Lenovo
 *
 */
public class TestResult {
	/**
	 * ����� ����������� ��� ������� ��������� � ������������ ��� �������� ��������� �����
	 * @param args ��������� �� �� ��� ����� ��������� ��� ������� ���������
	 */
    public static void main(String[] args) {
    	/**
    	 *  B������ �����
    	 */
        int R = 999999; 
        /**
         *  � ����� Exercise ��������� Calculate(����� ������)
         */
        System.out.println(Exercise.Calculate(R));
    }
}
