package service;

import entities.*;

import java.util.List;

public class MovieTicketBookingService {

    private Movie movie;
    private List<Booking> bookings;
    private static MovieTicketBookingService instance;

    private MovieTicketBookingService(){

    }
    // we can have a thread safe as well
    public synchronized static MovieTicketBookingService getInstance(){
        if(instance == null){
            instance = new MovieTicketBookingService();
        }
        return instance;
    }

    public List<Show> viewShowsForMovie(Movie movie) {
        return movie.getShows();
    }

    public List<Seat> viewSeatForCinemaHall(CinemaHall cinemaHall) {
        return cinemaHall.getSeats();
    }

    public Booking createBooking(Movie movie, Seat seat, Show show, CinemaHall cinemaHall) {
        Booking booking = new Booking();
        booking.setMovie(movie);
        booking.setShow(show);
        booking.setCinemaHall(cinemaHall);
        double amount = booking.calculateBookingAmount();
        booking.setBookingAmount(amount);
        bookings.add(booking);
        return booking;
    }
    public List<Booking> viewBookings() {
        return bookings;
    }

    public void cancelBooking(Booking booking) {
        bookings.remove(booking);
    }









}
