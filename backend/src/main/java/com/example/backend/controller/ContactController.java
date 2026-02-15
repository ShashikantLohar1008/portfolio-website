package com.example.backend.controller;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.ContactMessage;
import com.example.backend.repository.ContactRepository;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping
    public ContactMessage send(@RequestBody ContactMessage msg) {
        msg.setCreatedAt(LocalDateTime.now());
        return contactRepository.save(msg);
    }
}
