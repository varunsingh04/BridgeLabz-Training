package FutureLogistics;

public class BrickTransport extends GoodsTransport{
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportID, String transportDate, int transportRating,float brickSize, int brickQuantity, float brickPrice) {
		super(transportID, transportDate, transportRating);
		
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	
	public  float getBrickSize() {
		return brickSize;
	}
	
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	
	public int getBrickQuantity() {
		return brickQuantity;
	}
	
	public void setBrickPrize(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	public float getBrickPrice() {
		return brickPrice;
	}
	
	public String vehicleSelection() {
		brickQuantity = getBrickQuantity();
		if(brickQuantity < 300) {
			return "Truck";
		}else if(brickQuantity >= 300 && brickQuantity<= 500) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}
	
	
	public float calculateCharge() {
		
		brickPrice = getBrickPrice();
		brickQuantity = getBrickQuantity();
		
		float price = (brickPrice * brickQuantity);
		
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
		
		float totalcharge = ((price) + vehiclePrice + tax) - discount ;
		 
		 return totalcharge;
				
	}
}
