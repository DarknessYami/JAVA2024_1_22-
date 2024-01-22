import java.awt.*;
import java.awt.event.*;;

public class C22012_Kadai3 extends Frame{
    public static void main(String[] args) {
        C22012_Kadai3 K3 = new C22012_Kadai3();
        K3.s();
    }

    public C22012_Kadai3(){
        super("課題3");
        addWindowListener(new Kadai3windowlistener());
        setSize(800,800);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        drawOval(g, 190, 200, 240, 240);

        g.setColor(Color.black);
        fillRect(g, 230, 260, 50, 15);
        fillRect(g, 340, 260, 50, 15);

        g.setColor(Color.black);
        fillOval(g, 230, 290, 40, 40);
        fillOval(g, 345, 290, 40, 40);

        g.setColor(Color.black);
        fillArc(g, 260, 370, 100, 100, 30, 120);
    }

    //外側の円　-　draw方法
    public void drawOval(Graphics g, int x, int y, int width, int height){
        g.drawOval(x, y, width, height);
    }
    //内側の円　-　fill方法
    public void fillOval(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }
    //内側の長方形　-　fill方法
    public void fillRect(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }
    //内側の円弧　-　fill方法
    public void fillArc(Graphics g, int x, int y, int width, int height, int startAngle, int arcAngle) {
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    //Windowclose
    class Kadai3windowlistener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    public void s(){
        System.out.println();
    }
}