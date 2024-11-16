package cond.ex;

public class MovieEx_fail {

    public static void main(String[] args) {
        double rating = 9;

       if (rating >= 7) {
            System.out.println("고질라를 추천합니다");
        }
        else if (rating >= 8) {
            System.out.println("어바웃 타임을 추천합니다." + "토이스토리를 추천합니다. ");
        }
        else if (rating >= 9) {
            System.out.println("어바웃 타임을 추천합니다.");
        }
    }
}
/* 틀렸다 평점 높은 영화 추천하기 .. 준내빡쳐벌임
자꾸 값이 중복되어 나오거나 틀리게 뜨는데 답안이 초등학생도 이해할 수 있을 정도로 개쉬워서 현타와서 눈물이 난다 */