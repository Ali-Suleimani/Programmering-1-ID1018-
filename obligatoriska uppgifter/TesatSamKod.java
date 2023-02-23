//Demo java
public class TestaSamKod
{
    private String name = null;
    private int x = 0;
    private int y = 0;
    //kosntruktor
    public TestaSamKod(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;

    }
    //ny konstruktor
    public TestaSamKod(TesatSamKod p) {
        this.name = p.getNamn();
        this.x = p.getX();
        this.y = p.getY();
    }
    //alla konsteukotrer har samma namn som klassen
    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
        //this.x = x <-- samma som xIn, this.x syftar på private int x = 0; å int x tar emot från setx
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return this.name +" "+ this.x + " " + this.y;
    }

    public String getNamn(){
        return name;

    }

    public double avstand(TestaSamKod p){
    double d = Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)* (p.y-this.y));
       return d;
    }


}