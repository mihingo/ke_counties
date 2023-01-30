package com.mihingo.gpis.counties;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountyService {
    private final ICountyRepository countyRepository;

    public CountyService(ICountyRepository countyRepository) {
        this.countyRepository = countyRepository;
    }

    public List<County> getAllCounties(){
        return countyRepository.findAll();
    }

    public Optional<County> getCountyByCode(Integer code){
        return countyRepository.findCountyByCode(code);
    }
}
