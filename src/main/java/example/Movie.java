package example;

public class Movie {
    private final String title;
    private final MovieType priceCode;
    public enum MovieType {
        REGULAR, NEW_RELEASE, CHILDRENS
    }

    public Movie(String title, MovieType priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public MovieType getPriceCode() {
        return priceCode;
    }

    public String getTitle (){
        return title;
    }

}