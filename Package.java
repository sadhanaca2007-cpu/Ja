package MyPack;

public interface MyInterface {
    void show();
}
package MyPack;

public class MyClass implements MyInterface {
    public void show() {
        System.out.println("Interface method implemented");
    }
}
import MyPack.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}