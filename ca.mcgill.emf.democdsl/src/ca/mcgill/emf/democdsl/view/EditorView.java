package ca.mcgill.emf.democdsl.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumn;


import ca.mcgill.emf.democdsl.controller.*;
import ca.mcgill.emf.democdsl.*;


public class EditorView extends JFrame {

    private static final long serialVersionUID = -4426310869335015542L;
    //globals

    //	private JLabel 
    //	private JComboBox<String> 
    //	private JTextField 
    //	private JButton 
    //	
    private Controller dslc;
    ca.mcgill.emf.democdsl.DemocDSL ddsl;
    private JLabel errorMessage;


    private JLabel influenceCreateLabel;
    private JLabel beliefCreateLabel;
    private JLabel ideologyCreateLabel;
    private JLabel constituentCreateLabel;
    private JLabel linkBeliefCreateLabel;

    private JLabel influencerSelectLabel;
    private JLabel influenceeSelectLabel;
    private JLabel influenceWeightLabel;
    private JLabel beliefSubjectLabel;
    private JLabel beliefSelectLabel;
    private JLabel beliefWeightLabel;
    private JLabel ideologyNameLabel;
    private JLabel constituentNamelabel;
    private JLabel constituentIndependencelabel;
    private JLabel beliefNameLabel;

    private JComboBox<String> influencerList; 
    private JComboBox<String> influenceeList;
    private JComboBox<String> influenceWeightList;
    private JComboBox<String> beliefSubjectList;
    private JComboBox<String> beliefList;
    private JComboBox<String> beliefWeightList;                //%
    private JComboBox<String> constituentIndependenceList;     //%


    private JTextField ideologyNameText;
    private JTextField constituentNameText;
    private JTextField beliefNameText;

    private JButton addInfluenceButton;
    private JButton addBeliefButton;
    private JButton addIdeologyButton;
    private JButton addConstituentButton;
    private JButton linkBeliefButton;


    private HashMap<Integer, Belief> beliefs;
    private HashMap<Integer, Constituent> constituents;
    private HashMap<Integer, Ideology> ideologies;
    private HashMap<Integer, Influence> influences;
    //private HashMap<Integer, Appointment> appointments;
    
