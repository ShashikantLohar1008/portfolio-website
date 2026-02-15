package com.example.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.AboutDTO;
import com.example.backend.entity.About;
import com.example.backend.mapper.AboutMapper;
import com.example.backend.repository.AboutRepository;

@RestController
@RequestMapping("/api/about")
@CrossOrigin("*")
public class AboutController {

    private final AboutRepository aboutRepository;
    public AboutController(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }
    

    @PostMapping
public ResponseEntity<?> create(@RequestBody AboutDTO dto) {
    // id will always be null here even if frontend sends it
    About about = AboutMapper.toEntity(dto);
    aboutRepository.save(about);
    return ResponseEntity.ok(AboutMapper.toDTO(about));
}
}
