package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.in.read(); //in�� �����ϴ� ������ ���� read()�� ����
		try {
			InputStream is = System.in; // in�� ������ is�� ����
			byte[] data = new byte[100];
			while (true) {
				int readNum = is.read(data); // is.read() = 1byte�� ���� = System.in.read()/ ������ int Ÿ��
				//read()�� �ѱ��� ������ / �ѱ��� ���� + �����̶� / �� Ű�� ���� �� ����
				String str = new String(data, 0, readNum-2); //100byte��ü�� �ƴ� �� �ִ� ���� ���� // -2 = ���� 10,13�� ������
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}