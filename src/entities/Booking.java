package entities;

public class Booking {

    private int id;
    private User user;
    private Movie movie;
    private CinemaHall cinemaHall;
    private Show show;
    private double bookingAmount;

    public Booking() {
    }

    public Booking(int id, User user, double bookingAmount) {
        this.id = id;
        this.user = user;
        this.bookingAmount = bookingAmount;
    }

    public User getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public void updateMovieInCinema(Movie movie, CinemaHall cinemaHall) {
        //implementation
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setBookingAmount(double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }
    public double calculateBookingAmount() {
        return 78.90;
    }
}
