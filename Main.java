//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something in color: "+this.color+" "+this.type);
    }

    Pen(){
        this.color="red";
        this.type="gel";
    }

    //Parameterized constructor
    Pen(String str1,String str2){
        this.color=str1;
        this.type=str2;
    }

    //copy constructor
    Pen(Pen p){
        this.color=p.color;
        this.type=p.type;
    }

}
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Pen p1=new Pen("blue","ball");
        p1.write();

//        Pen p2=new Pen(p1);
//        p2.write();


    }
}
