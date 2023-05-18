package object.chapter1.ticketV3;

import object.chapter1.ticketV2.AudienceV2;
import object.chapter1.ticketV2.TicketOfficeV2;

/**
 * 판매원 클래스
 * - 자신이 일하는 매표소를 알고있어야함.
 * */
public class TicketSellerV3 {
    private TicketOfficeV3 ticketOffice;

    public TicketSellerV3(TicketOfficeV3 ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /* 더이상 ticketOffice를 노출할 필요가 없음. -> 캡슐화
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
    */

    public void sellTo(AudienceV3 audience) {
        ticketOffice.sellTicketTo(audience);
    }


}
