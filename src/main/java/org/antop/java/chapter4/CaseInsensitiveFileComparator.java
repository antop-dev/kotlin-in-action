package org.antop.java.chapter4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CaseInsensitiveFileComparator implements Comparator<Path> {
    @Override
    public int compare(Path o1, Path o2) {
        var filename1 = o1.getFileName().toString();
        var filename2 = o2.getFileName().toString();
        return String.CASE_INSENSITIVE_ORDER.compare(filename1, filename2);
    }

    private CaseInsensitiveFileComparator() {
    }

    public static CaseInsensitiveFileComparator INSTANCE = new CaseInsensitiveFileComparator();

    public static void main(String[] args) {
        System.out.println(
                CaseInsensitiveFileComparator.INSTANCE.compare(
                        Paths.get("/User"),
                        Paths.get("/user")
                )
        );

        var paths = new ArrayList<>(Arrays.asList(Paths.get("/Z"), Paths.get("/a")));
        paths.sort(CaseInsensitiveFileComparator.INSTANCE);
        System.out.println(paths);
    }

}
