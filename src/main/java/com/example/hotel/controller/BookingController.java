package com.example.hotel.controller;

import com.example.hotel.model.Booking;
import com.example.hotel.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingRepository repo;
    public BookingController(BookingRepository repo){ this.repo = repo; }

    @GetMapping public List<Booking> all(){ return repo.findAll(); }
    @PostMapping public Booking create(@RequestBody Booking b){ return repo.save(b); }
}
