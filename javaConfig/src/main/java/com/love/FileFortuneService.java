package com.love;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    Random random = new Random();
    private List<String> theFortunes;
    private String fileName = "C:\\Users\\Maksatbek\\Documents\\REST\\spring-demo-annotations\\src\\main\\resources\\fortune-data.txt";

    FileFortuneService() {
        File file = new File(fileName);

        System.out.println("File exist: " + file.exists());

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            theFortunes = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                theFortunes.add(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public String getFortune() {
        int index = random.nextInt(theFortunes.size());
        return theFortunes.get(index);
    }
}
