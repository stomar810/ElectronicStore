package com.lcwd.electronic.store.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryImageService {
    public Map  uplaod(MultipartFile file);
}
