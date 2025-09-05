// src/Idiom.java

// Idiom 클래스는 하나의 사자성어 데이터를 저장하기 위한 설계도입니다.
public class Idiom {
    // description 필드는 사자성어의 설명을 저장합니다. 이것이 퀴즈 문제로 제시됩니다.
    private String description;
    // idiom 필드는 사자성어 자체를 저장합니다. 이것이 퀴즈의 정답이 됩니다.
    private String idiom;

    // Idiom 클래스의 생성자입니다.
    // 새로운 Idiom 객체를 만들 때 설명과 사자성어를 초기화합니다.
    public Idiom(String description, String idiom) {
        this.description = description; // 매개변수로 받은 설명을 현재 객체의 description 필드에 할당합니다.
        this.idiom = idiom; // 매개변수로 받은 사자성어를 현재 객체의 idiom 필드에 할당합니다.
    }

    // description 필드의 값을 반환하는 Getter(게터) 메서드입니다.
    // 외부에서 description 필드에 직접 접근하지 못하도록 보호(캡슐화)하면서 값을 읽을 수 있게 합니다.
    public String getDescription() {
        return description;
    }

    // idiom 필드의 값을 반환하는 Getter(게터) 메서드입니다.
    // 외부에서 idiom 필드에 직접 접근하지 못하도록 보호하면서 값을 읽을 수 있게 합니다.
    public String getIdiom() {
        return idiom;
    }

    // (선택 사항) toString 메서드입니다.
    // Idiom 객체를 문자열로 표현할 때 사용됩니다. 주로 디버깅 목적으로 활용됩니다.
    @Override
    public String toString() {
        // 객체의 설명과 사자성어를 포함하는 형식으로 문자열을 반환합니다.
        return "Idiom{description='" + description + "', idiom='" + idiom + "'}";
    }
}