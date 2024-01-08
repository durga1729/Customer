package com.platform.customer.controller;

import com.platform.customer.domain.Movie;
import com.platform.customer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addMovie")
    public ResponseEntity<String> addMovies(@RequestBody Movie movie) {
        return ResponseEntity.ok(adminService.addMovie(movie));
    }

    @DeleteMapping("/deleteMovie")
    public ResponseEntity<String> addMovies(@PathVariable String movieId) {
        return ResponseEntity.ok(adminService.deleteMovie(movieId));
    }
}
