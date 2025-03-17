package com.lizi.test;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * 描述信息.
 *
 * @author xushenghao
 * @since 2023/05/15
 */
public class SimulateLight {

    private static final Map<String, String> SIMULATE_LIGHT_MAP;

    private static final int COUNTDOWN_DURATION_SECONDS = 10;
    private static final List<String> SIMULATE_LIGHT_LIST;

    private static final Map<String, String> OPTION_MAP;

    static {
        SIMULATE_LIGHT_MAP = new HashMap<>();
        SIMULATE_LIGHT_MAP.put("请开启前照灯", "近光灯");
        SIMULATE_LIGHT_MAP.put("同方向近距离跟车行驶", "近光灯");
        SIMULATE_LIGHT_MAP.put("通过急弯", "远近光交替");
        SIMULATE_LIGHT_MAP.put("通过坡路", "远近光交替");
        SIMULATE_LIGHT_MAP.put("通过拱桥", "远近光交替");
        SIMULATE_LIGHT_MAP.put("通过人行横道", "远近光交替");
        SIMULATE_LIGHT_MAP.put("通过没有交通信号灯控制的路口", "远近光交替");
        SIMULATE_LIGHT_MAP.put("与机动车会车", "近光灯");
        SIMULATE_LIGHT_MAP.put("通过交通信号灯控制的路口", "近光灯");
        SIMULATE_LIGHT_MAP.put("超越前方车辆", "左转向灯三秒，远近光交替，右转向灯三秒，回近光灯");
        SIMULATE_LIGHT_MAP.put("在照明不良的道路行驶", "远光灯");
        SIMULATE_LIGHT_MAP.put("在无照明的道路行驶", "远光灯");
        SIMULATE_LIGHT_MAP.put("在有路灯、照明良好的道路上行驶", "近光灯");
        SIMULATE_LIGHT_MAP.put("路边临时停车", "视宽灯＋报警灯");

        SIMULATE_LIGHT_LIST = new ArrayList<>(SIMULATE_LIGHT_MAP.keySet());

        OPTION_MAP = new HashMap<>();
        OPTION_MAP.put("A", "近光灯");
        OPTION_MAP.put("B", "远近光交替");
        OPTION_MAP.put("C", "左转向灯三秒，远近光交替，右转向灯三秒，回近光灯");
        OPTION_MAP.put("D", "远光灯");
        OPTION_MAP.put("E", "视宽灯＋报警灯");
    }

    public static void main(String[] args) {
        List<String> examQuestionList = prepareExamQuestion();
        System.out.println("现在开始夜间模拟灯光考试，请在听到指令后，五秒内做出相应操作。");

        Scanner scanner = new Scanner(System.in);
        Consumer<String> answerConsumer = question -> {
            System.out.println(question);
            printOption();

            // 控制超时回答
            //countDown();
            String inputOption = scanner.next();
            String answer = SIMULATE_LIGHT_MAP.get(question);
            String inputAnswer = OPTION_MAP.getOrDefault(inputOption.toUpperCase(), "");
            if (!Objects.equals(inputAnswer, answer)) {
                System.out.println("答案是：" + answer);
                throw new RuntimeException("扣 100 分，考试结束！");
            }
        };

        examQuestionList.forEach(answerConsumer);
        System.out.println("请关闭所有灯光并起步，请起步继续完成考试");
    }

    private static void printOption() {
        System.out.println(OPTION_MAP.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "." + entry.getValue())
                .collect(Collectors.joining("  ")));
    }

    private static List<String> prepareExamQuestion() {
        List<String> examQuestionList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int questionIndex = new Random().nextInt(SIMULATE_LIGHT_LIST.size());
            examQuestionList.add(SIMULATE_LIGHT_LIST.remove(questionIndex));
        }
        return examQuestionList;
    }

    private static void countDown(){
       int timer = COUNTDOWN_DURATION_SECONDS;
       while(timer-- > 0){
           System.out.print("\r" + "倒计时：" + timer + " 秒");
           try {
               Thread.sleep(1000);
               if (System.in.available() > 0){
                   return;
               }
           } catch (InterruptedException | IOException e) {
               throw new RuntimeException("超时未作答");
           }
       }
        throw new RuntimeException("超时未作答");
    }

}
