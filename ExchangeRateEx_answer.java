package cond.ex;

public class ExchangeRateEx_answer {
    public static void main(String[] args) {
        int dollar = 50;

        if (dollar<0) {
            System.out.println("잘못된 금액입니다");
        }   else if(dollar==0){
            System.out.println("환전할 금액이 없습니다");
        }   else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }
/* 정답 해설을 다시 봤는데, 환전금액을 1300원 환율로 계산해서 산출하는 부분을
 int 변수로 다르게 지정해서 깔끔하게 정리하신게 인상깊었다.. 내가 푼 문제 코드는 좀 더러운데
 확실히 이렇게 금액을 계산해서 지정해놓는 부분을 다른 변수로 다시 한 번 지정해서 산출하는게 훨씬 가독성도 높고 좋은 것 같다
 변수 다양하게 활용하는 법 익숙해져야지!!!!!!!!!
 */
}