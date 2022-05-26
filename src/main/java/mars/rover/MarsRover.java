package mars.rover;

import exception.InvalidCoordinatesExceptions;

public class MarsRover {

    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public MarsRover move(String instructions, Position boundary) throws InvalidCoordinatesExceptions {
        if(boundary.getXCoordinate() < 0 || boundary.getYCoordinate() < 0){
            throw new InvalidCoordinatesExceptions();
        }
        MarsRover newPosition = this;
        for(int index=0;index<instructions.length();index++){
            char moveDirection = instructions.charAt(index);
            if(moveDirection == 'L' || moveDirection == 'R'){
                newPosition = findNewDirectionToMove(moveDirection, newPosition);
            }
            else if(moveDirection == 'M'){
                newPosition = findNextPositionToMove(boundary, newPosition);
            }
        }
        return newPosition;
    }

    private MarsRover findNewDirectionToMove(char moveDirection, MarsRover currentPosition) {
        Direction newDirectionOfRover = (moveDirection == 'L') ? currentPosition.direction.getNextLeftDirection() : currentPosition.direction.getNextRightDirection();
        return new MarsRover(currentPosition.x, currentPosition.y, newDirectionOfRover);
    }

    private MarsRover findNextPositionToMove(Position boundary, MarsRover currentPosition) {
        Position bufferPosition = currentPosition.direction.getBufferPosition();
        Position newPositionAfterNextMove = new Position(bufferPosition.getXCoordinate() + currentPosition.x,bufferPosition.getYCoordinate()+ currentPosition.y);

        return new MarsRover(newPositionAfterNextMove.getXCoordinate(),newPositionAfterNextMove.getYCoordinate(),currentPosition.direction);
    }

    public String finalPositionOfRover(){
        return this.x + " " +this. y + " " + this.direction;
    }
}
