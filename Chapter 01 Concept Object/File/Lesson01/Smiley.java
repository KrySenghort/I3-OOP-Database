import java.awt.*;
public class Smiley {
    //attributes or data
    Color color;
    int x, y;
    int width, height;
    Boolean isSad = null;
    //methods/operations/functions
    Smiley(){
        x = y = 50;
        width = height = 60;
        color = Color.white;
    }
    Smiley(int _x, int _y, int w, int h, Color c){
        x = _x;
        y=_y;
        width = w;
        height = h;
        color = c;
    }
    void sad(){
        isSad = true;
    }
    void smile(){isSad = false;}
    void draw(Graphics g){
        int eyeW = width/5;
        int eyeH = height/5;
        int mid = width/4;
        g.setColor(color);
        g.setPaintMode();
        g.fillOval(x, y, width, height);
        g.setColor(Color.black);
        g.drawOval(x, y, width, height);
        g.drawOval(x+mid-eyeW/2,y+eyeH,eyeW,eyeH);
        g.drawOval(x+(3*mid-eyeW/2),y+eyeH,eyeW,eyeH);
        g.drawLine(x+2*mid, y+2*eyeH, x+2*mid, y+3*eyeH);
        if(isSad==null) g.drawLine(x+mid, y+4*eyeH, x+3*mid, y+4*eyeH);
        else if(isSad) g.drawArc(x+mid,y+4*eyeH,2*mid,2*eyeH,45,90);
        else g.drawArc(x+mid,y+2*eyeH,2*mid,2*eyeH,225,90);
    }
}
