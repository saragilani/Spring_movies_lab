package com.example.cinema_lab.repositories;

import com.example.cinema_lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
//it has to pass through an Integer so you know which movie it is (i think)
public interface MovieRepository extends JpaRepository<Movie, Integer > {



}
