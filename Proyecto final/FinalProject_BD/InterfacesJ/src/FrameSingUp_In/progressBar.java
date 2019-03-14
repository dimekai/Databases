package FrameSingUp_In;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author Jesús Kaimorts Díaz Medina
 */
public class progressBar extends JPanel {

    int progress = 0;

    public void UpdateProgress(int progress_value) {
        progress = progress_value;

    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2.rotate(Math.toRadians(270));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Float(0, 0, 30, 30);

        arc.setFrameFromCenter(new Point(0, 0), new Point(40, 40));
        circle.setFrameFromCenter(new Point(0, 0), new Point(35, 35));
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress * 3.6);  //360°/100=3.6
        g2.setColor(Color.BLUE);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(Color.BLUE);
        g2.rotate(Math.toRadians(90));
        g2.drawString("Iniciando", -25, 0);
        g2.drawString(progress + "%", -12, 25);
    }
}
