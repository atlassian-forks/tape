package com.squareup.tape;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * This class extends {@link QueueFile} and is the same with it. The only change is that writers are asynchronous.
 */
public class AsyncQueueFile extends QueueFile {
    public AsyncQueueFile(final File file) throws IOException {
        super(file, new RandomAccessFile(file, "rw"));
    }
}
