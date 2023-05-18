package object.chapter1.ticketV1;

/**
 * 가방 클래스
 *  - 초대장, 티켓, 현금을 가진다.
 * */
public class BagV1 {
    private Long amount;
    private InvitationV1 invitation;
    private TicketV1 ticket;

    //초대장을 가진 경우
    public BagV1(InvitationV1 invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    //초대장을 가지지 못한 경우
    public BagV1(long amount) {
        this(null, amount);
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(TicketV1 ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
