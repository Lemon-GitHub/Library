package package_bookmanager.book;

public class BookList {
    private Book[] books = new Book[100];
    private int size;

    public BookList(){
        books[0] = new Book("反正竞赛还很长","001","罗英锡",44,"传记",false);
        books[1] = new Book("小王子","002","abc",15,"童话",false);
        books[2] = new Book("杀死一只知更鸟","003","xxx",37,"小说",false);
        size = 3;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Book getBook(int index) {
        return books[index];
    }
    public void setBook(int index, Book book) {
        books[index] = book;
    }
}
