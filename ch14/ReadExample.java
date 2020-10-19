package ch14;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*
 		//1byte씩 읽기
		InputStream is = new FileInputStream("C:/Temp/test1.db");

		while (true) {
			int data = is.read();
			if (data == -1) // 더이상 바이트를 읽을 수 없으면 
				break;
			System.out.println(data);
		}

		is.close();
*/
/*
		
		//배열 길이만큼 읽기
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
*/
/*		
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		byte[] buffer = new byte[5];
		int readByteNum = is.read(buffer,2,3);
		if(readByteNum == -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
*/
/*
		//한문자씩 읽기
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data);
		}
		reader.close();
*/
/*
		//배열길이만큼 읽기
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
*/

		//지정한 길이만큼 읽기
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
	}

}
