import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("1. �̸�: ");
		String name = in.nextLine();
		
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String per = in.nextLine();
		
		System.out.print("3. ��ȭ��ȣ: ");
		String num = in.nextLine();
		
		System.out.print(name+"\n"+per+"\n"+num+"\n");
		
	}

}
