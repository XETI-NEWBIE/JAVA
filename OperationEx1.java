package operator;

public class OperationEx1 {

    public static void main(String[] args) {
        // 세 변수의 합
        int num1=10;
        int num2=20;
        int num3=30;
        int sum=num1 +num2 + num3;
        System.out.println(sum);

        //세 변수의 평균
         int average = (num1+num2+num3)/3;
        System.out.println(average);

        /*
        정답 확인
        : int sum = num1 + num2 + num3;
          int average = sum / 3; 하면 바로 끝난다
          System.out.println(sum);
          System.out.println(average);
          이렇게 하면 훨씬 더 깔끔하고 간단하다
          average에 들어가는 (num1+num2+num3)은 한 데 묶어 sum으로 생각해 구할 것!
         */
    }
}
