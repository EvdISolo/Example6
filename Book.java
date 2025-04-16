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


}











