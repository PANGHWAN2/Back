package book;

public class Book {
	public Book() {
	}
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return bookPrice;
	}
	public void setPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		return this.bookPrice*(100-bookDiscountRate)/100;
	}
	public String toString() {
		return bookName + "\t" + bookPrice + "원\t" + bookDiscountRate + "%" + "\t" + getDiscountBookPrice() +"원\t";
	}	
}
