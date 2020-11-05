package ru.capchik.ivbo_11_19.lesson10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("")
                .toAbsolutePath()
                .getParent()
                .getParent();
        System.out.println(path);
        String basePath = "src/ru/capchik/ivbo_11_19/lesson10";
        String mainFile = basePath + "/Main.java";
        String copyFile = basePath + "/copy.txt";
        File file = new File(mainFile);
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (File currentFile : list) {
                System.out.println("is file: " + currentFile.isFile());
                System.out.println("is directory: " + currentFile.isDirectory());
                System.out.println(currentFile.getAbsolutePath());
            }
        }
        String mainFilePath = file.getAbsolutePath();
        try {

            try (BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
                 PrintWriter writer = new PrintWriter(copyFile)) {
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    writer.println(line);
                    line = reader.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("incorrect path");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("fail with close");
            e.printStackTrace();
        }

    }
}
