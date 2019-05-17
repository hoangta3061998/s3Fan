public class test {
    public static void main(String[] args) {
        Fans fan1 = new Fans();
        Fans fan2 = new Fans();
        fan1.setColor("red");
        fan1.setRadius(10);
        fan1.setSpeed(3);
        fan1.setOn();
        fan2.setSpeed(2);
        fan2.setColor("green");
        fan2.setRadius(5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
