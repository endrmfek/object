package object.chapter1.ticketV2;

/**
 * 가방 클래스
 *  - 초대장, 티켓, 현금을 가진다.
 * */
public class BagV2 {
    private Long amount;
    private InvitationV2 invitation;
    private TicketV2 ticket;

    //초대장을 가진 경우
    public BagV2(InvitationV2 invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    //초대장을 가지지 못한 경우
    public BagV2(long amount) {
        this(null, amount);
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(TicketV2 ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
