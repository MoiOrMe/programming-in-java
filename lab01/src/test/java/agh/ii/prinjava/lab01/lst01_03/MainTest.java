package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testAreaRect() {
        Rectangle rectangle = new Rectangle(2, 5);

        double resultat = rectangle.area();

        assertEquals(10.0, resultat, 0.001);
    }

    @Test
    public void testPerimeterRect() {
        Rectangle rectangle = new Rectangle(10, 20);

        double resultat = rectangle.perimeter();

        assertEquals(60.0, resultat, 0.001);
    }

    @Test
    public void testPerimterCircle(){
        Circle circle = new Circle(5);
        double result = circle.perimeter();
        double tolerance = 0.1;
        assertEquals(31.41,result,tolerance);
    }

    @Test
    public void testAreaCircle(){
        Circle circle = new Circle(10);
        double result = circle.area();
        double tolerance = 0.1;
        assertEquals(314.15,result,tolerance);
    }

}
