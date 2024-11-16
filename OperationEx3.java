package operator;

public class OperationEx3 {
    public static void main(String[] args) {

        int score1 = 90; //score은 80점 이상이고 100점 이하일 때 true, 아니면 false 출력
        boolean result1 = (score1>=80) && (score1 <= 100);
        System.out.println("result=" + result1);

        int score2 = 50; //score은 80점 이상이고 100점 이하일 때 true, 아니면 false 출력
        boolean result2 = (score2>=80) && (score2 <= 100);
        System.out.println("result="+result2);

        /*
        정답확인 : 내가 너무 어렵게 생각했나?
        답안이 너무 단순한 걸수도 ;;
        int score = 80;
        boolean result = score = score >= 80 && score <= 100;
        System.out.println(result);
        진짜 개황당 괄호도 안 치고 출력도 result 하나만 넣고 간단히 끝냈다
        멋있다..
         */
    }
}
