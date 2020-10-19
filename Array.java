import java.util.Calendar;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] scores = {95,71,84,93,84};
		
		int sum=0;
		for(int score:scores) {
			sum += score;
		}
		System.out.println(sum);
		
		double avg= (double)sum/scores.length;
		System.out.println(avg);
		*/
		
		/*
		 * 05-2-4번
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int num: array) {
			if(num > max) max=num;
		}
		
		System.out.println(max);
		*/
		
		/*
		 * 05-2-5번
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		int cnt=0;
		double avg = 0.0;
		
		for(int[] i: array) {
			for(int j: i) {
				sum += j;
				cnt++;
			}
		}
		//avg = (double)sum/array.length(); // array.length()의 값은 3이 나오므로 틀린답이 출력된다. 
		avg = (double)sum/cnt;
		
		System.out.println(sum);
		System.out.println(avg);
		}
		*/
		
		/*
		//열거 타입과 열거 상수		
		Week today = null; //열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //일-토까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6: 
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
			
		}
		System.out.println("오늘 요일: "+today);
		*/
	}
}
