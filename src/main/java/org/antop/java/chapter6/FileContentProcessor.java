package org.antop.java.chapter6;

import java.nio.file.Path;
import java.util.List;

public interface FileContentProcessor {
    void processContents(Path path,
                         byte[] binaryContents,
                         List<String> textContents);
}
