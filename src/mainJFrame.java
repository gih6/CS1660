
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hende
 */
import java.io.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
public class mainJFrame extends javax.swing.JFrame {

	//HERE IS INDEXER
    Indexer fileSys = new Indexer();
    ArrayList<Document> searchList = new ArrayList<>();
    ArrayList<Word> nFreq = new ArrayList<>();
   /**
    * TODO:
    * 2. put in front and have button that "performs" 
    * 3. add a load table of something of later ? 
    */
    /**
     * Creates new form mainJFrame
     */
    public mainJFrame() {
        initComponents();
        //to begin with having main load panel on 
        MainPanel.setVisible(false);
        loadPanel.setVisible(true);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new JFileChooser();
        loadPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loadFile1 = new java.awt.Button();
        invertIndicies = new java.awt.Button();
        file1 = new javax.swing.JLabel();
        file2 = new javax.swing.JLabel();
        file3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chooseTermSearch = new javax.swing.JButton();
        chooseNSearch = new javax.swing.JButton();
        nSearchPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        search_nValue = new java.awt.Button();
        nValue = new javax.swing.JTextField();
        searchPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search_SearchTerm = new java.awt.Button();
        searchTerm = new javax.swing.JTextField();
        NResults = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mainMenu = new javax.swing.JButton();
        SearchResults = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        mainMenu1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Grace Henderson Search Engine");

        jLabel4.setText("Load My Engine");

        loadFile1.setActionCommand("Load_FIle");
        loadFile1.setLabel("Load FIles");
        loadFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFile1ActionPerformed(evt);
            }
        });

        invertIndicies.setLabel("Construct Inverted Indicies");
        invertIndicies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertIndiciesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadPanelLayout = new javax.swing.GroupLayout(loadPanel);
        loadPanel.setLayout(loadPanelLayout);
        loadPanelLayout.setHorizontalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPanelLayout.createSequentialGroup()
                .addGroup(loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(loadPanelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(loadFile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadPanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(invertIndicies, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loadPanelLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(file1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(file2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(file3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        loadPanelLayout.setVerticalGroup(
            loadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(loadFile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(file1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(file3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(invertIndicies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jLabel5.setText("Grace Henderson Search Engine");

        jLabel6.setText("Engine was Loaded & Inverted Indicies were Constructed Successful");

        jLabel7.setText("Please Select Function");

        chooseTermSearch.setText("Search for Term");
        chooseTermSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseTermSearchActionPerformed(evt);
            }
        });

        chooseNSearch.setText("Top N");
        chooseNSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseNSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(chooseTermSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseNSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(chooseTermSearch)
                .addGap(34, 34, 34)
                .addComponent(chooseNSearch)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        jLabel8.setText("Grace Henderson Search Engine");

        jLabel9.setText("Enter your N Value");

        search_nValue.setActionCommand("Search");
        search_nValue.setLabel("Search");
        search_nValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nSearchPanelLayout = new javax.swing.GroupLayout(nSearchPanel);
        nSearchPanel.setLayout(nSearchPanelLayout);
        nSearchPanelLayout.setHorizontalGroup(
            nSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nSearchPanelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(nSearchPanelLayout.createSequentialGroup()
                .addGroup(nSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nSearchPanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(nSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nValue)
                            .addComponent(search_nValue, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addGroup(nSearchPanelLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel9)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        nSearchPanelLayout.setVerticalGroup(
            nSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nSearchPanelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(nValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(search_nValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        jLabel10.setText("Grace Henderson Search Engine");

        jLabel11.setText("Enter your Search Term");

        search_SearchTerm.setActionCommand("Search");
        search_SearchTerm.setLabel("Search");
        search_SearchTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_SearchTermActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel11))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(searchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(search_SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        jLabel12.setText("Grace Henderson Search Engine");

        jLabel1.setText("Top N Frequencies");

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Term", "Top Frequency"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        mainMenu.setText("Main Menu");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NResultsLayout = new javax.swing.GroupLayout(NResults);
        NResults.setLayout(NResultsLayout);
        NResultsLayout.setHorizontalGroup(
            NResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NResultsLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 432, Short.MAX_VALUE))
            .addGroup(NResultsLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(NResultsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenu)
                .addGap(73, 73, 73))
        );
        NResultsLayout.setVerticalGroup(
            NResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NResultsLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(NResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mainMenu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel13.setText("Grace Henderson Search Engine");

        jLabel2.setText("You Searched for:");

        jTable2.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doc ID", "Doc Folder", "Doc Name", "Frequencies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        mainMenu1.setText("Main Menu");
        mainMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Your Search was executed in: ");

        javax.swing.GroupLayout SearchResultsLayout = new javax.swing.GroupLayout(SearchResults);
        SearchResults.setLayout(SearchResultsLayout);
        SearchResultsLayout.setHorizontalGroup(
            SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResultsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchResultsLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SearchResultsLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenu1)
                        .addGap(73, 73, 73))))
            .addGroup(SearchResultsLayout.createSequentialGroup()
                .addGroup(SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(SearchResultsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        SearchResultsLayout.setVerticalGroup(
            SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchResultsLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mainMenu1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(nSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(NResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(nSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(NResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(SearchResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFile1ActionPerformed
        // TODO add your handling code here:
        System.out.println("We are looking for files!");
        jFileChooser1.setMultiSelectionEnabled(true);
        if(jFileChooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            System.out.println("HERE!");
            File files[] = jFileChooser1.getSelectedFiles();
            System.out.println("File path" + files[0].getAbsolutePath());
            System.out.println("File path" + files[1].getAbsolutePath());
            System.out.println("File path" + files[2].getAbsolutePath());
            file1.setText(files[0].getName());
            file2.setText(files[1].getName());
            file3.setText(files[2].getName());
        }
        
        
        //FOR NOW WE ARE GOING TO NOT DO ANYTHING !!!
        
        
    }//GEN-LAST:event_loadFile1ActionPerformed

    private void invertIndiciesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_invertIndiciesActionPerformed
        // TODO add your handling code here:
        System.out.println("Inverting Indicies");
        System.out.println("Now GOing to make the main menu panel visible");
        //once loaded want to go to main panel to search for things 
        MainPanel.setVisible(true);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(false);
        
        
        //HERE INVERTING INDICIES (WITH OTHER FILES BECAUSE NOT THERE YET) !! 
        //temporary !! -- will change to CORRECT FILES ACTUALLY IMPORTED!!! 
        File folder = new File("C:\\Users\\grhen\\OneDrive\\Documents\\Data\\testrun");
        String filepath = "C:\\Users\\grhen\\OneDrive\\Documents\\Data\\testrun";
        String[] lists = folder.list();
        for(int i=0; i<lists.length;i++) {
            String newFilePath = filepath.concat("\\");
            newFilePath = newFilePath.concat(lists[i]);
          	folder = new File(newFilePath);
          	File[] listOfFiles = folder.listFiles();
          	for (File files : listOfFiles) {
          		if (files.isFile()) {
          			try {
          				fileSys.openFile(files);
          				fileSys.makeArrayofMax();
          			  } catch (FileNotFoundException e) {
          			    // Do something with `e`
          			  }
              	}	
          	}
          }

    }//GEN-LAST:event_invertIndiciesActionPerformed

    private void search_nValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nValueActionPerformed
        // TODO add your handling code here:
        System.out.println("We are now searching for the N");
        //change panel that is visible 
        MainPanel.setVisible(false);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(true);
        SearchResults.setVisible(false);
        
        //here is where place n value search 
        int nthValue = Integer.parseInt(nValue.getText());
        nFreq =  fileSys.getMaxFrequencies(nthValue);
        
        DefaultTableModel nResults = (DefaultTableModel)jTable1.getModel();
        nResults.setRowCount(0);
        for(int i =0;i < nFreq.size(); i++)
            nResults.addRow(new Object[] {nFreq.get(i).getWord(),nFreq.get(i).getFrequency()});
    
        
        
    }//GEN-LAST:event_search_nValueActionPerformed

    private void search_SearchTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_SearchTermActionPerformed
        // TODO add your handling code here:
         System.out.println("We are now searching for values in a file");
        //change panel that is visible 
        MainPanel.setVisible(false);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(true);
        
        //need to grab the word input in the textbox
        System.out.println("This is what we want: " + searchTerm.getText());
        jTextField1.setText(searchTerm.getText());
        String searchingWord = searchTerm.getText().toLowerCase();
        searchList = fileSys.searchForTerm(searchingWord);
        System.out.println(searchList);
        
        DefaultTableModel searchResultsTable = (DefaultTableModel)jTable2.getModel();
        searchResultsTable.setRowCount(0);
        for(int i =0;i < searchList.size(); i++)
            searchResultsTable.addRow(new Object[] {searchList.get(i).getID(),searchList.get(i).getFolderName(), searchList.get(i).getFileName(),searchList.get(i).getFrequency()});
    
        
    }//GEN-LAST:event_search_SearchTermActionPerformed

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        // TODO add your handling code here:
         System.out.println("We are goin to the main menu now");
        //change panel that is visible 
        MainPanel.setVisible(true);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(false);
    }//GEN-LAST:event_mainMenuActionPerformed

    private void mainMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu1ActionPerformed
        // TODO add your handling code here:
         System.out.println("We are returning to the main menu");
        //change panel that is visible 
        MainPanel.setVisible(true);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(false);

    }//GEN-LAST:event_mainMenu1ActionPerformed

    private void chooseTermSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseTermSearchActionPerformed
        // TODO add your handling code here:
        System.out.println("We are wanting to go SEARCH for a value ");
        //change panel that is visible 
        MainPanel.setVisible(false);
        loadPanel.setVisible(false);
        searchPanel.setVisible(true);
        nSearchPanel.setVisible(false);
        NResults.setVisible(false);
        SearchResults.setVisible(false);
        
        
       
    }//GEN-LAST:event_chooseTermSearchActionPerformed

    private void chooseNSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseNSearchActionPerformed
        // TODO add your handling code here:
        System.out.println("We are wanting to go SEARCH for N Value ");
        //change panel that is visible 
        MainPanel.setVisible(false);
        loadPanel.setVisible(false);
        searchPanel.setVisible(false);
        nSearchPanel.setVisible(true);
        NResults.setVisible(false);
        SearchResults.setVisible(false);
        
        
        //WANT TO FILL UP THE TABLE!!! 
      
        
       
    }//GEN-LAST:event_chooseNSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NResults;
    private javax.swing.JPanel SearchResults;
    private javax.swing.JButton chooseNSearch;
    private javax.swing.JButton chooseTermSearch;
    private javax.swing.JLabel file1;
    private javax.swing.JLabel file2;
    private javax.swing.JLabel file3;
    private java.awt.Button invertIndicies;
    private JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Button loadFile1;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton mainMenu1;
    private javax.swing.JPanel nSearchPanel;
    private javax.swing.JTextField nValue;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTerm;
    private java.awt.Button search_SearchTerm;
    private java.awt.Button search_nValue;
    // End of variables declaration//GEN-END:variables
}
