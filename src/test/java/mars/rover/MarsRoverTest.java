package mars.rover;

import exception.InvalidCoordinatesExceptions;
import exception.NoInstructionFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void shouldTurnLeftOnInstructionOfTuringLeft() throws InvalidCoordinatesExceptions, NoInstructionFoundException {
        Plateau plateau = new Plateau(4,4, new MarsRover(1,4,Direction.N));
        MarsRover rover = plateau.moveRover("L");

        assertEquals("1 4 W",rover.finalPositionOfRover());
    }

    @Test
    public void shouldTurnRightOnInstructionOfTuringRight() throws InvalidCoordinatesExceptions, NoInstructionFoundException {
        Plateau plateau = new Plateau(4,4,new MarsRover(2,2,Direction.N));
        MarsRover rover = plateau.moveRover("R");

        assertEquals("2 2 E", rover.finalPositionOfRover());
    }

    @Test
    public void shouldMoveOneStepOnInstructionToMove(){

    }


}