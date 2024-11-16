package operator;

public class OperationEx2 {

    public static void main(String[] args) {
        // double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성해보자!

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1+val2+val3;
        double average = sum / 3;
        System.out.println(sum);
        System.out.println(average);

        /*
        정답확인 : 정답이다!
        한 가지 아쉬운건 average => avg로 표현할 수 있다는 점!
        외워두자 ~~~
         */
    }
}
