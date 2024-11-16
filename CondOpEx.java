package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String strong = (a > b) ? "a입니다." : "b입니다.";
        System.out.println("더 큰 숫자는 " + strong );
    }
}
