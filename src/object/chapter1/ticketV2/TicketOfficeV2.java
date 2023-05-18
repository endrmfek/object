package object.chapter1.ticketV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 티켓 판매소 클래스
 *   - 현금과 티켓들을 가지고있다.
* */
public class TicketOfficeV2 {
    private Long amount;
    private List<TicketV2> tickets = new ArrayList<>();

    public TicketOfficeV2(Long amount, TicketV2... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public TicketV2 getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
