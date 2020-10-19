package ch14;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
/*		//1byte씩 출력
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//FileOutputStream은  자식 클래스이므로 자동 타입 변환
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
*/
/*		//배열 전체 출력
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");		
		byte[] array = {10,20,30};		
		
		os.write(array);		
		
		os.flush();
		os.close();
*/
/*		
		//배열 일부 출력
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {10,20,30,40};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
*/
		
/*
		//한 문자씩 출력
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
		//배열 전체 출력
/*
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'A','B','C'};
		writer.write(array);
		
		writer.flush();
		writer.close();
*/
/*
 		//배열 일부 출력
 		 
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		writer.write(array, 1, 3); //1번 인덱스부터 3개 출력
		
		writer.flush();
		writer.close();
*/
		
		//문자열 출력
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		String str = "ABC";
		
		writer.write(str);
		writer.flush();
		writer.close();
	}

}
