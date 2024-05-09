
public class Main {
    public static void main(String[] args) {
        // Create objects for each type of book
        Textbook javaProgramming = new Textbook("Textbook:Java Programming", "John Smith", 2020, "Programming");
        Novel toKillAMockingbird = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine nationalGeographic = new Magazine("National Geographic", "Various", 2021, "Science");

        // Display book information
        System.out.println("----- Book Information -----");
        javaProgramming.displayInfo();
        toKillAMockingbird.displayInfo();
        nationalGeographic.displayInfo();

        // Borrow and return books
        System.out.println(" ");
        System.out.println("----- Borrowing and Returning Book -----");
        System.out.print("Textbook: ");
        javaProgramming.borrowBook();
        System.out.print("Magazine: ");
        nationalGeographic.borrowBook();
        System.out.print("Textbook: ");
        javaProgramming.returnBook();
        System.out.print("Novel: ");
        toKillAMockingbird.returnBook();
    }
}