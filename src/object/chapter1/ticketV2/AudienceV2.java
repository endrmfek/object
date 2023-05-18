package object.chapter1.ticketV2;

/**
 * 관객 클래스
 * */
public class AudienceV2 {
    private BagV2 bag;

    public AudienceV2(BagV2 bag) {
        this.bag = bag;
    }

//    public Bag getBag() { 접근 금지
//        return bag;
//    }

    public Long buy(TicketV2 ticket) {
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
