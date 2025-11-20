package ua.opnu;

import static java.lang.CharSequence.compare;

public class BookData implements Comparable<BookData> {

    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public int getReviews() {
        return reviews;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(BookData other) {
        if (this.getTotal() / this.getReviews() < other.getTotal() / other.getReviews())
            return 1;

        if (this.getTotal() / this.getReviews() > other.getTotal() / other.getReviews())
            return -1;

        if (this.getTotal() / this.getReviews() == other.getTotal() / other.getReviews())
            return compare(this.getTitle(), other.getTitle());

        return 0;
    }
}
