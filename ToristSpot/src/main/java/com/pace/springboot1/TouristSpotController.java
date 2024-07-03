package com.pace.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/touristspots")
public class TouristSpotController {

    @Autowired
    private TouristSpotService service;

    @GetMapping
    public List<TouristSpot> getAllTouristSpots() {
        return service.getAllTouristSpots();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TouristSpot> getTouristSpotById(@PathVariable Long id) {
        return service.getTouristSpotById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TouristSpot addTouristSpot(@RequestBody TouristSpot touristSpot) {
        return service.addTouristSpot(touristSpot);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TouristSpot> updateTouristSpot(@PathVariable Long id, @RequestBody TouristSpot touristSpot) {
        TouristSpot updatedSpot = service.updateTouristSpot(id, touristSpot);
        if (updatedSpot != null) {
            return ResponseEntity.ok(updatedSpot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTouristSpot(@PathVariable Long id) {
        service.deleteTouristSpot(id);
        return ResponseEntity.noContent().build();
    }
}