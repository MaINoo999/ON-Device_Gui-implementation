// src/IdiomQuizApp.java

import javax.swing.*;       // 스윙 GUI 컴포넌트입니다.
import java.awt.*;          // 그래픽 및 UI 관련 기본 클래스입니다.
import java.awt.event.ActionEvent; // 액션 이벤트입니다.
import java.awt.event.ActionListener; // 액션 리스너 인터페이스입니다.
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList; // 동적 배열 리스트입니다.
import java.util.Collections; // 컬렉션 유틸리티입니다.
import java.util.List;      // 리스트 인터페이스입니다.

// Idiom 클래스 및 IdiomDataLoader 클래스가 같은 패키지에 있다면 별도 import 문 필요 없습니다.

// 사자성어 퀴즈 앱의 메인 GUI 클래스입니다.
public class IdiomQuizApp extends JFrame {

    // 퀴즈 데이터를 관리하는 필드입니다.
    private List<Idiom> allIdioms;        // 모든 사자성어를 저장하는 리스트입니다.
    private List<Idiom> quizIdioms;      // 현재 퀴즈에 사용될 사자성어 리스트입니다.
    private int currentQuizIndex = 0;    // 현재 퀴즈의 인덱스입니다.

    private int correctAnswersCount = 0;    // 맞힌 문제 수입니다.
    private int incorrectAnswersCount = 0;  // 틀린 문제 수입니다.  //

    // GUI 컴포넌트 필드입니다.
    private JLabel descriptionLabel;    // 문제 설명을 표시합니다.
    private JTextField answerField;     // 정답을 입력합니다.
    private JButton submitButton;       // 정답 확인 버튼입니다.
    private JButton nextButton;         // 다음 문제 버튼입니다.
    private JLabel feedbackLabel;       // 피드백 메시지를 표시합니다.
    private JButton exitButton;         // 종료 버튼입니다.
    private JButton startButton;        // 시작 버튼입니다.

    // CSV 파일 경로 상수입니다.
    private static final String IDIOM_CSV_FILE = "data/idioms.csv";

    // IdiomQuizApp 생성자입니다.
    public IdiomQuizApp() {
        // 창의 기본 설정을 합니다.
        setTitle("사자성어 퀴즈 앱");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // 레이아웃 매니저를 설정합니다.
        setLocationRelativeTo(null); // 창을 화면 중앙에 배치합니다.

        // 사자성어 데이터를 로드합니다.
        allIdioms = IdiomDataLoader.loadIdiomsFromCsv(IDIOM_CSV_FILE);
        System.out.println("DEBUG: 데이터 로드 완료. 개수: " + allIdioms.size());

        // 데이터 로드 실패 또는 비어 있을 경우 처리입니다.
        if (allIdioms.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "사자성어 데이터 파일(" + IDIOM_CSV_FILE + ")을 불러오거나 내용이 비어있습니다.\n기본 데이터를 사용하거나 파일을 확인해주세요.",
                    "데이터 로드 오류", JOptionPane.WARNING_MESSAGE);
            // 비상시 기본 데이터를 추가합니다.
            allIdioms.add(new Idiom("갈림길에서 오도가도 못함, 이러지도 저러지도 못하는 상황", "진퇴양난"));
            allIdioms.add(new Idiom("모순되어 앞뒤가 맞지 않음", "어불성설"));
            System.out.println("DEBUG: 데이터가 없어 기본 데이터로 초기화했습니다. 개수: " + allIdioms.size());
        }

        quizIdioms = new ArrayList<>(allIdioms); // 퀴즈용 리스트를 복사합니다.
        Collections.shuffle(quizIdioms); // 퀴즈 순서를 무작위로 섞습니다.
        System.out.println("DEBUG: 퀴즈 리스트 준비 완료. 개수: " + quizIdioms.size());

