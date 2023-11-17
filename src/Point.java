public class Point {
    private int  x;
    private int y;

public Point(int x,int y) {
    this.x = x;
    this.y = y;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y=y;
    }

public double distance(){
    return Math.sqrt(x*x+y*y);
}
    public double distanceCall(int x,int y){
        return Math.sqrt(x*x+y*y);
    }
 public double distance(Point p){
    if(p != null){
        int distX=p.getX()-this.x;
        int distY=p.getY()-this.y;
        return distanceCall(distX,distY);
    }
  else {
        System.out.println("Point cant be null");
        return -1;
    }
 }
    public double distance (int a,int b){
        int distX=a-this.x;
        int distY=b-this.y;
        return distanceCall(distX,distY);
    }
}