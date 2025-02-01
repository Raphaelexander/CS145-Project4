abstract class Book {//using abstract class for added security, so only fiction and non fiction subclasses can access it
    protected String title;//protected strings so only the subclasses can access, no memory leakage
    protected String author;

    Book(String title, String author) { //constructor/setter
        this.title = title;
        this.author = author;
    }
    abstract void displayInfo();//initializing this method for subclasses
}
