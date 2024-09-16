public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor="Red";
        p1.setTip=5;
        
        system.out.println(p1.color);
        system.out.println(p1.tip);
        
    }
}

class Pen{
    String color;
    int tip;
    
    void setColor(String col){
        col=color;
    }
    
    void setTip(int tipp){
        tipp=tip;
    }
}