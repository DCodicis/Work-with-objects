import java.util.Scanner;

public class Segment {
    private Point first,second;

    public Segment(){
        first = new Point(0,0);
        second = new Point(1,1);
    }

    public Segment(float x1, float y1, float x2, float y2){
        first = new Point(x1, y1);
        second = new Point(x2, y2);
    }

    public Segment(float x2, float y2){
        first = new Point(0, 0);
        second = new Point(x2, y2);
    }

    public Segment(Point first, Point second){
        this.first = first;
        this.second = second;
    }

    public Segment(float x1, float y1, Point second){
        this.first = new Point(x1, y1);
        this.second = second;
    }

    public Segment(Point first, float x2, float y2){
        this.first = first;
        this.second = new Point(x2, y2);
    }

    public Segment(Segment copy) {
        this.first = new Point(copy.first.getX(), copy.first.getY());
        this.second = new Point(copy.second.getX(), copy.second.getY());
    }

    public void readSegment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y coordinates of the first point:");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        first = new Point(x1, y1);
        System.out.println("Enter x and y coordinates of the second point:");
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        second = new Point(x2, y2);
    }

    public Point middle() {
        float x = (first.getX() + second.getX()) / 2;
        float y = (first.getY() + second.getY()) / 2;
        return new Point(x, y);
    }

    public double length() {
        double lx = first.getX() - second.getX();
        double ly = first.getY() - second.getY();
        return Math.sqrt(lx*lx + ly*ly);
    }

    public boolean greaterThan(Segment other) {
        return this.length() > other.length();
    }
    public boolean lessThan(Segment other) {
        return this.length() < other.length();
    }

    public boolean equals(Segment other){
        return this.length() == other.length();
    }

    public int compareTo(Segment other){
        if(this.equals(other)){
            return 0;
        }
        else{
            if(this.length() > other.length()){
                return 1;
            }
            else{
                return 1;
            }
        }
    }

    public void show() {
        System.out.println("The middle point is: (" + middle().getX() + ", " + middle().getY() + ")");
    }
}
