
public class controlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//random�Լ� ����
		int num = (int)(Math.random()*6)+1; //�ֻ��� ��ȣ �ϳ� �̱� 
		
		System.out.println(num+"���� ���Խ��ϴ�. ");
		*/
		
		/*
		 * 04-2-2��
		int sum=0;
		for(int i=1; i<=33; i++) {
			sum += i*3;
		}
		System.out.println(sum);
		
		sum =0;
		for(int i=1; i<100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		/*
		 * 04-2-3��
		int sum;
		do {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("("+num1+","+num2+")");
		sum = num1 + num2; 
		}while(sum!=5);
		*/
		
		/*
		 * 04-2-4��
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {
				if(4*i+5*j == 60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
		*/
		
		/*
		 * 04-2-5��
		for(int i=1; i<5; i++) {
			for(int j=1; j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		*/
		
		/*
		 * 04-2-6��
		for(int i=1; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		*/
	}
	

}
