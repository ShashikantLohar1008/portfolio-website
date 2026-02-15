package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{
    
}
