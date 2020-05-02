package com.biblioteca.planos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class RandomPlanSelector {

    public static String[] bibliotecaReaderStringMaker(String filePath) throws IOException {

        Path path = Paths.get(filePath);
        int planCounter = 0;
        int totalPlanCount = (int) Files.lines(path).count();
        String line = null;
        String bibliotecaDePlanos[] = new String[totalPlanCount];

        try (Reader reader = new BufferedReader(new FileReader(path.toString()))){

            while((line = ((BufferedReader) reader).readLine()) != null) {
                bibliotecaDePlanos[planCounter] = line;
                planCounter++;
            }

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        return bibliotecaDePlanos;
    }

    public static void randomPlanosSelector(String[] biblioteca){
        int totalPlanosCount = biblioteca.length;
        System.out.println("Total number of planos : " + totalPlanosCount);

        int randomPlanos = new Random().nextInt(totalPlanosCount);
        System.out.println("Random planos : " + biblioteca[randomPlanos] +
                "\nEnjoy safely ;)");
    }
}
