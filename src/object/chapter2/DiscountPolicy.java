package object.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* 할인 정책
 * - 공통 클래스를 만들어놓고 상속받음.
 * - 추상클래스 -> 추상메서드를 한개이상 가지고있는 클래스.
* */
public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        // 할인조건은 여러개가 붙을 수 있다.
        for (DiscountCondition each : conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
