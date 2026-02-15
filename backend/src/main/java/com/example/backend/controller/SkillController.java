package com.example.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Skill;
import com.example.backend.service.SkillService;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin("*")
public class SkillController {
    
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }
    
     @GetMapping
    public List<Skill> getAll() {
        return skillService.getAllSkills();
    }

    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return skillService.addSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }
}
