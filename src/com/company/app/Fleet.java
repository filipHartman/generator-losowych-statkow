package com.company.app;

import java.util.HashSet;
import java.util.Set;

public class Fleet {

    private final Set<Ship> ships;

    private Fleet(Set<Ship> ships) {
        this.ships = ships;
    }

    public Set<Ship> getShips() {
        return ships;
    }

    public static class FleetBuilder {
        private Set<Ship> buildersShips;

        public FleetBuilder() {
            buildersShips = new HashSet<>();
        }

        public void addShip(Ship ship) {
            buildersShips.add(ship);
        }

        public void addAllShips(Set<Ship> allShips) {
            buildersShips.addAll(allShips);
        }

        public Fleet built() {
            return new Fleet(buildersShips);
        }
    }
}
