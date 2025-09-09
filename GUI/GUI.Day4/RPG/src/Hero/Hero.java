package Hero;

public class Hero
{
    protected String name;
    protected int level;
    protected int hp;
    protected int mp;

    public Hero(){
        this.name = "영웅";
        this.level = 1;
        this.hp = 100;
        this.mp = 0;
    }
    public void attack(){
        System.out.println("공격하다!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}