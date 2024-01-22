package com.feriados.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.feriados.api.feriados.Holidays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("holidays")
public class HolidaysController {

    private Holidays holiday = new Holidays();
    
    @GetMapping
    public String getHolidays(){
        return this.holiday.showHolidays();
    }

    @GetMapping("/{data}")
    public String getIsHoliday(@PathVariable String data){
        return this.holiday.isHoliday(data);
    }

}
