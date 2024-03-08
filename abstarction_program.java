abstract class shape{
    shape(){
        System.out.println("shape constructor is called");
    }
    abstract public void draw();

    public void disp_area(){
        System.out.println("area is :"+calc_area());
    }
    abstract protected double calc_area();
}

class circle extends shape{
    protected double radius ;

    circle(double r){
        this.radius=r;
    }

    @Override
    public void draw(){
        System.out.println("draw a circle");
    }

    @Override
    protected double calc_area(){
        return radius*radius;
    }
}

class rectangle extends shape{
    private double length;
    private double width;

    rectangle(double l,int b){
        this.length=l;
        this.width=b;
    }

    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }

    @Override
    protected double calc_area() {
        return length*width;
    }
}

public class abstarction_program {
    public static void main(String[] args){
//        circle c=new circle(5.00);
//        c.draw();
//        c.disp_area();

//        rectangle rec=new rectangle(5.00,2);
//        rec.draw();
//        rec.disp_area();

        shape s1=new circle(5.00);
        shape s2=new rectangle(5.00,2);

        s1.draw();
        s1.disp_area();

        s2.draw();
        s2.disp_area();
    }
}
