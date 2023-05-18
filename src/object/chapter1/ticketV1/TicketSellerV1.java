package object.chapter1.ticketV1;

/**
 * 판매원 클래스
 * - 자신이 일하는 매표소를 알고있어야함.
 * */
public class TicketSellerV1 {
    private TicketOfficeV1 ticketOffice;

    public TicketSellerV1(TicketOfficeV1 ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOfficeV1 getTicketOffice() {
        return ticketOffice;
    }

}
