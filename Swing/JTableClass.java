package Swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Used to display data in tabular form 
 */
public class JTableClass {

    public static void main(String[] args) {
        Jtables.tables();
        TablesWithListListener.tablesWithListListener();
        
    }
}

class Jtables  {
    public static void tables () {
        JFrame f = new JFrame("JTable Example ");
        String data [][] = {{"101", "Harry" , "10000"}, 
                            {"102", "James", "2002002"},
                            {"103", "Potter", "3030303"}};
        String column [] = {"Name", "UID", "Salary"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30,40,200,300);
        JScrollPane  sp = new JScrollPane(jt);
        f.add(sp);
        //f.setLayout(null);
        f.setSize(300,400);
        f.setVisible(true);
    }
}

//JTables with ListSelection Listener
class TablesWithListListener {
    public static void tablesWithListListener () {
        JFrame f = new JFrame("Table Example");
        String data [] [] = {{"101", "Hermione", "2020202"},
                            {"103", "Granger", "30930930"},
                            {"105", "Weasly", "809800"}};
        String column [] = {"ID", "Name", "Salary"};
        final JTable jt = new JTable(data,column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int [] row = jt.getSelectedRows();
                int column [] = jt.getSelectedColumns();
                for (int i = 0; i < row.length; i++){
                    for (int j = 0; j < column.length; j++){
                        Data = (String)jt.getValueAt(row[i], column[j]);
                    }
                }

                System.out.println("Table element selected: " + Data);
            }
        });

        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,200);
        f.setVisible(true);

    }
}