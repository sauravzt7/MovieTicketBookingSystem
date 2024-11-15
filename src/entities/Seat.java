package entities;

import enums.SeatType;

public class Seat {
    private int seatId;
    private SeatType seatType;
    private double seatPrice;
    private boolean seatAvailable;

    public Seat(int seatId, SeatType seatType, double seatPrice) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatPrice = seatPrice;
        this.seatAvailable = true;
    }

    public int getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }
}
