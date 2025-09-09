// Enemy.java
public class Enemy {
    String name;      // 몬스터의 이름
    int health;       // 몬스터의 체력 (HP)
    int attackPower;  // 몬스터의 공격력

    // 몬스터를 만들 때 이름, 체력, 공격력을 정해주는 생성자
    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // 공격을 받으면 체력이 줄어드는 메소드
    public void takeDamage(int damage) {
        this.health -= damage; // 체력에서 피해량만큼 빼기
        if (this.health < 0) { // 체력이 0보다 작아지면 0으로 만들어줘서 마이너스 체력이 안 되게 함
            this.health = 0;
        }
        System.out.println(this.name + "(이)가 " + damage + "의 피해를 입었습니다. 현재 체력: " + this.health);
    }

    // 몬스터가 살아있는지 확인하는 메소드
    public boolean isAlive() {
        return this.health > 0; // 체력이 0보다 많으면 살아있는 것!
    }

    // 몬스터의 현재 상태를 보여주는 메소드
    public void displayStats() {
        System.out.println(this.name + "의 현재 상태: [체력: " + this.health + " / 공격력: " + this.attackPower + "]");
    }
}