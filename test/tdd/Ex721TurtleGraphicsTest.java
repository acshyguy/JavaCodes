package tdd;

import tdd.Direction;
import tdd.Ex721TurtleGraphics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex721TurtleGraphicsTest {

    Ex721TurtleGraphics turtle;
    Position position;

   @BeforeEach
   public void setUp(){
       turtle = new Ex721TurtleGraphics();
       position = new Position(0, 0);
   }


    @Test
    public void turtleCanBeCreated(){
        assertNotNull(turtle);
    }
    @Test
    public void penIsUpByDefault(){
       assertTrue(turtle.isPenUp());
    }
    @Test
    public void turtleCanMovePenDownTest(){
       assertTrue(turtle.isPenUp());
       turtle.penDown();
       assertFalse(turtle.isPenUp());
    }
    @Test
    public void testThatPenCanMoveUp(){
       turtle.penDown();
       assertFalse(turtle.isPenUp());

       turtle.penUp();
       assertTrue(turtle.isPenUp());
    }
    @Test
    public void testThatWhenFacingEast_turtleCanTurnRight(){
       assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        //we imported tdd.Direction for East,South,West,North

        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatWhenFacingSouth_turtleCanTurnRight() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

    }
    @Test
    public void testThatWhenFacingWest_turtleCanTurnRight() {
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());

    }
    @Test
    public void testThatWhenFacingNorth_turtleCanTurnRight() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.EAST, turtle.getCurrentDirection());

    }
    //LEFT TURN
    @Test
    public void testThatWhenFacingNorth_turtleCanTurnLeft(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();

        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatWhenFacingWest_turtleCanTurnLeft(){
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatWhenFacingSouth_turtleCanTurnLeft(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testThatWhenFacingEast_turtleCanTurnLeft(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    // NUMBER OF MOVES/STEPS
    @Test
    public void turnCanMoveForwardFacingEastTest() {
       assertSame(Direction.EAST, turtle.getCurrentDirection());
       turtle.move(5);


       Position position = new Position(0, 5);
       assertEquals(new Position(0, 5), turtle.getCurrentDirection());
    }


}
