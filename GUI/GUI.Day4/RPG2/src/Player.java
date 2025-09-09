public class Player {

    String name; // 플레이어 이름
    int HP; //체력
    int Power; // 공격력

    // 플레이어의 이름 체력 공격력을 정해주는 생성자
    public Player(String name, int HP, int Power){
        this.name = name;
        this.HP = HP;
        this.Power = Power;
    }

    // 공격을 받으면 입는 데미지 메소드
    public void Damage(int damage){
        this.HP = HP- damage;   //체력에서 피해받으만큼 빼기
        if(this.HP < 0){    // 체력이 0밑으로 내려가는것을 방지하기위해 0보다 작으면 체력을 0으로 설정
            this.HP = 0;
        }
        System.out.println(this.name+"님 "+damage+"의 공격을 받았습니다 현재 체력: "+this.HP);
    }
    // 플레이어가 살아있는지 확인하는 메소드
    public boolean isAlive(){
        return this.HP > 0;   //체력이 0보다 크면 살아있음
    }
    // 플레이어의 현재 상태
    public void playStats(){
        System.out.println(this.name+"님의 현재 상태 : [체력: "+ this.HP+" 공격력: "+ this.Power+"]");
    }
}
