public class Circle {
    double radius;
    String color ;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }

    public Circle(double radius1 , String color1){
        this.radius = radius1;
        this.color = color1;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius2){
        this.radius = radius2;
    }

    public void setColor(String color2){
        this.color = color2;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
