package lessons16.redactor;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Denni on 01.07.2016.
 */
public class Redactro extends JFrame {

    private DefaultMutableTreeNode myComputer;
    private JFileChooser chooser;
    private JTextArea jtaWorkspase;
    private JTabbedPane jTabbedWorkspace;

    public Redactro() {
        super("Word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 50, 800, 800);
        poleGUI();
        chooser = new JFileChooser();


    }

    public void poleGUI() {

        JMenuBar jMenuBar = new JMenuBar();
        {
            JMenu jMenuFile = new JMenu("File");
            {
                JMenuItem jMenuItemNewFile = new JMenuItem("New File");
                JMenuItem jMenuItemOpenFile = new JMenuItem("Open File");
                jMenuItemOpenFile.addActionListener(e -> {
                    int choise = chooser.showOpenDialog(Redactro.this);

                    if (choise == JFileChooser.APPROVE_OPTION) {
                        JPanel pnlTab = new JPanel(new BorderLayout());
                        JTextArea workspace = new JTextArea();
                        File openFile = chooser.getSelectedFile();
                        try {

                            Scanner scn = new Scanner(new FileReader(openFile));
                            while (scn.hasNextLine()) {
                                jtaWorkspase.append(scn.nextLine());
                            }

                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }
                        pnlTab.add(workspace);
                        jTabbedWorkspace.addTab(workspace.getName(),pnlTab);
                    }

                });
                JMenuItem jMenuItemSave = new JMenuItem("Save");
                JMenuItem jMenuItemSaveAs = new JMenuItem("Save As");
                JMenuItem jMenuItemExit = new JMenuItem("Exit");
                jMenuFile.add(jMenuItemNewFile);
                jMenuFile.add(jMenuItemOpenFile);
                jMenuFile.add(jMenuItemSave);
                jMenuFile.add(jMenuItemSaveAs);
                jMenuFile.add(jMenuItemExit);
            }

            jMenuBar.add(jMenuFile);
        }

        JSplitPane splWorkspace = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splWorkspace.setDividerSize(3);
        splWorkspace.setDividerLocation(250);


        jTabbedWorkspace = new JTabbedPane(JTabbedPane.TOP);
        {
            JPanel pnlWorkspapse = new JPanel(new BorderLayout());
            jtaWorkspase = new JTextArea();
            pnlWorkspapse.add(jtaWorkspase,BorderLayout.CENTER);
            jTabbedWorkspace.addTab("TXT.txt", pnlWorkspapse);
        }
        splWorkspace.setRightComponent(jTabbedWorkspace);
        myComputer = new DefaultMutableTreeNode("My Computer");
        JTree trFileExp = new JTree(myComputer);

        File[] roots = File.listRoots();
        for (File root : roots) {
            DefaultMutableTreeNode rootDrive = new DefaultMutableTreeNode(root);
            myComputer.add(rootDrive);
            addChildsToDrive(0, rootDrive, root);
        }

        splWorkspace.setLeftComponent(trFileExp);


        add(jMenuBar, BorderLayout.NORTH);
        add(splWorkspace, BorderLayout.CENTER);
        setVisible(true);
    }

    private void addChildsToDrive(int level, DefaultMutableTreeNode mutableDrive, File file) {

        File[] files = file.listFiles();
        if (files != null) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (File f : files) {
                        DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(f);
                        mutableDrive.add(newChild);
                        addChildsToDrive(level + 1, newChild, f);

                    }
                }
            });
            // thread.start();

        }


    }


}
