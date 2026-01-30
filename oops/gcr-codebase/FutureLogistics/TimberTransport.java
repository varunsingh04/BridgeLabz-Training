package FutureLogistics;

public class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport(String transportID, String transportDate, int transportRating,float timberLength, float timberRadius, String timberType, float timberPrice ) {
		super(transportID, transportDate, transportRating);
		 this.timberLength = timberLength ;
		 this.timberRadius = timberRadius;
		 this.timberType = timberType;
		 this.timberPrice = timberPrice;
	}
	
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	
	public float getTimberLength() {
		return timberLength;
	}
	
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
		
	}
	
	public float getTimberRadius() {
		return timberRadius;
	}
	
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	
	public String getTimberType() {
		return timberType;
	}
	
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	public float getTimberPrice() {
		return timberPrice;
	}
	
	
	
	public String vehicleSelection() {
			timberRadius = getTimberRadius();
			timberLength = getTimberLength();
			double area = 2 * 3.147 * timberRadius * timberLength;
			if(area < 250) {
				return "Truck";
			}else if(area >= 250 && area <= 400) {
				return "Lorry";
			}else {
				return "MonsterLorry";
			}
	}
	
	
	public float calculateCharge() {
		timberRadius = getTimberRadius();
		timberLength = getTimberLength();
		timberPrice = getTimberPrice();
		timberType = getTimberType();
		
		double  volume = 3.147 * timberRadius * timberRadius * timberLength; 
		
	    double timberTypePrice = 0;
		if(timberType.equalsIgnoreCase("premium")) {
			timberTypePrice = 0.25;
		}else if (timberType.equalsIgnoreCase("nonpremium")) {
			timberTypePrice = 0.15;
		}
		
		double price = volume * timberPrice* timberTypePrice;
		
		
		
		
		float vehiclePrice = 0;
		
		
		String vehicleType = vehicleSelection();
		if(vehicleType.equalsIgnoreCase("truck")) {
			vehiclePrice = 1000;
		}else if(vehicleType.equalsIgnoreCase("lorry")) {
			vehiclePrice = 1700;
		}else if(vehicleType.equalsIgnoreCase("monsterlorry")) {
			vehiclePrice = 3000;
		}
		
		float  tax = (float) (price * 0.3);
		
		float  discount = 0;
		
		transportRating = getTransportRating();
		 if(transportRating == 5) {
			 discount = (float) (price * 0.2/100) ;
		 }else if(transportRating >= 3 && transportRating <= 4) {
			 discount = (float) (price * 0.1/100) ;
		 }else {
			 discount = 0 ;
		 }
		 
		 float totalcharge =(float )((price) + vehiclePrice + tax ) - discount;
		 
		 return totalcharge;
	}
}

