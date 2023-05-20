package object.chapter2;


import java.time.LocalDateTime;

/**
* 상영 객체
 * 상영할 영화, 순번, 시작 시간을 가진다.
* */
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    /**
     * 예약 메서드 (관객, 인원)
     * */
    public Reservation reserve(Customer customer, int audienceCount) {
        //어떤 영화를 예약하는지 명시하지 않아.
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    /**
     * 요금계산 메서드
     * */
    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

}

