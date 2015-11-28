/**
 * 
 */
package ca.mcgill.emf.democdsl.view;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
    private ArrayList<DemocIcon> elements = new ArrayList<DemocIcon>();
    private ArrayList<Object> links = new ArrayList<Object>();

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
    final static Color selected = Color.cyan;

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
        /*
        Color fg3D = Color.lightGray;
        
        g2.setPaint(fg3D);
        g2.draw3DRect(0, 0, d.width - 1, d.height - 1, true);
        g2.draw3DRect(3, 3, d.width - 7, d.height - 7, false);
        g2.setPaint(fg);
        */
        int x = 5;
        int y = 7;
        int rectWidth = gridWidth - 2*x;
        int stringY = gridHeight - 3 - fontMetrics.getDescent();
        int rectHeight = stringY - fontMetrics.getMaxAscent() - y - 2;
/*
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
        x += gridWidth;*/

        

        // NEW ROW
        x = 5;
        y += gridHeight;
        stringY += gridHeight;

        refresh();


    }
    
    public void refresh() {
        // blank the canvas
        g2.setColor(bg);
        double dWidth = d.getWidth();
        double dHeight = d.getHeight();
        g2.fillRect(0,0, (int)dWidth, (int)dHeight);
        

        g2.setColor(fg);   

        for(Object l : links) {
            ((Influence) l).draw();
            /*
            DemocIcon[] i = (DemocIcon[])l;
            g2.drawLine((int)i[0].shape.getCenterX(), (int)i[0].shape.getCenterY(),
                    (int)i[1].shape.getCenterX(), (int)i[1].shape.getCenterY());
                    */
        }
        
        for(Object r : elements) {
            DemocIcon i = (DemocIcon)r;
            g2.setColor(fg);
            i.draw();
        }
    }
    
    public void createConstituent(String name, int ind){
        Dimension d = getSize();
        Double w = d.getWidth()/20.0;
        Double h = d.getWidth()/20.0;
        Double x = d.getWidth()/2.0;
        Double y = d.getHeight()/2.0;
        
        ConstituentIcon consti = new ConstituentIcon(name, ind, new Rectangle2D.Double(x, y, w*2.0, h));
        elements.add(consti);
        repaint();
        
    }

    public void createIdeology(String name) {
        Dimension d = getSize();
        Double w = d.getWidth()/20.0;
        Double h = d.getWidth()/20.0;
        Double x = d.getWidth()/2.0;
        Double y = d.getHeight()/2.0;
        
        IdeologyIcon ideo = new IdeologyIcon(name, 
                new RoundRectangle2D.Double(x, y, w*2.0, h, 20, 20));
        elements.add(ideo);
        
        repaint();
        
    }
    
    public void createBelief(String name, int weight){
        Dimension d = getSize();
        Double w = d.getWidth()/20.0;
        Double h = d.getWidth()/20.0;
        Double x = d.getWidth()/2.0;
        Double y = d.getHeight()/2.0;
        
        BeliefIcon belief = new BeliefIcon(name, weight, 
                new Ellipse2D.Double(x, y, w*2.0, h));
        elements.add(belief);
        
        repaint();
        
    }
    
    public void createInfluence(String ideology, String constituent, int weight) {
        DemocIcon ideo = null;
        DemocIcon con = null;
        //finds first element with name
        for(DemocIcon i : elements) {
            if(i.name.equals(ideology)){
                ideo = i;
                break;
            }
                
        }
        for(DemocIcon c : elements) {
            if(c.name.equals(constituent)){
                con = c;
                break;
            }
                
        }
        
        if(ideo != null && con != null) {
            //store ideology, constituent and Line2D
            Influence i = new Influence(ideo, con, weight);
            links.add(i);
        }
        repaint();
        
    }
    
    
    /*
     * Temporary main method, we need an app later
     */
    public static void main(String s[]) {
        JFrame f = new JFrame("Model View");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JApplet applet = new ModelView();
        f.getContentPane().add("Center", applet);

        JPanel p = new JPanel();
        
        JButton addConst = new JButton();
        addConst.setText("Add Constituent");
        addConst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ((ModelView) applet).createConstituent("Yanis", 50);
            }
            
        });
        p.add(addConst);
        JButton addIdeology = new JButton();
        addIdeology.setText("Add Ideology");
        addIdeology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ((ModelView) applet).createIdeology("Communism");
            }
            
        });
        p.add(addIdeology);
        JButton addBelief = new JButton();
        addBelief.setText("Add Belief");
        addBelief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ((ModelView) applet).createBelief("Equality", 40);
            }
            
        });
        p.add(addBelief);
        
        JButton addInfluence = new JButton();
        addInfluence.setText("Add Influence");
        addInfluence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ((ModelView) applet).createInfluence("Communism", "Yanis", 50);
            }
            
        });
        p.add(addInfluence);
        
        f.getContentPane().add("North", p);
        
        applet.init();
        f.pack();
        f.setSize(new Dimension(1024,768));
        f.setVisible(true);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("DRAG");
        for (Object r : elements) {
            DemocIcon i = (DemocIcon)r;
            if(i.isSelected == false) {
                continue;
            }
            //TODO change this if we use not only rectangles
            if (r instanceof ConstituentIcon) {
                ((ConstituentIcon) r).move(e.getX(), e.getY());
            } else if (r instanceof IdeologyIcon) {
                ((IdeologyIcon)r).move(e.getX(), e.getY());
            }else if (r instanceof BeliefIcon) {
                ((BeliefIcon)r).move(e.getX(), e.getY());
            }else{

            }
        }
        repaint();
        //refresh();
         
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        //deselect everything
        for (Object r : elements) {
            DemocIcon i = (DemocIcon)r;
            i.isSelected = false;
        }
        //select those clicked
        for (Object r : elements) {
            DemocIcon i = (DemocIcon)r;
            if(i.shape.contains(new Point(e.getX(), e.getY()))) {
                System.out.println(e.getX() + ", "+ e.getY());
                i.isSelected = true;
            }
        }
        repaint();
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

    
    
    
    
    /**
     * Helper classes for model icons
     */
    public abstract class DemocIcon {
        /**
         * Abstract class for a model icon
         */
        protected String name;
        protected RectangularShape shape;
        protected boolean isSelected = false;
        
        public DemocIcon(String name) {
            this.name = name;
        }
        public void move(double x, double y) {
        }
        
        public void draw() {
            g2.setStroke(stroke);
            g2.draw(shape);
            if(isSelected) {
                g2.setPaint(selected);
                g2.fill(shape);
                g2.setPaint(fg);
            }
            else {
                g2.setPaint(white);
                g2.fill(shape);
                g2.setPaint(fg);
            }
            
            double xString = shape.getCenterX() - + shape.getWidth() / 6.0;
            double yString = shape.getCenterY();
            g2.drawString(name, (int)xString, (int)yString);
        }
    }
    
    public class ConstituentIcon extends DemocIcon {

        protected int independence;
        
        /**
         * Constituent model Icon
         * @param name name of the constituent
         * @param independ independence of the constituent
         * @param e shape of the constituent
         */
        public ConstituentIcon(String name, int independ, Rectangle2D e) {
            super(name);
            this.independence = independ;
            this.shape = e;
        }
        
        
        public void move(double x, double y) {
            shape = new Rectangle2D.Double(x, y, shape.getWidth(), shape.getHeight());
        }
        
        @Override
        public void draw() {
            super.draw();
            
            double xString = shape.getCenterX() - shape.getWidth() / 6.0;
            double yString = shape.getCenterY() + shape.getHeight() / 6.0;
            g2.drawString("ind: "+independence, (int)xString, (int)yString);
        }
        

    }
    
    public class IdeologyIcon extends DemocIcon{

        /**
         * Ideology Icon
         * @param name name of the ideology
         * @param v value of the ideology
         * @param e shape
         */
        public IdeologyIcon(String name, RoundRectangle2D e) {
            super(name);
            this.shape = e;
        }
        
        
        public void move(double x, double y) {
            shape = new RoundRectangle2D.Double(x, y, shape.getWidth(), shape.getHeight(), 
                    ((RoundRectangle2D)shape).getArcWidth(), ((RoundRectangle2D)shape).getArcHeight());
      
        }
        
        @Override
        public void draw() {
            super.draw();
            
        }
        

    }
    
    public class BeliefIcon extends DemocIcon{
        protected int value;
        protected boolean isSelected = false;
        
        /**
         * Belief model icon
         * @param name name of the belief
         * @param v value of the belief
         * @param e shape of the belief
         */
        public BeliefIcon(String name, int v, Ellipse2D e) {
            super(name);
            this.shape = e;
            this.value = v;
        }
        
        public void move(double x, double y) {
            shape = new Ellipse2D.Double(x, y, shape.getWidth(), shape.getHeight());
            
        }
        
        @Override
        public void draw() {
            super.draw();
            
            
            double xString = shape.getCenterX()  - shape.getWidth() / 6.0;
            double yString = shape.getCenterY() + shape.getHeight() / 6.0;;
            g2.drawString("val: "+value, (int)xString, (int)yString);
        }
        
    }
    
    public class Influence{
        protected Line2D line;
        protected int weight;
        protected DemocIcon source;
        protected DemocIcon target;
        
        protected boolean isSelected = false;
        
        /**
         * Influence between an ideology and constituent
         * @param i ideology that is source of the line
         * @param c constituent that is target of line
         * @param w weight
         */
        public Influence(DemocIcon i, DemocIcon c, int w) {
            source = i;
            target = c;
            weight = w;
        }
        
        public void draw() {
            line = new Line2D.Double(source.shape.getCenterX(), source.shape.getCenterY(), 
                                     target.shape.getCenterX(), target.shape.getCenterY());
            
            g2.draw(line);
            
            
            double xString = line.getBounds2D().getCenterX();//  - line.getBounds2D().getWidth() / 6.0;
            double yString = line.getBounds2D().getCenterY();// + line.getBounds2D().getHeight() / 6.0;
            g2.drawString(""+weight, (int)xString, (int)yString);
        }
        
    }

}
