package JavaCollections.ArrayListPrograms;

import java.util.*;

public class CollectionPerformanceTest {

    public static void main(String[] args) {
        int numElements = 100000;

        // Create lists of different types
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Test insertion performance
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long hashSetInsertionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long treeSetInsertionTime = endTime - startTime;

        // Test removal performance (remove elements from the middle)
        int middleIndex = numElements / 2;

        startTime = System.nanoTime();
        arrayList.remove(middleIndex);
        endTime = System.nanoTime();
        long arrayListRemovalTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.remove(middleIndex);
        endTime = System.nanoTime();
        long linkedListRemovalTime = endTime - startTime;

        startTime = System.nanoTime();
        hashSet.remove(middleIndex);
        endTime = System.nanoTime();
        long hashSetRemovalTime = endTime - startTime;

        startTime = System.nanoTime();
        treeSet.remove(middleIndex);
        endTime = System.nanoTime();
        long treeSetRemovalTime = endTime - startTime;

        // Print results
        System.out.println("Insertion Times:");
        System.out.println("ArrayList: " + arrayListInsertionTime + " ns");
        System.out.println("LinkedList: " + linkedListInsertionTime + " ns");
        System.out.println("HashSet: " + hashSetInsertionTime + " ns");
        System.out.println("TreeSet: " + treeSetInsertionTime + " ns");

        System.out.println("\nRemoval Times:");
        System.out.println("ArrayList: " + arrayListRemovalTime + " ns");
        System.out.println("LinkedList: " + linkedListRemovalTime + " ns");
        System.out.println("HashSet: " + hashSetRemovalTime + " ns");
        System.out.println("TreeSet: " + treeSetRemovalTime + " ns");
    }
}
