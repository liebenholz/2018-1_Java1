package w2_2277;

import java.util.Scanner;

public class Summation3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("1���� �󸶱����� ¦���� ���Ͻðڽ��ϱ�? ");
		int a = input.nextInt();

		int sum = 0;
		int i;

		//for ���, i�� 2��ŭ�� ������Ŵ
		for (i=2; i<=a; i+=2) {
			sum = sum + i; // �̷��� �ϴ°� �³�?
		}

		System.out.println("ù��° ���: 1���� " + a + "������ ¦���� �� = " + sum);

		sum=0;

		//for ���, i�� 1��ŭ�� ������Ű�鼭 i�� ¦���� ���� ������
		for (i=1; i<=a; i++)
			if ((i%2)==0)
				sum = sum+i;

		System.out.println("�ι�° ���: 1���� " + a + "������ ¦���� �� = " + sum);

		input.close();

	}

}