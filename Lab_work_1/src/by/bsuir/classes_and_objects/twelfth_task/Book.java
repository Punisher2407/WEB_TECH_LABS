package by.bsuir.classes_and_objects.twelfth_task;

public class Book {
    private String author;
    private String title;
    private static int edition;
    private int price;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return title == ((Book) obj).title && author == ((Book) obj).author && price == ((Book) obj).price;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Price: %d, Edition: %d", title, author, price, edition);
    }
}
