import java.util.Scanner;

// ������������� ������� �������� ����
public class Book {

	private String bookAuthor;
	private String bookName;
	private int bookYear;
	private int bookCode;
	private int bookPrice;

	// ����������� �� ���������
	public Book() {
		this.bookAuthor = "bookAuthor";
		this.bookName = "bookName";
		this.bookYear = 3000;
		this.bookCode = 0;
		this.bookPrice = 0;
	}

	// ����������� � ������ ������� ����������
	public Book(String author, String name, int year, int code, int price) {
		this.bookAuthor = author;
		this.bookName = name;
		this.bookYear = year;
		this.bookCode = code;
		this.bookPrice = price;
	}

	public int getPrice() { // �������� ����
		return this.bookPrice;
	}

	public boolean isPublishedEarlier(int year) { // ��������� ���, ������ ��
													// ��������� ���������
		return (this.bookYear < year);
	}

	public void setPrice(int price) { // �������� ����
		this.bookPrice = price;
	}

	public static Book addBook(Book book, int code) { // ������������ � �����
														// �����
		Book nBook = new Book(book.bookAuthor, book.bookName, book.bookYear,
				code, book.bookPrice);
		return nBook;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insert author, name, year, code and price for the first BookCard");
		Book card1 = new Book(sc.nextLine(), sc.nextLine(), sc.nextInt(), // ��������
																			// �����
																			// �1
				sc.nextInt(), sc.nextInt());

		System.out.println("Insert author, name, year, code and price for the second BookCard");
		Book card2 = new Book(sc.nextLine(), sc.nextLine(), sc.nextInt(), // ��������
																			// �����
																			// �2
				sc.nextInt(), sc.nextInt());

		Book card3 = addBook(card1, 1000);// ����� ��������� ����� �1

		if (card2.isPublishedEarlier(2000))
			card2.setPrice(card2.getPrice() * 2);
	}

}