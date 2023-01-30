package com.mihingo.gpis.counties;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/counties")
public class CountyController {

    private final CountyService countyService;

    public CountyController(CountyService countyService) {
        this.countyService = countyService;
    }

    @GetMapping
    public ResponseEntity<List<County>> fetchAllCounties(){
        return new ResponseEntity<List<County>>(countyService.getAllCounties(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Optional<County>> fetchCountyByCode(@PathVariable Integer code){
        return new ResponseEntity<Optional<County>>(countyService.getCountyByCode(code), HttpStatus.OK);
    }
}
