import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Point p=new Point(3,8);
        Point p2=new Point(6,9);

        System.out.println("Witam!");
        Segment s=new Segment(p,p2);
        s.getDistance();
     //   return String.format(Locale.ENGLISH, format:"<line x1=\"%f\" y1=" ..>",p.x,p.y);

    }


}