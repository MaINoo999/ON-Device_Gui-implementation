// Main.java
import java.util.Scanner; // 사용자 입력을 받기 위해 필요해!

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력 친구

        System.out.println("★☆ 간단 텍스트 RPG: 모험 시작! ☆★");
        System.out.print("당신의 이름을 입력하세요: ");
        String playerName = scanner.nextLine();

        // 1. 플레이어 생성! 너는 게임의 주인공이야!
        Player player = new Player(playerName, 100, 20); // (이름, 체력, 공격력)
        System.out.println("\n환영합니다, 용사 " + player.name + "님!");

        // 2. 몬스터 생성! 우리의 첫 번째 상대!
        Enemy goblin = new Enemy("작은 고블린", 50, 10); // (이름, 체력, 공격력)
        System.out.println("숲 속을 걷던 중, " + goblin.name + "이(가) 나타났다!\n");

        // 전투 현황 표시
        player.playStats();
        goblin.displayStats();

        // 3. 전투 시작! 플레이어나 몬스터 둘 중 하나가 쓰러질 때까지 싸워!
        while (player.isAlive() && goblin.isAlive()) { // 둘 다 살아있으면 계속 싸워!
            System.out.println("\n--- 당신의 턴 ---");
            System.out.println("1. 공격");
            // 나중에 '2. 아이템 사용', '3. 도망가기' 같은 선택지를 추가할 수 있어!
            System.out.print("어떤 행동을 하시겠습니까? (숫자 입력): ");

            String actionChoice = scanner.nextLine(); // 사용자 행동 입력 받기

            if (actionChoice.equals("1")) { // 만약 '1'을 입력했다면 공격!
                System.out.println(player.name + "(이)가 " + goblin.name + "을(를) 강력하게 공격합니다!");
                goblin.takeDamage(player.Power); // 플레이어가 몬스터에게 피해를 줘!

                // 몬스터가 쓰러졌는지 확인
                if (!goblin.isAlive()) { // 몬스터가 더 이상 살아있지 않다면?
                    System.out.println("\n🎉 " + goblin.name + "을(를) 물리쳤습니다! 승리!");
                    break; // 전투 종료!
                }

                // 몬스터의 턴
                System.out.println("\n--- " + goblin.name + "의 턴 ---");
                System.out.println(goblin.name + "(이)가 " + player.name + "을(를) 공격합니다!");
                player.Damage(goblin.attackPower); // 몬스터가 플레이어에게 피해를 줘!

                // 플레이어가 쓰러졌는지 확인
                if (!player.isAlive()) { // 플레이어가 더 이상 살아있지 않다면?
                    System.out.println("\n😭 " + player.name + "(이)가 쓰러졌습니다... 게임 오버!");
                    break; // 전투 종료!
                }

                // 현재 상태 다시 보여주기
                System.out.println("\n----- 현재 상황 -----");
                player.playStats();
                goblin.displayStats();

            } else {
                System.out.println("잘못된 행동입니다. '1'을 입력하여 공격할 수 있습니다.");
            }
        }

        scanner.close(); // 다 썼으니 스캐너는 닫아주는 게 좋아!
        System.out.println("\n--- 게임을 종료합니다 ---");
    }
}