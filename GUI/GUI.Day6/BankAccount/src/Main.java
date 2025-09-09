import java.util.Scanner;
// Scanner 클래스를 불러와서 콘솔에서 사용자 입력을 받을 수 있도록 함

class BankAccount {
    private String accountHolder;  // 예금주 이름 저장용 (현재는 사용 안 하지만 향후 확장 가능)
    private long balance;          // 잔액을 저장, long 타입으로 큰 금액도 다룰 수 있게 함

    // 생성자: 계좌 생성 시 초기 잔액을 0으로 설정
    public BankAccount() {
        this.balance = 0;
    }

    // 입금 메서드
    public void deposit(long amount) {
        // 입금 금액이 0보다 커야 유효하므로 조건 검사
        if (amount > 0) {
            balance += amount;  // 잔액에 입금 금액 누적
            // 입금 완료 및 잔액 현황 출력
            System.out.println(amount + "원 입금완료, 현재잔액 : " + balance + "원");
        } else {
            // 0 이하 입금 시 오류 메시지 출력
            System.out.println("입금 금액은 0원보다 커야 합니다.");
        }
    }

    // 출금 메서드
    public void withdraw(long amount) {
        // 출금 금액이 0보다 크고 잔액보다 작거나 같아야 출금 가능
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // 잔액에서 출금 금액 차감
            // 출금 완료 및 잔액 현황 출력
            System.out.println(amount + "원 출금완료, 현재잔액 : " + balance + "원");
        } else if (amount > balance) {
            // 잔액 부족 시 알림 메시지 출력
            System.out.println("잔액이 부족합니다.");
        } else {
            // 0 이하 출금 시 오류 메시지 출력
            System.out.println("출금 금액은 0원보다 커야 합니다.");
        }
    }

    // 현재 잔액 출력 메서드
    public void getBalance() {
        // 잔액 정보를 사용자에게 보여줌
        System.out.println("현재 잔액 : " + balance + "원");
    }
}

public class Main {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // BankAccount 객체 생성 (새 계좌)
        BankAccount ba = new BankAccount();

        // 사용자에게 입금 금액 입력 요청 및 long 타입으로 받음
        System.out.print("입금할 금액을 입력하세요: ");
        long depositAmount = scanner.nextLong();
        ba.deposit(depositAmount);  // 입금 처리

        // 사용자에게 출금 금액 입력 요청 및 long 타입으로 받음
        System.out.print("출금할 금액을 입력하세요: ");
        long withdrawAmount = scanner.nextLong();
        ba.withdraw(withdrawAmount);  // 출금 처리

        // 최종 잔액 출력
        ba.getBalance();

        // 입력 자원 해제
        scanner.close();
    }
}
