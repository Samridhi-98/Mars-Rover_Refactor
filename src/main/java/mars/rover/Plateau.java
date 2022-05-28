package mars.rover;

import exception.InvalidCoordinatesExceptions;
import exception.NoInstructionFoundException;

public class Plateau {
    private final Position position;
    private MarsRover rover;

    public Plateau(int xCoordinate, int yCoordinate, MarsRover rover) throws InvalidCoordinatesExceptions {
        if (xCoordinate <= 0 || yCoordinate <= 0) {
            throw new InvalidCoordinatesExceptions();
        }
        position = new Position(xCoordinate, yCoordinate);
        this.rover = rover;
    }

    public MarsRover moveRover(String instructions) throws NoInstructionFoundException, InvalidCoordinatesExceptions {
        if (instructions.length() <= 0) {
            throw new NoInstructionFoundException();
        }
        return rover.move(instructions, position);
    }
}
