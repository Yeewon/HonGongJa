
public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String lotation;
	
	public Tire(String location, int maxRotation) {
		this.lotation = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(lotation+"Tire ¼ö¸í: "+
		(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}
		else {
			System.out.println("*** "+lotation+" Tire ÆãÅ© ***");
			return false;
		}
	}
}
