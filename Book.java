public class Book {

    public String title;
    public int releaseYear;
    public String author;
    public static int pages;


    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }
//    public String title;
//    public int releaseYear;
//    public String author;
//    public int pages;

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        return Author.name.toLowerCase().contains(word.toLowerCase()) || Author.surname.toLowerCase().contains(word.toLowerCase());

    }

    public int estimatePrice() {
        final int Page_Price = 3;
        int s1 = Book.pages;
        int estimatePrice = (Page_Price * pages * (int) Math.floor(Math.sqrt(Author.rating)));
        if (estimatePrice > 250) {
            return estimatePrice;
        } else return 0;

    }
}











