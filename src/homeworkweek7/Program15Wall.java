package homeworkweek7;

public class Program15Wall {
    double width;
    double height;

    public Program15Wall() {
    }

    public Program15Wall(double width, double height) {
        this.width=width;
        this.height=height;
        if (width < 0)
            this.width = 0;
        if (height < 0)
            this.height = 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getArea() {
        return (width * height);
    }

    public static void main(String[] args) {
        Program15Wall wall = new Program15Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

