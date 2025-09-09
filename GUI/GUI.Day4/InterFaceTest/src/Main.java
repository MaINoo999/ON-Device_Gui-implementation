class Horse{
    public void run() {
        System.out.println("말처럼 달리다.");
    }
}
interface IWing {
    public void fly();
}
interface IVersionChina {
}
interface IVersionJapan {
}

class Unicorn extends Horse implements IWing, IVersionJapan{
    @Override
    public void fly() {
        System.out.println("새처럼 날다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Unicorn unicorn = new Unicorn();
        unicorn.run();
        unicorn.fly();
    }
}