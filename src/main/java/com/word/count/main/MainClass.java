package com.word.count.main;

import com.word.count.dto.word.WordDto;
import com.word.count.service.word.WordServiceImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) {
        String fileName = "src/main/java/com/word/count/main/moby.txt";
        WordServiceImpl wordService = new WordServiceImpl();
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName))).replaceAll("[0-9\\p{Punct}]", "");


            WordDto word = wordService.findWord(content);


            String twc = ("__________total word count__________\n" + word.getTotalWordCount());
            String t5mfw = ("\n\n__________top 5 Most Frequent Word__________\n" + word.getTop5MostFrequentWord());
            String st50uw = ("\n\n__________sorted Top 50 Unique Words__________\n" + word.getSortedTop50UniqueWords());
            String executionTime = ("\n\n__________total execution time in ms__________\n" + word.getExecutionTimeInMs());

            System.out.println(twc);
            System.out.println(t5mfw);
            System.out.println(st50uw);
            System.out.println(executionTime);

            String writeFileName = "src/main/java/com/word/count/main/output.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeFileName))) {
                writer.write(twc);
                writer.newLine();
                writer.write(t5mfw);
                writer.newLine();
                writer.write(st50uw);
                writer.newLine();
                writer.write(executionTime);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
