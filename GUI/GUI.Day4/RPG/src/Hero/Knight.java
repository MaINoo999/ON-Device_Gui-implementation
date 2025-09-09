package Hero;

public class Knight extends Hero
{
    public Knight() {
        this.name = "기사";
        this.level = 10;
        this.hp = 200;
        this.mp = 30;
    }
    public Knight(String name) {
        this.name = name;
        this.level = 10;
        this.hp = 200;
        this.mp = 30;
    }

    @Override
    public void attack() {
        System.out.println("기사의 형태로 공격하다!!!!");
    }
}