package javaClass;

public interface YouInterface {
    public void run();
}
class MyClass implements YouInterface{
    public static void sleep(){
        System.out.println("sleeping");
    }

    @Override
    public void run() {

    }
}
