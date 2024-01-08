package com.platform.customer.service;

import com.platform.customer.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String addMovie(Movie movie) {
        return "Successfully added movie";
    }

    public String deleteMovie(String movieId) {
        return "Successfully deleted movie";
    }
}
