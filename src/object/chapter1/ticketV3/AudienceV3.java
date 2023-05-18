package object.chapter1.ticketV3;

import object.chapter1.ticketV2.BagV2;
import object.chapter1.ticketV2.TicketV2;

/**
 * 관객 클래스
 * */
public class AudienceV3 {
    private BagV3 bag;

    public AudienceV3(BagV3 bag) {
        this.bag = bag;
    }

//    public Bag getBag() { 접근 금지
//        return bag;
//    }

    public Long buy(TicketV3 ticket) {
        return bag.hold(ticket);
    }

}
