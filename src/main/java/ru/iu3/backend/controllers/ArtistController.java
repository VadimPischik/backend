package ru.iu3.backend.controllers;

import javafx.scene.canvas.GraphicsContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.iu3.backend.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.iu3.backend.models.Country;
import ru.iu3.backend.repositories.ArtistRepository;
import ru.iu3.backend.repositories.CountryRepository;


import java.util.*;

@RestController
@RequestMapping("/api/v1")

public class ArtistController {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    ArtistRepository artistRepository;

    @PostMapping("/artists")
    public ResponseEntity<Object> createArtist(@RequestBody Artist artist) /*throws Exception */{
        //try {
            Optional<Country> cc = countryRepository.findById(artist.country.id);
            if (cc.isPresent()) {
                artist.country = cc.get();
            }
            //GraphicsContext artistRepository;
            Artist nc = artistRepository.save(artist);
            return new ResponseEntity<Object>(nc, HttpStatus.OK);

        /*}
        catch (Exception ex) {
            String error;
            error = "undefinederror";
            Map<String, String> map =  new HashMap<>();
            map.put("error", error);
            return ResponseEntity.ok(map);
        }*/
    }


}


