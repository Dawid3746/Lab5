package pong1;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Kulka {

    private static final double R = 10;
    protected Color color;
    protected double xSpeed;
    protected double ySpeed;
    protected double xPos;
    protected double yPos;
    private double radius;

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = Color.WHITESMOKE;
        this.radius = R;
    }

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed, Color color){
        this(xPos, yPos, xSpeed, ySpeed);
        this.color = color;
    }

    Kulka(double xPos, double yPos, double xSpeed, double ySpeed, double radius, Color color){
        this(xPos, yPos, xSpeed, ySpeed);
        this.color = color;
        this.radius = radius;
    }

    public void checkBoundaryCollision(double xLeft, double yTop, double xRight, double yBottom){
        if ((xPos - R <= xLeft) || ((xPos + R >= xRight))) {
            xSpeed=-xSpeed;
        }
        if ((yPos - R <= yTop) || ((yPos + R >= yBottom))) {
            ySpeed=-ySpeed;
        }
    }

    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITESMOKE);
        gc.fillOval(xPos - R, yPos - R, 2*R, 2*R);
    }

    public void update(){
        xPos += xSpeed;
        yPos += ySpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
