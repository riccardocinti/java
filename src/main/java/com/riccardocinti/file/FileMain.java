package com.riccardocinti.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileMain {

    public static void main(String[] args) throws Exception {
        Path resources =
                Paths.get(ClassLoader.getSystemResource("container").toURI());

        boolean isDirectory = Files.isDirectory(resources);
        System.out.println(isDirectory);

        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(resources, visitor);
        System.out.println("Files count = " + visitor.getFilesCount());
        System.out.println("Dirs count = " + visitor.getDirsCount());

        System.out.println("******");

        try (Stream<Path> paths = Files.walk(resources)) {
            long totalFiles = paths.count();
            System.out.println("Stream total files count = " + totalFiles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
