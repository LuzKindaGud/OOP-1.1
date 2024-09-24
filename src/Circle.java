public class Circle {
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius1){
        this.radius = radius1;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius2){
        this.radius = radius2;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
