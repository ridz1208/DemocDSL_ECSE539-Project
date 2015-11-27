package ca.mcgill.emf.democdsl.view;

import java.awt.Color;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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

import amsd.model.Patient;
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
    private JLabel errorMessage;


    private JLabel influenceCreateLabel;
    private JLabel beliefCreateLabel;
    private JLabel ideologyCreateLabel;
    private JLabel constituentCreateLabel;

    private JLabel influencerSelectLabel;
    private JLabel influenceeSelectLabel;
    private JLabel influenceWeightLabel;
    private JLabel beliefSubjectLabel;
    private JLabel beliefWeightLabel;
    private JLabel ideologyNameLabel;
    private JLabel constituentNamelabel;
    private JLabel constituentIndependencelabel;

    private JComboBox<String> influencerList; 
    private JComboBox<String> influenceeList;
    private JComboBox<String> influenceWeightList;
    private JComboBox<String> beliefSubjectList;
    private JComboBox<String> beliefWeightList;                //%
    private JComboBox<String> constituentIndependenceList;     //%


    private JTextField ideologyNameText;
    private JTextField constituentNameText;

    private JButton addInfluenceButton;
    private JButton addBeliefButton;
    private JButton addIdeologyButton;
    private JButton addConstituentButton;


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
    
    
 

    /** Creates new form EventRegistrationPage */
    public EditorView() {
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
        influenceCreateLabel= new JLabel();
        beliefCreateLabel= new JLabel();
        ideologyCreateLabel= new JLabel();
        constituentCreateLabel= new JLabel();
        //labels
        influencerSelectLabel= new JLabel();
        influenceeSelectLabel= new JLabel();
        influenceWeightLabel= new JLabel();
        beliefSubjectLabel= new JLabel();
        beliefWeightLabel= new JLabel();
        ideologyNameLabel= new JLabel();
        constituentNamelabel= new JLabel();
        constituentIndependencelabel= new JLabel();
        
        //jboxes
        influencerList = new JComboBox<String>(new String[0]); 
        influenceeList = new JComboBox<String>(new String[0]);
        influenceWeightList = new JComboBox<String>(percents);            //%
        beliefSubjectList= new JComboBox<String>(new String[0]);
        beliefWeightList= new JComboBox<String>(percents);                //%
        constituentIndependenceList= new JComboBox<String>(percents);     //%

        //textfields
        ideologyNameText= new JTextField();
        constituentNameText= new JTextField();
        //buttons
        addInfluenceButton=new JButton();
        addBeliefButton=new JButton();
        addIdeologyButton=new JButton();
        addConstituentButton=new JButton();
        
        //LABEL TEXT
        
        
        influenceCreateLabel.setText("Create Influence");
        beliefCreateLabel.setText("Create Belief");
        ideologyCreateLabel.setText("Create Ideology");
        constituentCreateLabel.setText("Create Constituent");
        
        influencerSelectLabel.setText("Select Influencer:");
        influenceeSelectLabel.setText("Select Influencee:");
        influenceWeightLabel.setText("Select Weight(%):");
        beliefSubjectLabel.setText("Select Subject:");
        beliefWeightLabel.setText("Select Weight(%):");
        ideologyNameLabel.setText("Select Name:");
        constituentNamelabel.setText("Select Name:");
        constituentIndependencelabel.setText("Select Independence(%):");
        
        
        
        //LIST actionListeners
        influencerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluencer= cb.getSelectedIndex();
                //build influencee list
                
                influenceeList.setEnabled(true);
            }
        });
        influenceeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluencee = cb.getSelectedIndex();
                if (selectedInfluenceWeight*selectedInfluencee>=0)
                {
                    addInfluenceButton.setEnabled(true);
                }
            }
        });
        influenceWeightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedInfluenceWeight = cb.getSelectedIndex();
                if (selectedInfluenceWeight*selectedInfluencee>=0)
                {
                    addInfluenceButton.setEnabled(true);
                }
            }
        });
        beliefSubjectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedBeliefSubject = cb.getSelectedIndex();
                if (selectedBeliefSubject*selectedBeliefWeight>=0)
                {
                    addBeliefButton.setEnabled(true);
                }
            }
        });
        beliefWeightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox<String> cb = (JComboBox<String>) evt.getSource();
                selectedBeliefWeight = cb.getSelectedIndex();
                if (selectedBeliefSubject*selectedBeliefWeight>=0)
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
        
        //DISABLE INITIALLY
        addInfluenceButton.setEnabled(false);
        addBeliefButton.setEnabled(false);
        addConstituentButton.setEnabled(false);
        //addIdeologyButton.setEnabled(false);
        influenceeList.setEnabled(false);
        
        
        
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
                .addComponent(chooseAppLabel)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(patientLabel)
                                .addComponent(appointmentWithLabel)
                                .addComponent(bookButton)
                                .addComponent(newPersonLabel)
                                .addComponent(personTypeListLabel)
                                .addComponent(personNameLabel)
                                .addComponent(personPhoneLabel))
                        .addGroup(layout.createParallelGroup()
                                .addComponent(patientList)
                                .addComponent(appointmentWithList)
                                .addComponent(cancelButton)
                                .addComponent(personTypeList)
                                .addComponent(personNameTextField, 200, 200, 400)
                                .addComponent(personPhoneTextField, 200, 200, 400)
                                .addComponent(addPersonButton))
                        .addGroup(layout.createParallelGroup()
                                .addComponent(appointmentTypeLabel)
                                .addComponent(appointmentDatePicker)
                                .addComponent(missButton)
                                .addComponent(empAvailibilityLabel)
                                .addComponent(proffTypeListLabel)
                                .addComponent(employeeLabel)
                                .addComponent(availabilityDateLabel)
                                )
                        .addGroup(layout.createParallelGroup()
                                .addComponent(appointmentTypeList)
                                .addComponent(appointmentTimeList)
                                .addComponent(payButton)
                                .addComponent(proffTypeList)
                                .addComponent(employeeList)
                                .addComponent(availabilityDatePicker)
                                .addComponent(addAvailabilityButton)
                                )
                        )
                .addComponent(jsp)
                );

        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {bookButton, patientLabel});
        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {addPersonButton, personNameTextField});
        //layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {addAvailabilityButton, appointmentDocTextField});

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addComponent(errorMessage)
                .addComponent(chooseAppLabel)
                .addGroup(layout.createParallelGroup()
                        .addComponent(patientLabel)
                        .addComponent(patientList)
                        .addComponent(appointmentTypeLabel)
                        .addComponent(appointmentTypeList))
                .addGroup(layout.createParallelGroup()
                        .addComponent(appointmentWithLabel)
                        .addComponent(appointmentWithList)
                        .addComponent(appointmentDatePicker)
                        .addComponent(appointmentTimeList))
                .addGroup(layout.createParallelGroup()
                        .addComponent(bookButton)
                        .addComponent(cancelButton)
                        .addComponent(missButton)
                        .addComponent(payButton))
                .addGroup(layout.createParallelGroup()
                        .addComponent(newPersonLabel)
                        .addComponent(empAvailibilityLabel)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(personTypeListLabel)
                        .addComponent(personTypeList)
                        .addComponent(proffTypeListLabel)
                        .addComponent(proffTypeList)
                        )   
                .addGroup(layout.createParallelGroup()
                        .addComponent(personNameLabel)
                        .addComponent(personNameTextField)
                        .addComponent(employeeLabel)
                        .addComponent(employeeList)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(personPhoneLabel)
                        .addComponent(personPhoneTextField)
                        .addComponent(availabilityDateLabel)
                        .addComponent(availabilityDatePicker)
                        )
                .addGroup(layout.createParallelGroup()
                        .addComponent(addPersonButton)
                        .addComponent(addAvailabilityButton)
                        )
                .addComponent(jsp)
                );

        pack();
    }

    private void refreshData() {
        DemocDSL ddsl = DemocDSL.getInstance();
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
            
            //reset text fields
            ideologyNameText.setText("");
            constituentNameText.setText("");
            
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
                indexB++;
            }
            constituents = new HashMap<Integer, Constituent>();
            Iterator<Constituent> cIt = ddsl.getConstituents().iterator();
            Integer indexC = 0;
            while (cIt.hasNext()) {
                Constituent c = cIt.next();
                constituents.put(indexC, c);
                indexC++;
            }
            ideologies = new HashMap<Integer, Ideology>();
            Iterator<Ideology> idIt = ddsl.getIdeologies().iterator();
            Integer indexId = 0;
            while (idIt.hasNext()) {
                Ideology id = idIt.next();
                ideologies.put(indexId, id);
                indexId++;
            }
            
        }
        // this is needed because the size of the window changes depending on whether an error message is shown or not
        pack();
    }

    private void addInfluenceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO
        // update visuals
        refreshData();
    }
    private void addBeliefButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO
     // update visuals
        refreshData();
    }
    private void addConstituentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO
     // update visuals
        refreshData();
    }
    private void addIdeologyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO
     // update visuals
        refreshData();
    }
    
}
