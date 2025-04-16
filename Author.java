public class Author {
    public String name;
    public String surname;
    public int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;

    }

    public boolean matches(String word) {
        return name.toLowerCase().contains(word.toLowerCase()) || surname.toLowerCase().contains(word.toLowerCase());

    }

    public int estimatePrice() {
        final int Page_Price = 3;
        int s1 = Book.pages;
        int estimatePrice = (Page_Price * Book.pages * (int) Math.floor(Math.sqrt(rating)));
        if (estimatePrice > 250) {
            return estimatePrice;
        } else return 0;


    }

}



