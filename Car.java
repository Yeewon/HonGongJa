
public class Car {
		
	String company = "����";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model,"����",250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	int Car(int ... values) {
		int sum =0; 
		return sum;
	}
}

