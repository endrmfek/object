package object.chapter2;

import java.time.Duration;

/**
 * 영화 객체
 * 제목, 사영시간, 기본요금, 할인정책을 가진다.
 *
 * 어떤 할인 정책을 가지는지는 객체 안에서 알 수 없다.
 * 할인 정책은 오직 하나여야한다.
 * */
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {return fee;}

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
