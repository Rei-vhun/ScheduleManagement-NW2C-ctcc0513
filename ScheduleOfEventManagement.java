
package course.major.output;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;


public class ScheduleOfEventManagement extends javax.swing.JFrame {


    private javax.swing.JButton addButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton exitButton;
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
   

    public ScheduleOfEventManagement() {
        initComponents();
    }
    private ArrayQueue1 q1 = new ArrayQueue1(9999);
    private ArrayQueue2 q2 = new ArrayQueue2(9999);
    private ArrayQueue3 q3 = new ArrayQueue3(9999);
    
    
    
private void initComponents() {
    // Initialization of Swing components goes here
    // (Generated code from your IDE)    
    addButton = new JButton("Add");
    delButton = new JButton("Delete");
    modButton = new JButton("Modify");
    exitButton = new JButton("Exit");

       // ActionListener for addButton
    addButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addButtonActionPerformed(evt);
        }
    });

    // ActionListener for delButton
    delButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            delButtonActionPerformed(evt);
        }
    });
    
    modButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        modButtonActionPerformed(evt);
    }
});

    // ActionListener for exitButton
    exitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            exitButtonActionPerformed(evt);
        }
    });
     
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Schedule of Event Management");
    setBackground(new java.awt.Color(51, 102, 255));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setLocation(new java.awt.Point(0, 0));

    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jTextField1 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                    "Event", "Date", "Time"
            }
    ));
    jScrollPane1.setViewportView(jTable1);

    jLabel1.setText("Event:");
    jLabel2.setText("Date:");
    jLabel3.setText("Time:");
    // Other label and text field initialization codes...

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1)
                            .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(delButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)) // Add Modify button here
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(96, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(addButton)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(delButton)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(modButton)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(exitButton))
                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45))
    );

    pack();
}


private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
   
    if(!(jTextField1.getText().isEmpty()&&jTextField2.getText().isEmpty()&&jTextField3.getText().isEmpty())){
        String event = jTextField1.getText();
        q1.enqueue(event);
        String date = jTextField2.getText();
        q2.enqueue(date);
        String time = jTextField3.getText();
        q3.enqueue(time);
        
        displayDataInTable();
 
    }else{
        JOptionPane.showMessageDialog(rootPane, "Text fields cannot be empty.");
    }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }
    
private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int rowIndex = jTable1.getSelectedRow(); 

    // Check if the row index is valid
    if (rowIndex >= 0 && rowIndex < model.getRowCount()) {
        // Remove the specified row from the table model
        model.removeRow(rowIndex);

        // Refresh the queues after deletion (assuming q1, q2, q3 are Queue instances)
        refreshQueues();  

    } else {
        JOptionPane.showMessageDialog(rootPane, "Row doesn't exist.");
    }
}

private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();

    // Check if a row is selected
    if (selectedRow != -1) {
        // Get data from the selected row
        Object event = model.getValueAt(selectedRow, 0);
        Object date = model.getValueAt(selectedRow, 1);
        Object time = model.getValueAt(selectedRow, 2);

        // Show a dialog to ask for changes
        int result = JOptionPane.showConfirmDialog(this, "Do you want to make changes to the selected row?","Confirm Changes",JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
           String newEvent = JOptionPane.showInputDialog(this, "Enter new event:", event);
            String newDate = JOptionPane.showInputDialog(this, "Enter new date:", date);
            String newTime = JOptionPane.showInputDialog(this, "Enter new time:", time);
            
            q1.dequeue();
            q1.enqueue(newEvent);
            q2.dequeue();
            q2.enqueue(newDate);
            q3.dequeue();
            q3.enqueue(newTime);
            
            model.setValueAt(newEvent, selectedRow, 0);
            model.setValueAt(newDate, selectedRow, 1);
            model.setValueAt(newTime, selectedRow, 2);
            
            refreshQueues();

            
            JOptionPane.showMessageDialog(this, "Changes applied!");
        } else {
            JOptionPane.showMessageDialog(this, "No changes were made.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to modify.");
    }
}


private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Thank you for using the scheduler.");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        System.exit(0);
    }
  


 public class ArrayQueue1 {
    private String[] queueArray1;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue1(int capacity) {
        this.capacity = capacity;
        queueArray1 = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }

    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
            return;
        }
        rear++;
        queueArray1[rear] = item;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null; // or throw an exception
        }
        String dequeuedItem = queueArray1[front];
        front++;
        return dequeuedItem;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return null; // or throw an exception
        }
        return queueArray1[front];
    }
     public void clear() {
        front = 0;
        rear = -1;
        for (int i = 0; i < queueArray1.length; i++) {
            queueArray1[i] = null;
        }
    }
         public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue Contents: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray1[i] + " ");
        }
        System.out.println();
    }
}

 public class ArrayQueue2 {
    private String[] queueArray2;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue2(int capacity) {
        this.capacity = capacity;
        queueArray2 = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }

    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
            return;
        }
        rear++;
        queueArray2[rear] = item;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null; // or throw an exception
        }
        String dequeuedItem = queueArray2[front];
        front++;
        return dequeuedItem;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return null; // or throw an exception
        }
        return queueArray2[front];
    }
     public void clear() {
        front = 0;
        rear = -1;
        for (int i = 0; i < queueArray2.length; i++) {
            queueArray2[i] = null;
        }
    }
         public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue Contents: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray2[i] + " ");
        }
        System.out.println();
    }
}
 
 public class ArrayQueue3 {
    private String[] queueArray3;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue3(int capacity) {
        this.capacity = capacity;
        queueArray3 = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front + 1;
    }

    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue more elements.");
            return;
        }
        rear++;
        queueArray3[rear] = item;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null; // or throw an exception
        }
        String dequeuedItem = queueArray3[front];
        front++;
        return dequeuedItem;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return null; // or throw an exception
        }
        return queueArray3[front];
    }
     public void clear() {
        front = 0;
        rear = -1;
        for (int i = 0; i < queueArray3.length; i++) {
            queueArray3[i] = null;
        }
    }
         public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue Contents: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray3[i] + " ");
        }
        System.out.println();
    }
}

 private void refreshQueues() {
    q1.clear(); 
    q2.clear();
    q3.clear();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int rowCount = model.getRowCount();

    // Repopulate the queues with the data from the updated table
    for (int i = 0; i < rowCount; i++) {
        q1.enqueue(model.getValueAt(i, 0).toString()); // Assuming column 0 is for q1
        q2.enqueue(model.getValueAt(i, 1).toString()); // Assuming column 1 is for q2
        q3.enqueue(model.getValueAt(i, 2).toString()); // Assuming column 2 is for q3
    }
}
 
 private void displayDataInTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table

        // Get the size of the queues (assuming they have the same size)
        int queueSize = q1.size();

        // Loop through the queues and add data to the table
        for (int i = 0; i < queueSize; i++) {
            String eventData = q1.dequeue();
            String dateData = q2.dequeue();
            String timeData = q3.dequeue();

            // Add the data to the table
            model.addRow(new Object[]{eventData, dateData, timeData});

            // Re-enqueue the data back to the queues
            q1.enqueue(eventData);
            q2.enqueue(dateData);
            q3.enqueue(timeData);
        }
    }
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            ScheduleOfEventManagement schedule = new ScheduleOfEventManagement();
            schedule.setLocationRelativeTo(null); 
            schedule.setVisible(true);
            }
        });
    }
}
