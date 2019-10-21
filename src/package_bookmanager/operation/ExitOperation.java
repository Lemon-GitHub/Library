package package_bookmanager.operation;

import package_bookmanager.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("goodbye!");
        //0进程退出码 非0失败
        System.exit(0);
    }
}
