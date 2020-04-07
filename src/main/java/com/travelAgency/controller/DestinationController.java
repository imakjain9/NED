package com.travelAgency.controller;


import com.travelAgency.response.DestinationResponse;
import com.travelAgency.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/top")
    public ResponseEntity<?> getTopDestinations(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        List<DestinationResponse> destinationResponses = destinationService.getTopDestinations(pageNo,pageSize);
        return new ResponseEntity<>(destinationResponses,HttpStatus.OK);

    }
}
