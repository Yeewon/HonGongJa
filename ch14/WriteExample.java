package ch14;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
/*		//1byte�� ���
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//FileOutputStream��  �ڽ� Ŭ�����̹Ƿ� �ڵ� Ÿ�� ��ȯ
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
*/
/*		//�迭 ��ü ���
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");		
		byte[] array = {10,20,30};		
		
		os.write(array);		
		
		os.flush();
		os.close();
*/
/*		
		//�迭 �Ϻ� ���
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {10,20,30,40};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
*/
		
/*
		//�� ���ھ� ���
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a ='A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
*/
		//�迭 ��ü ���
/*
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'A','B','C'};
		writer.write(array);
		
		writer.flush();
		writer.close();
*/
/*
 		//�迭 �Ϻ� ���
 		 
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		writer.write(array, 1, 3); //1�� �ε������� 3�� ���
		
		writer.flush();
		writer.close();
*/
		
		//���ڿ� ���
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		String str = "ABC";
		
		writer.write(str);
		writer.flush();
		writer.close();
	}

}
