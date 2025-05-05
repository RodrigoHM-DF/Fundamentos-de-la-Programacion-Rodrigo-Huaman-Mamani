
abstract class Polygon {
    abstract double getArea();
}

class Triangle extends Polygon {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double getArea() {
        return (base * height) / 2;
    }
}

class Square extends Polygon {
    double side;
    Square(double side) {
        this.side = side;
    }
    double getArea() {
        return side * side;
    }
}
