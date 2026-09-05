package com.realestate;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class PropertyController {

    @GetMapping("/properties")
    public List<String> properties() {
        return Arrays.asList(
            "Luxury Apartment - Chennai - ₹75 Lakhs",
            "Independent House - Bangalore - ₹1.2 Crore",
            "Villa - Mumbai - ₹2 Crore"
        );
    }
}
