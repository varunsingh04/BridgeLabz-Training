package FutureLogistics;

public abstract class GoodsTransport {
	protected String transportID;
	protected String transportDate;
	protected int transportRating;
	
	public GoodsTransport(String transportID, String transportDate, int transportRating) {
		 this.transportID = transportID;
		 this.transportDate = transportDate;
		 this.transportRating = transportRating;
		
	}
	
	abstract public String vehicleSelection();
	
	abstract public float calculateCharge();
	
	
	public void setTransportID(String transportID) {
		this.transportID = transportID;
	}
	
	 public String getTransportID() {
		 return transportID;
	 }
	 
	 public void setTransportDate(String transportDate) {
		 this.transportDate = transportDate;
	 }
	 
	 public  String getTransportDate() {
		 return transportDate;
	 }
	
	 public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
		 
	 }
	 
	 public  int getTransportRating() {
		 return transportRating;
	 }
}
