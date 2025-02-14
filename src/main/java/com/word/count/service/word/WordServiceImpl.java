package com.word.count.service.word;

import com.word.count.dto.word.WordDto;
import com.word.count.utility.WordUtility;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class WordServiceImpl implements WordService {


    @Override
    public WordDto countWords(MultipartFile file) {
        //file to string
        try {
            String fileStr = new String(file.getBytes()).replaceAll("[0-9\\p{Punct}]", "");
            return findWord(fileStr);
        } catch (Exception e) {
            throw new RuntimeException("Error occurred ", e);
        }

    }


    public WordDto findWord(String fileStr) {

        long start = System.currentTimeMillis();
        //string to words
        String[] words = fileStr.split("\\s+");

        //filtered words
        List<String> filteredWords = Arrays.stream(words)
                .map(String::toLowerCase)
                .filter(word -> !WordUtility.EXCLUSION_WORDS.contains(word) && !word.endsWith("'s"))
                .toList();

        //counted word
        Map<String, Long> wordCount = filteredWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //getting highest count key value
        Map<String, Long> top5FrequentWordMap = wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        //getting top 50 distinct words in sorted
        List<String> top50DistinctWord = filteredWords.stream()
                .distinct()
                .sorted()
                .limit(50)
                .toList();
        long end = System.currentTimeMillis();

        return WordDto.builder()
                .totalWordCount(filteredWords.size())
                .top5MostFrequentWord(top5FrequentWordMap)
                .sortedTop50UniqueWords(top50DistinctWord)
                .executionTimeInMs(end-start)
                .build();

    }
}


