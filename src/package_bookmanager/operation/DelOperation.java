package package_bookmanager.operation;

import package_bookmanager.book.Book;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除书籍序号：");
        String id = scanner.next();

        //查找
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getId().equals(id)) {
                //找到了
                break;
            }
        }
        if (i >= bookList.getSize()) {
            //没找到
            System.out.println("未找到要删除书籍");
            return;
        }

        //删除    最后一个元素覆盖删除元素  删除最后一个元素
        Book lastBook = bookList.getBook(bookList.getSize() - 1);
        bookList.setBook(i, lastBook);
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功！");
    }
}
