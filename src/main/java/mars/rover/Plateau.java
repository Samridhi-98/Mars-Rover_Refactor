package mars.rover;

import exception.NoInstructionFoundException;

public class Plateau {
    private final int upperRightX;
    private final int upperRightY;
    private final int lowerLeftX;
    private final int lowerLeftY;
    private MarsRover rover;

    public Plateau(int upperRightX, int upperRightY) {
        this.upperRightX = upperRightX;
        this.upperRightY = upperRightY;
        this.lowerLeftX = 0;
        this.lowerLeftY = 0;
    }

    public void createRover(int x, int y, String direction) {
        rover = new MarsRover(x, y, direction);
    }

    public String moveRover(int x, int y, char direction, String instructions) throws NoInstructionFoundException {
        if(instructions.length() <= 0) {
            throw new NoInstructionFoundException();
        }
        return rover.move(x, y, direction, instructions);
    }

}
