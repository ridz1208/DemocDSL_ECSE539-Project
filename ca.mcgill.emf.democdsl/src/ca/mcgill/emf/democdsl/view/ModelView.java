/**
 * 
 */
package ca.mcgill.emf.democdsl.view;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * View for the model concrete syntax
 * @author Yanis
 *
 */
public class ModelView extends JApplet implements MouseMotionListener, MouseListener{

    /**
     * 
     */
    private static final long serialVersionUID = -1385748433095965892L;
    
    private Graphics2D g2;
    Dimension d;
    
    /*
     * Moving attributes
     */
    private ArrayList<RectangularShape> elements = new ArrayList<RectangularShape>();
    private ArrayList<RectangularShape> movedElements = new ArrayList<RectangularShape>();

    /**
     * Constructor
     */
    public ModelView() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    final static int maxCharHeight = 15;
    final static int minFontSize = 6;

    final static Color bg = Color.white;
    final static Color fg = Color.black;
    final static Color red = Color.red;
    final static Color white = Color.white;

    final static BasicStroke stroke = new BasicStroke(2.0f);
    final static BasicStroke wideStroke = new BasicStroke(8.0f);

    final static float dash1[] = {10.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f, 
                                                      BasicStroke.CAP_BUTT, 
                                                      BasicStroke.JOIN_MITER, 
                                                      10.0f, dash1, 0.0f);
    Dimension totalSize;
    FontMetrics fontMetrics;

    public void init() {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
        
    }

    FontMetrics pickFont(Graphics2D g2,
                         String longString,
                         int xSpace) {
        boolean fontFits = false;
        Font font = g2.getFont();
        FontMetrics fontMetrics = g2.getFontMetrics();
        int size = font.getSize();
        String name = font.getName();
        int style = font.getStyle();

        while ( !fontFits ) {
            if ( (fontMetrics.getHeight() <= maxCharHeight)
                 && (fontMetrics.stringWidth(longString) <= xSpace) ) {
                fontFits = true;
            }
            else {
                if ( size <= minFontSize ) {
                    fontFits = true;
                }
                else {
                    g2.setFont(font = new Font(name,
                                               style,
                                               --size));
                    fontMetrics = g2.getFontMetrics();
                }
            }
        }

        return fontMetrics;
    }

    public void paint(Graphics g) {
        g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        d = getSize();
        int gridWidth = d.width / 6;
        int gridHeight = d.height / 2;

        fontMetrics = pickFont(g2, "Filled and Stroked GeneralPath",
                               gridWidth);

        Color fg3D = Color.lightGray;

        g2.setPaint(fg3D);
        g2.draw3DRect(0, 0, d.width - 1, d.height - 1, true);
        g2.draw3DRect(3, 3, d.width - 7, d.height - 7, false);
        g2.setPaint(fg);

        int x = 5;
        int y = 7;
        int rectWidth = gridWidth - 2*x;
        int stringY = gridHeight - 3 - fontMetrics.getDescent();
        int rectHeight = stringY - fontMetrics.getMaxAscent() - y - 2;

        // draw Line2D.Double
        g2.draw(new Line2D.Double(x, y+rectHeight-1, x + rectWidth, y));
        g2.drawString("Line2D", x, stringY);
        x += gridWidth;

        // draw Rectangle2D.Double
        g2.setStroke(stroke);
        g2.draw(new Rectangle2D.Double(x, y, rectWidth, rectHeight));
        g2.drawString("Rectangle2D", x, stringY);
        x += gridWidth;      

        // draw  RoundRectangle2D.Double
        g2.setStroke(dashed);
        g2.draw(new RoundRectangle2D.Double(x, y, rectWidth, 
                                            rectHeight, 10, 10));
        g2.drawString("RoundRectangle2D", x, stringY);
        x += gridWidth;

        // draw Ellipse2D.Double
        g2.setStroke(stroke);
        g2.draw(new Ellipse2D.Double(x, y, rectWidth, rectHeight));
        g2.drawString("Ellipse2D", x, stringY);
        x += gridWidth;

        

        // NEW ROW
        x = 5;
        y += gridHeight;
        stringY += gridHeight;

        // blank the canvas
        g2.setColor(Color.WHITE);
        Double dWidth = d.getWidth();
        Double dHeight = d.getHeight();
        g2.fillRect(0,0,dWidth.intValue(),dHeight.intValue());
        

        g2.setColor(Color.BLACK);
        
        
        refresh();


    }
    
    public void refresh() {
        for(RectangularShape r : elements) {
            g2.setColor(Color.BLACK);
            g2.draw(r);
        }
    }
    
    public void createConstituent(){
        // draw Rectangle2D.Double
        g2.setStroke(stroke);
        Dimension d = getSize();
        Double rectWidth = d.getWidth()/20.0;
        Double rectHeight = d.getWidth()/20.0;
        Double x = d.getWidth()/2.0;
        Double y = d.getWidth()/2.0;
        
        Rectangle2D constRect = new Rectangle2D.Double(x, y, rectWidth*2.0, rectHeight);
        elements.add(constRect);
        repaint();
        
        Double yString = y+rectHeight/2.0;
        g2.drawString("Constituent", x.intValue(), yString.intValue()); 
        
    }
    
    
    /*
     * Temporary main method, we need an app later
     */
    public static void main(String s[]) {
        JFrame f = new JFrame("Model View");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new ModelView();
        f.getContentPane().add("Center", applet);

        JButton addConst = new JButton();
        addConst.setText("Add Constituent");
        addConst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ((ModelView) applet).createConstituent();
            }
            
        });
        f.getContentPane().add("North", addConst);
        
        applet.init();
        f.pack();
        f.setSize(new Dimension(1024,768));
        f.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("DRAG");
        for (RectangularShape r : movedElements) {
            //TODO change this if we use not only rectangles
            if (r instanceof Rectangle2D) {
                ((Rectangle2D) r).setRect(e.getX(), e.getY(), r.getWidth(), r.getHeight());
            } else if (r instanceof RoundRectangle2D) {
                //TODO
            }else if (r instanceof Ellipse2D) {
                //TODO
            }else{

            }
        }
        repaint();
        //refresh();
         
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("CLICK");
        for (RectangularShape r : elements) {
            if(r.contains(new Point(e.getX(), e.getY()))) {
                movedElements.add(r);
            }
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("CLICK RELEASE");
        movedElements.clear();
        
    }    
    
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }



}
