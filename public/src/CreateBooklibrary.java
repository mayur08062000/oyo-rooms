 class CreateBooklibrary {

static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;
    }
    CreateBooklibrary(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
  CreateBooklibrary(String isbn){
        this(isbn,"unknown","unknown" );
  }
  static int  getTotalNoOfBooks(){
        return totalNoOfBooks;
  }
  void  BorrowBook(){
      if (isBorrowed) {
          System.out.println("book is alrady borrowed");
      }else {
          this.isBorrowed = true;
          System.out.println("Book is avilable");
      }

  }

  void  returnBook(){
      if (isBorrowed) {
          this.isBorrowed = false;
          System.out.println("Please Give a revive of the book");
      }else {
          System.out.println("this book allready in lablary");
      }
  }

    public static void main(String[] args) {
        CreateBooklibrary harrypoter = new CreateBooklibrary("1");
        harrypoter.BorrowBook();
        harrypoter.BorrowBook();
        harrypoter.returnBook();
        harrypoter.returnBook();
        CreateBooklibrary patmavat = new CreateBooklibrary("1","history","mb bhosale");
        patmavat.returnBook();
    }
}
