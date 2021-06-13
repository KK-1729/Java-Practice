public class area_of_shapes {
    public static void main(String[] args) {
        square s = new square();
        s.getCoordinates(3, 3);
        s.calculateArea();
        circle c = new circle();
        c.getCoordinates(3, 3);
        c.calculateArea();
        cube cu = new cube();
        cu.getCoordinates(1, 2, 3);
        cu.calculateArea();
        sphere sp = new sphere();
        sp.getCoordinates(1, 2, 3);
        sp.calculateArea();
    }
}

abstract class shape {
    double area;
    public void displayArea() {
        System.out.println("Area - " + area);
    }
    public abstract void calculateArea();
}

abstract class twodimensionalshape extends shape {
    double x;
    double y;
    double s;
    public void getCoordinates(double p, double q) {
        x = p;
        y = q;
        s = Math.sqrt((x*x) + (y*y));
    }
}

abstract class threedimensionalshape extends shape {
    double x;
    double y;
    double z;
    double s;
    public void getCoordinates(double p, double q, double r) {
        x = p;
        y = q;
        z = r;
        s = Math.sqrt((x*x) + (y*y) + (z*z));
    }
}

class square extends twodimensionalshape {
    @Override
    public void calculateArea() {
        area = s*s;
        super.displayArea();
    }
}

class circle extends twodimensionalshape {
    @Override
    public void calculateArea() {
        area = 3.14*s*s;
        super.displayArea();
    }
}

class cube extends threedimensionalshape {
    @Override
    public void calculateArea() {
        area = 6*s*s;
        super.displayArea();
    }
}

class sphere extends threedimensionalshape {
    @Override
    public void calculateArea() {
        area = 4*3.14*s*s;
        super.displayArea();
    }
}

