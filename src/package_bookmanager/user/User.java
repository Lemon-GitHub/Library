package package_bookmanager.user;

import package_bookmanager.book.BookList;
import package_bookmanager.operation.IOperation;

abstract public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    //持有当前用户支持的操作对象
    protected IOperation[] operations;

    //打印菜单 不同用户不同菜单 抽象方法
    abstract public int menu();

    //根据菜单选项执行不同的操作 多态（避免if-else
    //多态
    public void doOperation(int choice, BookList bookList){
        //work方法被复写 调用子类方法
        operations[choice].work(bookList);
    }

}
