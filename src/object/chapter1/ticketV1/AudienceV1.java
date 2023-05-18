package object.chapter1.ticketV1;

/**
 * 관객 클래스
 * */
public class AudienceV1 {
    private BagV1 bag;

    public AudienceV1(BagV1 bag) {
        this.bag = bag;
    }

    public BagV1 getBag() {
        return bag;
    }
}
