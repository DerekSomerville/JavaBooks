import java.util.List;

public class BookShop {

    protected List<String[]> loadBooks(){
        ReadDelimitedFile readDelimitedFile = new ReadDelimitedFile();
        return readDelimitedFile.getFileData("books.csv");
    }

    protected String bookInfo(String[] book){
        String info = "";
        for (String bookInfo : book){
            if (info == "") {
                info = bookInfo;
            } else {
                info += ", " + bookInfo;
            }
        }
        return info;
    }

    protected String getBooks(List<String[]> books){
        String message = "";
        for (String[] book : books ){
            message += bookInfo(book) + "\n";
        }
        return message;
    }

    protected static void print(String message){
        System.out.println(message);
    }

    public static void main (String[] args){
        BookShop bookShop = new BookShop();
        List<String[]> books = bookShop.loadBooks();
        String bookMessage = bookShop.getBooks(books);
        print(bookMessage);
    }
}
