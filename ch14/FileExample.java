package ch14;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//파일 객체 생성
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		//파일 폴더가 존재하지 않으면 생성
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		
		//Temp폴더의 내용 목록을 file 배열로 얻음
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a HH:mm");
		for(File file: contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	
	}

}
