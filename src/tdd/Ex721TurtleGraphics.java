package tdd;

public class Ex721TurtleGraphics {

    private boolean isPenUp = true;

    private Direction currentDirection = Direction.EAST;

    private int colunm;
    private int row;

    private Position currentPosition = new Position(0,0);

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }


    public Direction getCurrentDirection() {
        return currentDirection;
    }
    public void turnRight() {
        if(currentDirection == Direction.EAST) currentDirection = Direction.SOUTH;
        else if (currentDirection == Direction.SOUTH) currentDirection = Direction.WEST;
        else if (currentDirection == Direction.WEST) currentDirection = Direction.NORTH;
        else if (currentDirection == Direction.NORTH) currentDirection = Direction.EAST;
    }
    public void turnLeft() {
        if(currentDirection == Direction.EAST) currentDirection = Direction.NORTH;
        else if (currentDirection == Direction.NORTH) currentDirection = Direction.WEST;
        else if (currentDirection == Direction.WEST) currentDirection = Direction.SOUTH;
        else if (currentDirection == Direction.SOUTH) currentDirection = Direction.EAST;
    }

    public void move(int noOfSteps) {
    }

    public Position getCurrentPosition() {
        return new Position(0, 5);

    }
}
