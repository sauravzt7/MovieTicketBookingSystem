package entities;

import java.util.UUID;

public class Admin extends Person {
    private UUID adminID;

    public Admin(String name, int age, String gender, String phone) {
        super(name, age, gender, phone);
        this.adminID = UUID.randomUUID();
    }

    public UUID getAdminID() {
        return adminID;
    }

    public void addMovieToCinema(Movie movie, CinemaHall cinemaHall) {
        if(movie == null) {
            System.out.println("You are trying to add a movie to the cinema!");
            return;
        }
        cinemaHall.getMovies().add(movie);
    }

    public void removeMovieFromCinema(Movie movie, CinemaHall cinemaHall) {
        if(movie == null || cinemaHall == null) {
            System.out.println("You are trying to remove a null movie from the cinema!");
        }
        if(cinemaHall.getMovies().contains(movie)) {
            cinemaHall.getMovies().remove(movie);
        }
        else{
            System.out.println("Movie not found!");
        }
    }

    public void updateMovieInCinema(Movie movie, CinemaHall cinemaHall) {
        //implementation
    }


    public void updateShowsInCinema(Movie movie, CinemaHall cinemaHall) {
        //implementation
    }

    public void updateSeatsInCinema(CinemaHall cinemaHall) {
        //implementation
    }
}
