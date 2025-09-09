package Hero;

public class Main
{
    public static void main(String[] args) {
        com.google.base.Story stroy = new com.google.base.Story();
        stroy.initStoryWrite();

        System.out.println("그럼 이제 등장하는 영웅은 누구인가???");
        Knight joy = new Knight("조이");
        System.out.println(joy.getName());
    }
}