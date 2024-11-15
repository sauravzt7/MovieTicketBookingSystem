package entities;

import java.util.List;

public class CinemaHall {

    private int cinemaId;
    private String name;
    private Address address;
    private List<Movie> movies;
    private List<Seat> seats;


    public CinemaHall(int cinemaId, String name, Address address, List<Movie> movies, List<Seat> seats) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.address = address;
        this.movies = movies;
        this.seats = seats;
    }


    public int getCinemaId() {
        return cinemaId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
