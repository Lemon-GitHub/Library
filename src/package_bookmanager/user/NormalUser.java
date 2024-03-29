package package_bookmanager.user;

import package_bookmanager.operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);

        //构造operation数组 与菜单匹配
        operations = new IOperation[] {
          new ExitOperation(),
          new FindOperation(),
          new BorrowedOperation(),
          new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============");
        System.out.println("hello " + name);
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出");
        System.out.println("=============");
        System.out.println("请输入您的选择");

        //close本质上关闭system.in 不能盲目关闭
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
