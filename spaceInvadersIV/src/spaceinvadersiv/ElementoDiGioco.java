package spaceinvadersiv;

import javax.swing.JButton;

public class ElementoDiGioco {

    private double x, y;
    private double targetX, targetY;
    private double stepX, stepY;
    private JButton button;

    public ElementoDiGioco() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getTargetX() {
        return targetX;
    }

    public void setTargetX(double targetX) {
        this.targetX = targetX;
    }

    public double getTargetY() {
        return targetY;
    }

    public void setTargetY(double targetY) {
        this.targetY = targetY;
    }

    public double getStepX() {
        return stepX;
    }

    public void setStepX(double stepX) {
        this.stepX = stepX;
    }

    public double getStepY() {
        return stepY;
    }

    public void setStepY(double stepY) {
        this.stepY = stepY;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

}
