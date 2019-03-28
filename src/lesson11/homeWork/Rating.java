package lesson11.homeWork;

public class Rating {
    private double rating;
    private double vote;

    public Rating(double rating, double vote) {
        this.rating = rating;
        this.vote = vote;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }
}
