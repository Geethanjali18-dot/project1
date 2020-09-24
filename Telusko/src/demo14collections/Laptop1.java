package demo14collections;

public class Laptop1  {
private String brand;
private int ram;
private int price;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
}

public Laptop1(String brand2, int ram2, int price2) {
	super();
	this.brand = brand2;
	this.ram = ram2;
	this.price = price2;
}

}
