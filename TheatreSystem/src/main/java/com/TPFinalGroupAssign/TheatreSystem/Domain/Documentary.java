package com.TPFinalGroupAssign.TheatreSystem.Domain;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Documentary implements Movie
{
    @Id
    @GeneratedValue
    private Long movieId;
    private int duration;
    private String title;

    public Documentary()
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


    public Documentary(Builder builder){
        this.movieId = builder.movieId;
        this.duration = builder.duration;
        this.title = builder.title;
    }

    public static class Builder{

        private Long movieId;
        private String title;
        private int duration;


        public Builder movie_id(Long movie_id) {
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


        public Documentary build(){
            return  new Documentary(this);
        }
    }
}