public class Fans {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fans() {}
    public int getSpeed() {
        return speed;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn() {
        on = true;
    }
    public String toString(){
        if (on == true){
            return "Speed: "+ speed + " Color : " + color + " radius: " + radius + "\n Fan is on.";
        } else {
            return " Color : " + color + " radius: " + radius + "\n Fan is off.";
        }
    }
}
