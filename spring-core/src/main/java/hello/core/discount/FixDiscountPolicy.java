package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAount = 1000;    // 1000원 고정 할인

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == Grade.VIP ? discountFixAount : 0;
    }
}