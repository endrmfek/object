package object.chapter1.ticketV1;

/**
* 극장 클래스.
 * - 관람객을 맞이해야된다.
* */
public class TheaterV1 {
    private TicketSellerV1 ticketSeller; // 얘 왜있어야됨??..

    public TheaterV1(TicketSellerV1 ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(AudienceV1 audience) {
        if(audience.getBag().hasInvitation()) { // 관람객의 가방에서 티켓을 확인해. (이걸왜 소극장이 해? -> 매표소에서 해야되는거 아님?)
            TicketV1 ticket = ticketSeller.getTicketOffice().getTicket(); // 갑자기 판매원이 일하는 매표소를 참조해서 티켓을 가져와?..
            audience.getBag().setTicket(ticket);
        } else {
            TicketV1 ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
