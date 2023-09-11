package com.innoqa.prices.controller;

import com.innoqa.prices.model.Price;
import com.innoqa.prices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PriceController {

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/getPrice")
    public List<Price> getPrice(@RequestParam Long brandId, @RequestParam Long productId, @RequestParam String date) {
        LocalDate applicationDate = LocalDate.parse(date);
        return priceService.findPricesByParameters(brandId, productId, applicationDate);
    }
}
