import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String name = in.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String per = in.nextLine();
		
		System.out.print("3. 전화번호: ");
		String num = in.nextLine();
		
		System.out.print(name+"\n"+per+"\n"+num+"\n");
		
	}

}
