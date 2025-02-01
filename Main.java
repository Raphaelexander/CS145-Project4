public class Main {
    public static void main(String[] args) {
        Book[] inventory = {
            new Fiction("The Hobbit", "J.R.R. Tolkien"),
            new Nonfiction("Hidden Figures", "Margot Lee Shetterly"),
            new Fiction("Dune", "Frank Herbert"),
            new Nonfiction("Gray's Anatomy", "Henry Gray")
        };
        
        for (Book book : inventory) {
            book.displayInfo();
        }
    }
}