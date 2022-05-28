package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    public void shouldCheckIfNorthIsInLeftOfEast() {
        assertEquals(Direction.E.getNextLeftDirection(), Direction.N);
    }

    @Test
    public void shouldCheckIfSouthIsInRightOfEast() {
        assertEquals(Direction.E.getNextRightDirection(), Direction.S);
    }

    @Test
    public void shouldCheckIfNorthIsInRightOfWest() {
        assertEquals(Direction.W.getNextRightDirection(), Direction.N);
    }

    @Test
    public void shouldCheckIfSouthIsInLeftOfWest() {
        assertEquals(Direction.W.getNextLeftDirection(), Direction.S);
    }

    @Test
    public void shouldCheckIfWestIsInLeftOfNorth() {
        assertEquals(Direction.N.getNextLeftDirection(), Direction.W);
    }

    @Test
    public void shouldCheckIfEastIsInRightOfSouth() {
        assertEquals(Direction.N.getNextRightDirection(), Direction.E);
    }

    @Test
    public void shouldCheckIfWestIsInRightOfNorth() {
        assertEquals(Direction.S.getNextRightDirection(), Direction.W);
    }

    @Test
    public void shouldCheckIfEastIsInLeftOfSouth() {
        assertEquals(Direction.S.getNextLeftDirection(), Direction.E);
    }

}
