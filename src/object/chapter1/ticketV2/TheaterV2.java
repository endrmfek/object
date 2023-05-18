package object.chapter1.ticketV2;

/**
* 극장 클래스.
 * - 관람객을 맞이해야된다.
* */
public class TheaterV2 {
    private TicketSellerV2 ticketSeller;

    public TheaterV2(TicketSellerV2 ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //enter 로직을 ticketSeller로 이동.
    public void enter(AudienceV2 audience) {
        ticketSeller.sellTo(audience); // 위임.
    }

}
