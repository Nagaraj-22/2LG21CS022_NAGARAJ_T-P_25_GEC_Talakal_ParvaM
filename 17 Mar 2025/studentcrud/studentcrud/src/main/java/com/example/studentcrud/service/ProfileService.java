package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Profile;
import com.example.studentcrud.repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository ProfileRepository;

    public List<Profile> listAll() {
        return ProfileRepository.findAll();
    }

    public void saveProfile(Profile stu) {
        ProfileRepository.save(stu);
    }

    public Profile getProfile(Long id) {
        return ProfileRepository.findById(id).orElse(null);
    }

    public void deleteProfile(Long id) {
        ProfileRepository.deleteById(id);
    }
}