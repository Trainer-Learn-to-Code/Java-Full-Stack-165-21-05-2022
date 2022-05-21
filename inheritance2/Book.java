package inheritance2;
class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
	public static void main(String[] args) {
		Author author = new Author("Aparna Das", "aparna14@yahoo.com", 'M');
		Book book = new Book("Java Fundamentals", author, 199.0, 500);
		
		System.out.println(book);
	}
	
}

