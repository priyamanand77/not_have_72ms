package com.word.count.service.word;

import com.word.count.dto.word.WordDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface WordService {
    WordDto countWords(MultipartFile file);
}
