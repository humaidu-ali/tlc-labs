package com.company;

import java.util.Comparator;

class Movie implements Comparable<Movie>{
     private double rating;
     private  String name;
     private  int year;

     public int compareTo(Movie m){
         return  this.year - m.year;
     }


     public double getRating() {
         return rating;
     }

     public void setRating(double rating) {
         this.rating = rating;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getYear() {
         return year;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public Movie(double rating, String name, int year) {
         this.rating = rating;
         this.name = name;
         this.year = year;
     }
 }


class RatingCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        if (m1.getRating() < m2.getRating()){
            return  -1;
        }
        if(m1.getRating() > m2.getRating()){
            return 1;
        }
        else return 0;
    }
}

class NameCompare implements Comparator<Movie>{

    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

