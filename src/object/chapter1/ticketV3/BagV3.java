package object.chapter1.ticketV3;

import object.chapter1.ticketV2.InvitationV2;
import object.chapter1.ticketV2.TicketV2;

/**
 * 가방 클래스
 *  - 초대장, 티켓, 현금을 가진다.
 * */
public class BagV3 {
    private Long amount;
    private InvitationV3 invitation;
    private TicketV3 ticket;

    //초대장을 가진 경우
    public BagV3(InvitationV3 invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    //초대장을 가지지 못한 경우
    public BagV3(long amount) {
        this(null, amount);
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(TicketV3 ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Long hold(TicketV3 ticket) {
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
