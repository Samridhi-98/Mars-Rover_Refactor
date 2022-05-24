package mars.rover;

import exception.InvalidCoordinatesExceptions;

public class Position {
    private final int xCoordinate;
    private final int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) throws InvalidCoordinatesExceptions {
        if(xCoordinate < 0 || yCoordinate < 0){
            throw new InvalidCoordinatesExceptions();
        }
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}
