package mars.rover;

import exception.InvalidCoordinatesExceptions;
import exception.NoInstructionFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlateauTest {

    @Test
    public void shouldThrowExceptionForInvalidBoundaryCoordinates(){
        assertThrows(InvalidCoordinatesExceptions.class, ()-> new Plateau(-2,2,new MarsRover(1,2,Direction.S)));
    }

    @Test
    public void shouldThrowExceptionForZeroLengthInstruction() throws InvalidCoordinatesExceptions, NoInstructionFoundException {
        Plateau plateau = new Plateau(5,5,new MarsRover(1,5,Direction.N));
        assertThrows(NoInstructionFoundException.class,() -> plateau.moveRover(""));
    }

    @Test
    public void shouldReturnFinalPositionOfMarsRoverAfterMoving() throws NoInstructionFoundException, InvalidCoordinatesExceptions {
        MarsRover rover = new MarsRover(1,2,Direction.N);
        Plateau plateau = new Plateau(5, 5, rover);

        MarsRover roverAfterMovement = plateau.moveRover("LMLMLMLMM");

        assertEquals("1 3 N", roverAfterMovement.finalPositionOfRover());
    }
}
