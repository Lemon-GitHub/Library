package package_bookmanager.operation;

import package_bookmanager.book.Book;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还书籍的编号：");
        String id = scanner.next();

        for (int i = 0; i < bookList.getSize(); i++) {
            Book book  = bookList.getBook(i);
            if(!book.getId().equals(id)){
                continue;
            }

            //找到书籍 执行还书操作
            if(!book.isBorrowed()){
                System.out.println("该书籍已被他人归还！");
                break;
            }
            book.setBorrowed(false);
            System.out.println("归还成功！");
        }
    }
}
