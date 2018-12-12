package com.company.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        testGeneratingRandomFleet();
    }

    public static void testGeneratingRandomFleet() {
        int[] fleetConfig = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        int boardDimension = 10;
        Fleet fleet = generateRandomFleet(fleetConfig, boardDimension);
    }

    private static Fleet generateRandomFleet(int[] fleetConfig, int boardDimension) {
        Random random = new Random();
        Set<Integer> usedNumbers = new HashSet<>();
        int boardSize = (int) Math.pow(boardDimension, 2);
        for(int shipSize : fleetConfig) {
            int randomIndex = random.nextInt(boardSize + 1);
            System.out.println(randomIndex);
            Direction direction = Direction.randomDirection();
//            System.out.println(direction);


            int indexIterator = getIndexIteratorFromDirection(direction, boardDimension);
//            System.out.println(indexIterator);
            int[] mastPosition = IntStream.iterate(randomIndex, i -> i + indexIterator).limit(shipSize).toArray();
            for (int pos : mastPosition) {
                System.out.println(pos);
            }
            boolean isShipInBoard = Arrays.stream(mastPosition).allMatch(position -> position > 0 && position <= boardSize);
            System.out.println("czy w planszy");
            System.out.println(isShipInBoard);
            if(direction == Direction.LEFT|| direction == Direction.RIGHT) {
                System.out.println("poziome sprawdzenie");
                int first = mastPosition[0];
                int last = mastPosition[mastPosition.length - 1];
                System.out.println((first-1)/boardDimension == (last-1)/boardDimension);
            }
            boolean isNotUsed = Arrays.stream(mastPosition).allMatch(position -> !usedNumbers.contains(position));
            System.out.println("nie zuzyte");
            System.out.println(isNotUsed);
            Arrays.stream(mastPosition).forEach(usedNumbers::add);

        }
        return null;
    }

    private static int getIndexIteratorFromDirection(Direction direction, int boardDimension) {
        int indexIterator = 0;
        switch (direction) {
            case UP:
                indexIterator = -boardDimension;
                break;
            case DOWN:
                indexIterator = boardDimension;
                break;
            case LEFT:
                indexIterator = -1;
                break;
            case RIGHT:
                indexIterator = 1;
                break;
        }
        return indexIterator;
    }
}
