class Fiction extends Book {
    Fiction (String title, String author) {
        super(title, author); 
        //using super function to access the parent class directly above this subclass
        //and get these strings
    }
    
    @Override
    void displayInfo() {//displays the info given by main class
        System.out.println("Ficiton book: " + title + "by: " + author);
    }
}