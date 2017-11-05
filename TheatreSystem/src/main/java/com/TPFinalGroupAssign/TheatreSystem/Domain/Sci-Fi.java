

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Sci-Fi implements Movie_Genre
{
    @Id
    @GeneratedValue
    private Long movieId;
    private int duration;
    private String title;

    public SciFi()
    {

    }

    public Long getMovieId()
    {
        return movieId;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public SciFi(Builder builder){
        this.movieId = builder.movieId;
        this.duration = builder.duration;
        this.title = builder.title;
    }

    public static class Builder{

        private Long movieId;
        private String title;
        private int duration;

        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }


        public Sci-Fi build(){
            return  new SciFi(this);
        }
    }
}