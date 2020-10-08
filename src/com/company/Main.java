package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
           // Using normal Array
            /* int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                arr[i] = (int) (Math.random() * 49);
                System.out.println(arr[i]);
            }*/

        // Using ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 6;i++) {
            arr.add((int) (Math.random() * 49));
            Collections.sort(arr);
            }
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println("===============================");

        //using Set
        /*Set<Integer> arr1 = new TreeSet<>();
        for(int i = 0; i < 6;i++) {
            arr1.add((int) (Math.random() * 49));
        }


        for(int i : arr1){
            System.out.println(i);
        }*/

        ArrayList<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie(0.8,"order",2015);
        Movie m2 = new Movie(2.8,"star",2020);
        Movie m3 = new Movie(4.8,"titan",1990);
        Movie m4 = new Movie(6.8,"base",2018);

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);

        Collections.sort(movies);
        System.out.println(" ================Sorting year===========");
        for (Movie i : movies){
            System.out.println(i.getYear());
        }

        System.out.println("=============Sorting by rate=============");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movies,ratingCompare);
        for (Movie i : movies){
            System.out.println(i.getRating());
        }

        System.out.println("=============Sorting by name=============");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(movies,nameCompare);
        for (Movie i : movies){
            System.out.println(i.getName());
        }
































       /* List<Integer> values = new ArrayList<Integer>();
        values.add(4);
        values.add(6);
        values.add(16);
        values.add(1,9);
        Collections.sort(values);

        *//*for (int i : values){
            System.out.println(i);
        }*//*

        Set<Person>people = new HashSet<Person>();

        Person george = new Person("George");
        Person dave = new Person("Dave");

        people.add(george);
        people.add(dave);
        System.out.println(people.contains(dave));
        System.out.println(people.contains("dave1"));

        for(Person i : people){
            System.out.println(i.getName());
        }


        values.forEach(System.out::println);




        }*/
    }
}
