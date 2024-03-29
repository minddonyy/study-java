class BookDriver 
{
	public static void main(String[] args) 
	{
		Book book1 = new Book("독서법", "채석용", 8400);
		book1.setPrice(10200);
		System.out.println(book1);
	}
}

class Book
{
	private String title;
	private String author;
	private int price;

	Book(String title, String author, int price){
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public String toString(){
		return ("도서명 : " + title + "\n저자 : " + author + "\n가격 : " + price);
	}
}