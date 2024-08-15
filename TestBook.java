public class TestBook {
    public static void main(String[] args) {

        Author a1 = new Author("Martin wikramasinhe", "A123", "martin@12.com");
        Author a2 = new Author("Clack", "S157", "clack@example.com");

        // Now create a Book object using the Author object
        Book b1 = new Book("2048", a1, 600.0, 1545454);
        Book b2 = new Book("hi", a1, 800.0, 1500000);

        // Display the Book details
        System.out.println(b1.toString());
        b1.setAuthor(a2);
        System.out.println(b2.toString());
    }
}
