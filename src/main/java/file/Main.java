package file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("src/main/resources/file1.txt");
        Path outputPath = Paths.get("src/main/resources/file2.txt");
        StringBuilder text1 = new StringBuilder();

        List<String> contents = Files.readAllLines(inputPath);

        for (String content: contents) {
            text1.append(content.replace("1", " "));
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)){
            writer.write(text1.toString());
        }

    }
}
