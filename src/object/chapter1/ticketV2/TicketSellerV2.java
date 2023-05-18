package object.chapter1.ticketV2;

/**
 * 판매원 클래스
 * - 자신이 일하는 매표소를 알고있어야함.
 * */
public class TicketSellerV2 {
    private TicketOfficeV2 ticketOffice;

    public TicketSellerV2(TicketOfficeV2 ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /* 더이상 ticketOffice를 노출할 필요가 없음. -> 캡슐화
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
    */

    public void sellTo(AudienceV2 audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }


}
