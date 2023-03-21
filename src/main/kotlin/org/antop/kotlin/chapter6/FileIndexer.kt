package org.antop.kotlin.chapter6

import org.antop.java.chapter6.FileContentProcessor
import java.nio.file.Path

class FileIndexer : FileContentProcessor {
    override fun processContents(path: Path,
                                 binaryContents: ByteArray?,
                                 textContents: List<String>?
    ) {
        // do something
    }
}
