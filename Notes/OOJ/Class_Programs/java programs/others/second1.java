import java.awt.*;
import java.applet.*;
/*
<applet code="second1" width=300 height=100>
</applet>*/
public class second1 extends Applet{
String msg;
// set the foreground and background colors.
public void init() {
setBackground(Color.black);
setForeground(Color.white);
msg = "Inside init( ) --";
}
// Initialize the string to be displayed.
public void start() {
msg += " Inside start( ) --";
}
// Display msg in applet window.
public void paint(Graphics g) {
msg += " Inside paint( ).";
g.drawString(msg, 10, 30);
}

public void stop()
{
 msg = " Inside stop( ).";repaint();
}
public void destroy()
{msg = " Inside destroy( ).";repaint();}
}
