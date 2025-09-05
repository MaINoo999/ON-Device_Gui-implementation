// src/IdiomDataLoader.java

import java.io.BufferedReader; // 텍스트 파일을 효율적으로 읽기 위한 클래스입니다.
import java.io.FileReader;     // 파일에서 문자를 읽기 위한 클래스입니다.
import java.io.IOException;    // 입출력 작업 중 발생할 수 있는 오류를 처리하기 위한 예외 클래스입니다.
import java.util.ArrayList;    // 동적으로 크기가 조절되는 리스트를 사용하기 위한 클래스입니다.
import java.util.List;         // 컬렉션 프레임워크의 List 인터페이스를 사용하기 위한 것입니다.

// IdiomDataLoader 클래스는 외부 파일(CSV)로부터 사자성어 데이터를 로드하는 역할을 합니다.
public class IdiomDataLoader {

    // CSV 파일에서 사자성어 데이터를 불러오는 정적(static) 메서드입니다.
    // 프로그램 시작 시 한 번만 로드하면 되므로 정적 메서드로 구현되었습니다.
    public static List<Idiom> loadIdiomsFromCsv(String filePath) {
        // 불러온 Idiom 객체들을 저장할 빈 리스트를 생성합니다.
        List<Idiom> idioms = new ArrayList<>();
        // 파일을 한 줄씩 읽기 위한 BufferedReader 변수를 선언합니다. 초기값은 null입니다.
        BufferedReader br = null;
        // 파일에서 읽어온 한 줄의 내용을 저장할 String 변수입니다.
        String line;

        // try-catch 블록은 파일 입출력 작업 중 발생할 수 있는 예외(오류)를 처리하기 위해 사용됩니다.
        try {
            // 지정된 파일 경로(filePath)에 있는 파일을 읽기 위한 FileReader를 생성하고,
            // 이를 BufferedReader로 감싸서 효율적인 라인 단위 읽기를 가능하게 합니다.
            br = new BufferedReader(new FileReader(filePath));
            // 파일의 끝(null)에 도달할 때까지 한 줄씩 읽어와 line 변수에 저장하며 반복합니다.
            while ((line = br.readLine()) != null) {
                // 읽어온 한 줄(line)을 쉼표(,)를 기준으로 최대 2개의 부분(parts)으로 나눕니다.
                // '2'는 설명 안에 쉼표가 있을 경우를 대비하여 첫 쉼표에서만 분리하게 합니다.
                String[] parts = line.split(",", 2);
                // 나눈 부분이 정확히 2개(사자성어, 설명)인 경우에만 처리합니다.
                if (parts.length == 2) {
                    // 첫 번째 부분(parts[0])을 사자성어로 간주하고 앞뒤 공백을 제거합니다.
                    String idiomText = parts[0].trim();
                    // 두 번째 부분(parts[1])을 설명으로 간주하고 앞뒤 공백을 제거합니다.
                    String descriptionText = parts[1].trim();
                    // 새로운 Idiom 객체를 생성하여 (설명, 사자성어) 순서로 리스트에 추가합니다.
                    idioms.add(new Idiom(descriptionText, idiomText));
                }
            }
        } catch (IOException e) { // 파일 읽기 중 IOException이 발생했을 경우 이 블록이 실행됩니다.
            // 오류 메시지를 표준 에러 스트림(콘솔)에 출력합니다.
            System.err.println("사자성어 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            // 예외의 상세 호출 스택을 출력하여 오류 발생 지점을 파악하는 데 도움을 줍니다.
            e.printStackTrace();
        } finally { // finally 블록은 try 또는 catch 블록이 실행된 후 항상 실행됩니다.
            // BufferedReader(br) 객체가 null이 아닌지 (즉, 정상적으로 생성되었는지) 확인합니다.
            if (br != null) {
                try {
                    // 열었던 BufferedReader를 닫아서 파일 자원을 해제합니다.
                    // close() 메서드도 IOException을 발생시킬 수 있으므로 다시 try-catch로 감싸줍니다.
                    br.close();
                } catch (IOException e) {
                    // BufferedReader를 닫는 도중 오류가 발생했을 경우 메시지를 출력합니다.
                    System.err.println("BufferedReader를 닫는 중 오류가 발생했습니다: " + e.getMessage());
                }
            }
        }
        // 불러온 사자성어(Idiom) 객체들이 담긴 리스트를 반환합니다.
        return idioms;
    }
}