    //variables
    private String[] percents =  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};
    private String error = null;

    
    //select variables
    private Integer selectedInfluencer = -1;
    private Integer selectedInfluencee = -1;
    private Integer selectedInfluenceWeight = -1;
    private Integer selectedBeliefSubject = -1;
    private Integer selectedBeliefWeight = -1;
    private Integer selectedConstituentIndependence = -1;
    private Integer selectedBelief = -1;
    
    
 

    /** Creates new form EventRegistrationPage */
    public EditorView(Controller c,ca.mcgill.emf.democdsl.DemocDSL model) {
        dslc = c;
        ddsl=model;
        initComponents();
        refreshData();
    }

    /** This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {


        // elements for error message
        errorMessage = new JLabel();
        errorMessage.setForeground(Color.RED);

        //headers
        influenceCreateLabel= new JLabel("Underlined Label");
        beliefCreateLabel= new JLabel("Underlined Label");
        ideologyCreateLabel= new JLabel("Underlined Label");
        constituentCreateLabel= new JLabel("Underlined Label");
        linkBeliefCreateLabel = new JLabel("Underlined Label");
        //UNDERLINE LABELS
        Font font1 = influenceCreateLabel.getFont();
        Map attributes1 = font1.getAttributes();
        attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        influenceCreateLabel.setFont(font1.deriveFont(attributes1));
        Font font2 = beliefCreateLabel.getFont();
        Map attributes2 = font2.getAttributes();
        attributes2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        beliefCreateLabel.setFont(font2.deriveFont(attributes2));
        Font font3 = ideologyCreateLabel.getFont();
        Map attributes3 = font3.getAttributes();
        attributes3.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        ideologyCreateLabel.setFont(font3.deriveFont(attributes3));
        Font font4 = constituentCreateLabel.getFont();
        Map attributes4 = font4.getAttributes();
        attributes4.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        constituentCreateLabel.setFont(font4.deriveFont(attributes4));
        Font font5 = linkBeliefCreateLabel.getFont();
        Map attributes5 = font5.getAttributes();
        attributes5.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        linkBeliefCreateLabel.setFont(font5.deriveFont(attributes5));
        
        
        //labels
        influencerSelectLabel= new JLabel();
        influenceeSelectLabel= new JLabel();
        influenceWeightLabel= new JLabel();
        beliefSubjectLabel= new JLabel();
        beliefSelectLabel= new JLabel();
        beliefWeightLabel= new JLabel();
        ideologyNameLabel= new JLabel();
        constituentNamelabel= new JLabel();
        constituentIndependencelabel= new JLabel();
        beliefNameLabel= new JLabel();
        
        //jboxes
        influencerList = new JComboBox<String>(new String[0]); 
        influenceeList = new JComboBox<String>(new String[0]);
        influenceWeightList = new JComboBox<String>(percents);            //%
        beliefSubjectList= new JComboBox<String>(new String[0]);
        beliefWeightList= new JComboBox<String>(percents);                //%
        constituentIndependenceList= new JComboBox<String>(percents);     //%
        beliefList= new JComboBox<String>(new String[0]);

        //textfields
        ideologyNameText= new JTextField();
        constituentNameText= new JTextField();
        beliefNameText = new JTextField();
        
        //buttons
        addInfluenceButton=new JButton();
        addBeliefButton=new JButton();
        addIdeologyButton=new JButton();
        addConstituentButton=new JButton();
        linkBeliefButton = new JButton();
        
        //LABEL TEXT
        influenceCreateLabel.setText("Create Influence");
        beliefCreateLabel.setText("Create Belief");
        ideologyCreateLabel.setText("Create Ideology");
        constituentCreateLabel.setText("Create Constituent");
        linkBeliefCreateLabel.setText("Link Belief to Subject");
        
        influencerSelectLabel.setText("Select Influencer:");
        influenceeSelectLabel.setText("Select Influencee:");
        influenceWeightLabel.setText("Select Weight(%):");
        beliefSubjectLabel.setText("Select Subject:");
        beliefSelectLabel.setText("Select Belief:");
        beliefWeightLabel.setText("Select Weight(%):");
        ideologyNameLabel.setText("Select Name:");
        constituentNamelabel.setText("Select Name:");
        constituentIndependencelabel.setText("Select Independence(%):");
        beliefNameLabel.setText("New Belief:");
        
        //BUTTON TEXT
        addInfluenceButton.setText("Add Influence");
        addBeliefButton.setText("Add Belief");
        addIdeologyButton.setText("Add Ideology");
        addConstituentButton.setText("Add Constituent");
        linkBeliefButton.setText("Link");
        
        //LIST actionListeners
        influencerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluencer= cb.getSelectedIndex();
                //build influencee list
                if (selectedInfluenceWeight*selectedInfluencee*selectedInfluencer>=0)
                {
                    addInfluenceButton.setEnabled(true);
                }
            }
        });
        influenceeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluencee = cb.getSelectedIndex();
                if (selectedInfluenceWeight*selectedInfluencee*selectedInfluencer>=0)
                {
                    addInfluenceButton.setEnabled(true);
                }
            }
        });
        influenceWeightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluenceWeight = cb.getSelectedIndex();
                if (selectedInfluenceWeight*selectedInfluencee*selectedInfluencer>=0)
                {
                    addInfluenceButton.setEnabled(true);
                }
            }
        });
        beliefSubjectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedBeliefSubject = cb.getSelectedIndex();
                if (selectedBeliefSubject*selectedBelief>=0)
                {
                    linkBeliefButton.setEnabled(true);
                }
            }
        });
        beliefWeightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedBeliefWeight = cb.getSelectedIndex();
                if (selectedBeliefWeight>=0)
                {
                    addBeliefButton.setEnabled(true);
                }
            }
        });
        constituentIndependenceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedConstituentIndependence = cb.getSelectedIndex();
                if (selectedConstituentIndependence>=0)
                {
                    addConstituentButton.setEnabled(true);
                }
            }
        });
        beliefList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedBelief = cb.getSelectedIndex();
                if (selectedBeliefSubject*selectedBelief>=0)
                {
                    linkBeliefButton.setEnabled(true);
                }
            }
        });
        
        
        //BUTTON action listeners
        addInfluenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInfluenceButtonActionPerformed(evt);
            }
        });
        addBeliefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBeliefButtonActionPerformed(evt);
            }
        });
        addConstituentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConstituentButtonActionPerformed(evt);
            }
        });
        addIdeologyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIdeologyButtonActionPerformed(evt);
            }
        });
        linkBeliefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkBeliefButtonActionPerformed(evt);
            }
        });
        //DISABLE INITIALLY
        addInfluenceButton.setEnabled(false);
        addBeliefButton.setEnabled(false);
        addConstituentButton.setEnabled(false);
        //addIdeologyButton.setEnabled(false);
        linkBeliefButton.setEnabled(false);
        //influenceeList.setEnabled(false);
        
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("DemocDSL");
        
        //LAYOUT
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                .addComponent(errorMessage)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(influenceCreateLabel)
                                .addComponent(influencerSelectLabel)
                                .addComponent(influenceeSelectLabel)
                                .addComponent(influenceWeightLabel)
                                .addComponent(linkBeliefCreateLabel)
                                .addComponent(beliefSubjectLabel)
                                .addComponent(beliefSelectLabel)
                                )
                        .addGroup(layout.createParallelGroup()
                                .addComponent(influencerList)
                                .addComponent(influenceeList)
                                .addComponent(influenceWeightList)
                                .addComponent(addInfluenceButton,200,200,200)
                                .addComponent(beliefSubjectList)
                                .addComponent(beliefList)
                                .addComponent(linkBeliefButton,200,200,200)
                                )
                        .addGroup(layout.createParallelGroup()
                                .addComponent(constituentCreateLabel)
                                .addComponent(constituentNamelabel)
                                .addComponent(constituentIndependencelabel)
                                .addComponent(ideologyCreateLabel)
                                .addComponent(ideologyNameLabel)
                                .addComponent(beliefCreateLabel)
                                .addComponent(beliefNameLabel)
                                .addComponent(beliefWeightLabel)
                                )
                        .addGroup(layout.createParallelGroup()
                                .addComponent(constituentNameText)
                                .addComponent(constituentIndependenceList)
                                .addComponent(addConstituentButton,200,200,200)
                                .addComponent(ideologyNameText)
                                .addComponent(addIdeologyButton,200,200,200)
                                .addComponent(beliefNameText)
                                .addComponent(beliefWeightList)
                                .addComponent(addBeliefButton,200,200,200)
                                )
                        )
                );

        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {addConstituentButton, constituentNameText});
        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {addIdeologyButton, ideologyNameText});
        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {addBeliefButton, beliefNameText});
        //layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {bookButton, patientLabel});
        //layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {bookButton, patientLabel});

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addComponent(errorMessage)
                .addGroup(layout.createParallelGroup()
                        .addComponent(influenceCreateLabel)
                        .addComponent(constituentCreateLabel)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(influencerSelectLabel)
                        .addComponent(influencerList)
                        .addComponent(constituentNamelabel)
                        .addComponent(constituentNameText)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(influenceeSelectLabel)
                        .addComponent(influenceeList)
                        .addComponent(constituentIndependencelabel)
                        .addComponent(constituentIndependenceList)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(influenceWeightLabel)
                        .addComponent(influenceWeightList)
                        .addComponent(addConstituentButton)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(addInfluenceButton)
                        )   
                .addGroup(layout.createParallelGroup()
                        .addComponent(ideologyCreateLabel)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(linkBeliefCreateLabel)
                        .addComponent(ideologyNameLabel)
                        .addComponent(ideologyNameText)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(beliefSubjectLabel)
                        .addComponent(beliefSubjectList)
                        .addComponent(addIdeologyButton)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(beliefSelectLabel)
                        .addComponent(beliefList)
                        )
                .addGroup(layout.createParallelGroup()
                        
                        .addComponent(beliefCreateLabel)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(linkBeliefButton)
                        .addComponent(beliefNameLabel)
                        .addComponent(beliefNameText)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(beliefWeightLabel)
                        .addComponent(beliefWeightList)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(addBeliefButton)
                        )
                );

        pack();
    }

    private void refreshData() {
        //DemocDSL ddsl = DemocdslFactory.eINSTANCE.createDemocDSL();
        
        // error
        errorMessage.setText(error);
        if (error == null || error.length() == 0) {
            //reset dynamic lists
            influencerList.removeAllItems();
            influenceeList.removeAllItems();
            beliefSubjectList.removeAllItems();
            influencerList.setSelectedIndex(-1);
            influenceeList.setSelectedIndex(-1);
            beliefSubjectList.setSelectedIndex(-1);
            
            //reset static lists
            influenceWeightList.setSelectedIndex(-1);
            beliefWeightList.setSelectedIndex(-1);
            constituentIndependenceList.setSelectedIndex(-1);
            
            //reset selector index
            selectedInfluencer = -1;
            selectedInfluencee = -1;
            selectedInfluenceWeight = -1;
            selectedBeliefSubject = -1;
            selectedBeliefWeight = -1;
            selectedConstituentIndependence = -1;
            selectedBelief = -1;
            
            //reset text fields
            ideologyNameText.setText("");
            constituentNameText.setText("");
            beliefNameText.setText("");
            
            //reset hashmaps
            influences = new HashMap<Integer, Influence>();
            Iterator<Influence> infIt = ddsl.getInfluences().iterator();
            Integer indexInf = 0;
            while (infIt.hasNext()) {
                Influence i = infIt.next();
                influences.put(indexInf, i);
                indexInf++;
            }
            beliefs = new HashMap<Integer, Belief>();
            Iterator<Belief> bIt = ddsl.getBeliefs().iterator();
            Integer indexB = 0;
            while (bIt.hasNext()) {
                Belief b = bIt.next();
                beliefs.put(indexB, b);
                beliefList.addItem(b.getName());
                indexB++;
            }
            //System.out.println(ddsl.getConstituents());
            constituents = new HashMap<Integer, Constituent>();
            Iterator<Constituent> cIt = ddsl.getConstituents().iterator();
            Integer indexC = 0;
            while (cIt.hasNext()) {
                Constituent c = cIt.next();
                constituents.put(indexC, c);
                System.out.println(c.getName());
                influenceeList.addItem(c.getName());
                indexC++;
            }
            ideologies = new HashMap<Integer, Ideology>();
            Iterator<Ideology> idIt = ddsl.getIdeologies().iterator();
            Integer indexId = 0;
            while (idIt.hasNext()) {
                Ideology id = idIt.next();
                ideologies.put(indexId, id);
                System.out.println(id.getName());
                influencerList.addItem(id.getName());
                indexId++;
            }
            
            
            addInfluenceButton.setEnabled(false);
            addBeliefButton.setEnabled(false);
            addConstituentButton.setEnabled(false);
            //addIdeologyButton.setEnabled(false);
            linkBeliefButton.setEnabled(false);
        }
        // this is needed because the size of the window changes depending on whether an error message is shown or not
        pack();
    }

    private void addInfluenceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Ideology i = ideologies.get(selectedInfluencer);
        Constituent c = constituents.get(selectedInfluencee);
        int weight = selectedInfluenceWeight+1;
        dslc.createInfluence(c,i,weight);
        // update visuals
        refreshData();
    }
    private void addBeliefButtonActionPerformed(java.awt.event.ActionEvent evt) {
        error = "";
        if (beliefNameText.getText().length() <= 1){
            error = error + "no Belief name entered";
        }
        error = error.trim();
        if (error.length() == 0) {
            dslc.createBelief(beliefNameText.getText(),Integer.parseInt(percents[selectedBeliefWeight]));
        }
        // update visuals
        refreshData();
    }
    private void linkBeliefButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
     // update visuals
        refreshData();
    }
    private void addConstituentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        error = "";
        if (constituentNameText.getText().length() <= 1){
            error = error + "no Constituent name entered";
        }
        error = error.trim();
        if (error.length() == 0) {
            dslc.createConstituent(constituentNameText.getText(),Integer.parseInt(percents[selectedConstituentIndependence]));     
        }
        // update visuals
        refreshData();
    }
    private void addIdeologyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        error = "";
        if (ideologyNameText.getText().length() <= 1){
            error = error + "no Ideology name entered";
        }
        error = error.trim();
        if (error.length() == 0) {
            dslc.createIdeology(ideologyNameText.getText());
        }
        // update visuals
        refreshData();
    }
    
}
