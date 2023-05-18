package object.chapter1.ticketV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 티켓 판매소 클래스
 *   - 현금과 티켓들을 가지고있다.
* */
public class TicketOfficeV1 {
    private Long amount;
    private List<TicketV1> tickets = new ArrayList<>();

    public TicketOfficeV1(Long amount, TicketV1... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public TicketV1 getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