        // UI 컴포넌트를 담을 메인 패널을 생성합니다.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // 세로 방향으로 정렬합니다.
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20)); // 패널에 여백을 추가합니다.

        // descriptionLabel 초기화 및 추가입니다.
        descriptionLabel = new JLabel("시작 버튼을 눌러 퀴즈를 시작하세요!", SwingConstants.CENTER);
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // 중앙 정렬합니다.
        descriptionLabel.setPreferredSize(new Dimension(400, 150));
        descriptionLabel.setMaximumSize(new Dimension(400, 150)); // 최대 크기 설정입니다.
        descriptionLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        mainPanel.add(descriptionLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // 간격을 추가합니다.

        // answerField 초기화 및 추가입니다.
        answerField = new JTextField(25);
        answerField.setHorizontalAlignment(JTextField.CENTER); // 입력 텍스트를 가운데 정렬합니다.
        answerField.setAlignmentX(Component.CENTER_ALIGNMENT); // 중앙 정렬합니다.
        answerField.setPreferredSize(new Dimension(400, 30));
        answerField.setMaximumSize(new Dimension(400, 30)); // 최대 크기 설정입니다.
        answerField.setEnabled(false); // 초기에는 비활성화합니다.
        mainPanel.add(answerField);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // 간격을 추가합니다.

        // submitButton과 nextButton을 담을 패널입니다.
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0)); // 중앙 정렬 및 간격 설정입니다.
        submitButton = new JButton("정답 확인");
        submitButton.setEnabled(false); // 초기에는 비활성화합니다.
        buttonPanel.add(submitButton);

        nextButton = new JButton("다음 문제");
        nextButton.setEnabled(false); // 초기에는 비활성화합니다.
        buttonPanel.add(nextButton);
        mainPanel.add(buttonPanel); // 메인 패널에 버튼 패널을 추가합니다.
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); // 간격을 추가합니다.

        // feedbackLabel 초기화 및 추가입니다.
        feedbackLabel = new JLabel("");
        feedbackLabel.setHorizontalAlignment(SwingConstants.CENTER); // 피드백 텍스트를 가운데 정렬합니다.
        feedbackLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // 중앙 정렬합니다.
        feedbackLabel.setPreferredSize(new Dimension(400, 30));
        feedbackLabel.setMaximumSize(new Dimension(400, 30)); // 최대 크기 설정입니다.
        feedbackLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
        mainPanel.add(feedbackLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // 간격을 추가합니다.

        // 시작/종료 버튼을 담을 패널입니다.
        JPanel controlButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0)); // 중앙 정렬 및 간격 설정입니다.
        startButton = new JButton("시작");
        controlButtonPanel.add(startButton);

        exitButton = new JButton("종료");
        controlButtonPanel.add(exitButton);
        mainPanel.add(controlButtonPanel); // 메인 패널에 시작/종료 버튼 패널을 추가합니다.

        // 최종적으로 메인 패널을 프레임의 중앙에 추가합니다.
        add(mainPanel, BorderLayout.CENTER);

        // 컴포넌트에 이벤트 리스너를 추가합니다.
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 퀴즈 데이터가 없는 경우입니다.
                if (quizIdioms.isEmpty()) {
                    JOptionPane.showMessageDialog(IdiomQuizApp.this, "퀴즈 데이터가 없습니다. 파일을 확인해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                startButton.setVisible(false); // 시작 버튼을 숨깁니다.
                // exitButton.setVisible(false); // 퀴즈 시작 시 종료 버튼을 숨기려면 이 줄을 사용합니다.
                answerField.setEnabled(true); // 퀴즈 관련 컴포넌트를 활성화합니다.
                submitButton.setEnabled(true);
                feedbackLabel.setText("");
                correctAnswersCount = 0;
                incorrectAnswersCount = 0;
                currentQuizIndex = 0; // 혹시 모르니 인덱스 초기화
                Collections.shuffle(quizIdioms); // 퀴즈를 다시 시작할 때 문제를 다시 섞습니다.
                showNextQuiz(); // 첫 번째 퀴즈를 시작합니다.
                IdiomQuizApp.this.revalidate(); // UI 변경사항을 적용합니다.
                IdiomQuizApp.this.repaint();
                answerField.requestFocusInWindow();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer(); // 정답을 확인하는 메서드 호출입니다.
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextQuiz(); // 다음 퀴즈를 표시하는 메서드 호출입니다.
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // 애플리케이션을 종료합니다.
            }
        });

        answerField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // 이 메서드는 일반적으로 사용하지 않습니다.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // 이 메서드는 일반적으로 사용하지 않습니다.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // 엔터 키(VK_ENTER)가 눌렸다가 떨어질 때의 동작을 정의합니다.
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (submitButton.isEnabled()) { // submitButton이 활성화되어 있다면 (정답을 입력할 차례)
                        checkAnswer(); // 정답 확인 로직을 실행합니다.
                    } else if (nextButton.isEnabled()) { // nextButton이 활성화되어 있다면 (다음 문제로 넘어갈 차례)
                        showNextQuiz(); // 다음 문제 로직을 실행합니다.
                    }
                }
            }
        });

        // 애플리케이션의 초기 상태를 설정합니다.
        if (quizIdioms.isEmpty()) {
            descriptionLabel.setText("퀴즈 데이터가 없습니다. 파일을 확인해주세요.");
            startButton.setEnabled(false); // 시작 버튼을 비활성화합니다.
            submitButton.setEnabled(false);
            nextButton.setEnabled(false);
            answerField.setEnabled(false);
        } else {
            startButton.setEnabled(true); // 시작 버튼만 활성화합니다.
        }

        // JFrame 창을 보이게 설정합니다.
        setVisible(true);
    }

    // 다음 퀴즈 문제를 GUI에 표시하는 메서드입니다.
    private void showNextQuiz() {
        System.out.println("DEBUG: 다음 퀴즈를 표시합니다. 현재 인덱스: " + currentQuizIndex);
        if (currentQuizIndex < quizIdioms.size()) { // 남은 퀴즈가 있는지 확인합니다.
            Idiom currentIdiomObj = quizIdioms.get(currentQuizIndex); // 현재 퀴즈 객체를 가져옵니다.
            String descriptionToDisplay = currentIdiomObj.getDescription(); // 설명을 가져옵니다.
            System.out.println("DEBUG: 현재 퀴즈 설명: '" + descriptionToDisplay + "'");
            descriptionLabel.setText("<html><p style='text-align:center;'>" + descriptionToDisplay + "</p></html>"); // 설명을 표시합니다.
            answerField.setText(""); // 입력 필드를 초기화합니다.
            feedbackLabel.setText(""); // 피드백을 초기화합니다.
            submitButton.setEnabled(true); // 정답 확인 버튼을 활성화합니다.
            nextButton.setEnabled(false); // 다음 문제 버튼을 비활성화합니다.
            answerField.requestFocusInWindow(); // 입력 필드에 포커스를 줍니다.
        } else { // 모든 퀴즈가 완료된 경우입니다.
            System.out.println("DEBUG: 모든 퀴즈 완료.");

            int totalQuestions = quizIdioms.size(); // 총 문제 수입니다.
            String resultSummary = "<html><p style='text-align:center;'>모든 사자성어 퀴즈 완료!</p>" +
                    "<p style='text-align:center;'>총 문제 수: " + totalQuestions + "</p>" +
                    "<p style='text-align:center;'>맞힌 문제: " + correctAnswersCount + "</p>" +
                    "<p style='text-align:center;'>틀린 문제: " + incorrectAnswersCount + "</p></html>";

            descriptionLabel.setText(resultSummary); // 결과 요약을 표시합니다.
            answerField.setText("");
            answerField.setEnabled(false);
            submitButton.setEnabled(false);
            nextButton.setEnabled(false);
            feedbackLabel.setText("정말 대단해요! 수고하셨습니다!");
            exitButton.setVisible(true); // 종료 버튼을 다시 보이게 합니다.
            exitButton.setEnabled(true);
            startButton.setVisible(true); //퀴즈 완료 후 시작 버튼을 다시 보이게 합니다.
            startButton.setText("다시 시작"); // 시작 버튼 텍스트를 "다시 시작"으로 변경합니다.
        }
    }

    // 사용자의 정답을 확인하는 메서드입니다.
    private void checkAnswer() {
        Idiom currentIdiomObj = quizIdioms.get(currentQuizIndex); // 현재 퀴즈 객체입니다.
        String correctAnswer = currentIdiomObj.getIdiom(); // 정확한 정답입니다.
        String userAnswer = answerField.getText().trim(); // 사용자의 입력입니다.

        if (userAnswer.equalsIgnoreCase(correctAnswer)) { // 정답인 경우입니다.
            feedbackLabel.setText("정답입니다! 멋져요!");
            correctAnswersCount++; // 맞힌 문제 수 증가입니다.
            submitButton.setEnabled(false);
            nextButton.setEnabled(true);
        } else { // 오답인 경우입니다.
            feedbackLabel.setText("오답입니다. 정답은 '" + correctAnswer + "' 입니다.");
            incorrectAnswersCount++; // 틀린 문제 수 증가입니다.
            submitButton.setEnabled(false);
            nextButton.setEnabled(true);
        }
        currentQuizIndex++; // 퀴즈 인덱스를 증가시킵니다.
    }

    // 프로그램의 시작점입니다.
    public static void main(String[] args) {
        // Swing GUI 작업을 EDT(이벤트 디스패치 스레드)에서 실행합니다.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IdiomQuizApp(); // 퀴즈 앱 인스턴스를 생성하고 실행합니다.
            }
        });
    }
}