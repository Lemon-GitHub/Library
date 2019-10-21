package package_bookmanager.operation;

import package_bookmanager.book.Book;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class BorrowedOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅书籍的编号：");
        String id = scanner.next();

        for (int i = 0; i < bookList.getSize(); i++) {
            Book book  = bookList.getBook(i);
            if(!book.getId().equals(id)){
                continue;
            }

            //找到书籍 执行借书操作
            if(book.isBorrowed()){
                System.out.println("该书籍已被他人借阅！");
                break;
            }
            book.setBorrowed(true);
            System.out.println("借阅成功！");
        }
    }
}
