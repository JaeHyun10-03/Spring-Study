package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){ // VIP는 == 써서 비교하는거다. equals() 안쓴다.
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
