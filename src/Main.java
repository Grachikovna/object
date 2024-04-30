public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");
        Book book = new Book(author, "Капитанская дочка", 1836);
        book.setPublishYear(1830);

        System.out.println(book);
        System.out.println(author.equals(author2));


    }
}