package gitJavaPrograms;

public class Address
{
	private int doorNumber,zipcode;
	private String streetName,city;
	public Address(int doorNumber, int zipcode, String streetName, String city)
	{
		this.doorNumber = doorNumber;
		this.zipcode = zipcode;
		this.streetName = streetName;
		this.city = city;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
		
}
