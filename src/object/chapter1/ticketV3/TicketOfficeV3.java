package object.chapter1.ticketV3;

import object.chapter1.ticketV2.TicketV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 티켓 판매소 클래스
 *   - 현금과 티켓들을 가지고있다.
* */
public class TicketOfficeV3 {
    private Long amount;
    private List<TicketV3> tickets = new ArrayList<>();

    public TicketOfficeV3(Long amount, TicketV3... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private TicketV3 getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(AudienceV3 audience) {
        plusAmount(audience.buy(getTicket()));
    }

}
