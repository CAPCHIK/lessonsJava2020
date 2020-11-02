package ru.capchik.ivbo_07_19.lesson9;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get(".")
                .toAbsolutePath()
                .getParent()
                .getParent();
        String basePath = "src/ru/capchik/ivbo_07_19/lesson9";
        String mainFile = basePath + "/Main.java";
        String newFile = basePath + "/Copy.txt";
        File file = new File(mainFile);
        if (file.isDirectory()) {
            String[] list = file.list();

            for (String s : list) {
                System.out.println(Paths.get(basePath, s).toAbsolutePath());
            }
        }
        Scanner sc = new Scanner(System.in);
        String mainFilePath = file.getAbsolutePath();
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
                    PrintWriter writer = new PrintWriter(newFile)) {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    writer.write(line);
                    writer.write('\n');
                    sc.nextLine();
                    line = reader.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file path");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(path);
    }
}
