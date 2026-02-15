package com.example.backend.mapper;

import com.example.backend.dto.AboutDTO;
import com.example.backend.entity.About;

public class AboutMapper {
    
    public static About toEntity(AboutDTO dto) {
        if (dto == null) {
            return null;
        }
        About about = new About();
        // map fields from dto to about
        // about.setId(dto.getId());
        about.setName(dto.getName());
        about.setBio(dto.getBio());
        about.setExperience(dto.getExperience());
        about.setResumeUrl(dto.getResumeUrl());
        about.setLinkedin(dto.getLinkedin());
        return about;
    }

    public static AboutDTO toDTO(About about) {
        if (about == null) {
            return null;
        }
        AboutDTO dto = new AboutDTO();
        // map fields from about to dto
        // dto.setId(about.getId());
        dto.setName(about.getName());
        dto.setBio(about.getBio());
        dto.setExperience(about.getExperience());
        dto.setResumeUrl(about.getResumeUrl());
        dto.setLinkedin(about.getLinkedin());
        return dto;
    }
}
