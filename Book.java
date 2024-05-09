
public class Book implements BookOperations {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // Display book information
    public void displayInfo() {
        System.out.println("\nBook Information\nTitle: " + title + "\nAuthor: " + author + "\nYear: " + year
                + "\nBorrowed: " + borrowed);
    }

    // Implementation of borrowBook method
    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // Implementation of returnBook method
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " is not borrowed.");
        }
    }
}