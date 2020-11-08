package com.exercises;

import java.util.Set;

public class DiskSpace {

    public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
        int count = 0;
        for (int i = 1; i < blockSize; i++) {
            if(!occupiedSectors.contains(i)) {
                count++;
            } else {
                count = 0;
            }

            if(count == fileSize) {
                return true;
            }
        }

        return false;
    }
}