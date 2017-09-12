package com.example.demostudygroup.controllers;

import com.example.demostudygroup.model.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demostudygroup.model.HotelBooking;
import java.util.List;


@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    private BookingRepository bookingRepository;
    @Autowired

    public BookingController(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookingRepository.findAll();
    }

    @RequestMapping(value ="affordable/{price}",method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
       return bookingRepository.findByPricePerNightLessThan(price);

    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public List<HotelBooking>  create(@RequestBody HotelBooking hotelBooking) {
       bookingRepository.save(hotelBooking);
       return bookingRepository.findAll();
    }

    @RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
    public List<HotelBooking> remove(@PathVariable long id){
        bookingRepository.delete(id);
        return bookingRepository.findAll();
    }
    

}
