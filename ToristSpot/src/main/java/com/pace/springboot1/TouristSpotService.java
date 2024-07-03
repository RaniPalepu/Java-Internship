package com.pace.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristSpotService {

    @Autowired
    private TouristSpotRepository repository;

    public List<TouristSpot> getAllTouristSpots() {
        return repository.findAll();
    }

    public Optional<TouristSpot> getTouristSpotById(Long id) {
        return repository.findById(id);
    }

    public TouristSpot addTouristSpot(TouristSpot touristSpot) {
        return repository.save(touristSpot);
    }

    public TouristSpot updateTouristSpot(Long id, TouristSpot touristSpot) {
        if (repository.existsById(id)) {
            touristSpot.setId(id);
            return repository.save(touristSpot);
        } else {
            return null;
        }
    }

    public void deleteTouristSpot(Long id) {
        repository.deleteById(id);
    }
}
