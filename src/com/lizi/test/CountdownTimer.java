package com.lizi.test;

import java.util.*;
import java.util.concurrent.TimeoutException;

/**
 * @author lizi
 * @since 2023-05-18
 **/
public class CountdownTimer {
    private static final int TIMEOUT = 10; // 超时时间（秒）
    private static final int NUM_QUESTIONS = 3; // 问题数量

    public static void main(String[] args) {
        List<String> questions = generateQuestions(NUM_QUESTIONS); // 生成问题列表
        Thread timerThread = new Thread(new TimerRunnable(TIMEOUT)); // 创建倒计时线程
        timerThread.start(); // 启动倒计时线程

        try {
            for (String question : questions) {
                ExamRunnable examRunnable = new ExamRunnable(question); // 创建考试线程
                Thread examThread = new Thread(examRunnable); // 将考试线程封装为 Thread
                examThread.start(); // 启动考试线程

                examThread.join(); // 等待考试线程结束
                String answer = examRunnable.getAnswer(); // 获取答案

                if (answer == null) {
                    // 超时，抛出异常
                    throw new TimeoutException("超时未作答");
                } else {
                    // 匹配答案
                    boolean isCorrect = matchAnswer(question, answer);
                    System.out.println("答案：" + answer + "，是否正确：" + isCorrect);
                }
            }
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }

    // 生成问题列表
    private static List<String> generateQuestions(int num) {
        Queue<Integer> queue = new ArrayDeque<>(10);
        List<String> questions = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            questions.add("问题 " + i + "：");
        }
        return questions;
    }

    // 匹配答案
    private static boolean matchAnswer(String question, String answer) {
        // TODO: 实现匹配答案的逻辑
        return true;
    }

    // 倒计时线程
    private static class TimerRunnable implements Runnable {
        private int timeout;

        public TimerRunnable(int timeout) {
            this.timeout = timeout;
        }

        @Override
        public void run() {
            for (int i = timeout; i > 0; i--) {
                System.out.println("倒计时：" + "\r" + i + " 秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 考试线程
    private static class ExamRunnable implements Runnable {
        private String question;
        private String answer;

        public ExamRunnable(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        @Override
        public void run() {
            System.out.println(question);

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
        }
    }
}
