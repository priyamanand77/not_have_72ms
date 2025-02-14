package com.word.count.dto.word;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WordDto {
    private long totalWordCount;
    private Object top5MostFrequentWord;
    private Object sortedTop50UniqueWords;
    private long executionTimeInMs;
}
