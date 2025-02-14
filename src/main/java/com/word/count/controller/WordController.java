package com.word.count.controller;

import com.word.count.dto.word.WordDto;
import com.word.count.service.word.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/word")
@Slf4j
public class WordController {

    private final WordService wordService;

    @PostMapping("/count")
    public ResponseEntity<WordDto> getWordCount(@RequestParam("file")MultipartFile file)
    {
        log.info("::inside class WordController : method getWordCount");
        WordDto wordDto = wordService.countWords(file);
        return ResponseEntity.ok(wordDto);

    }
}
