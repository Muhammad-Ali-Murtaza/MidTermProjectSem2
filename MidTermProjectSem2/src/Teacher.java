
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Ali Murtaza
 */
public class Teacher extends Person {

    private String status;
//    private ArrayList<Person> list = new ArrayList<Person>();
//    static Teacher t;
//    
//    public ArrayList<Person> getList(){
//        return list;
//    }
//    
//    public void addToList(Person obj)
//    {
//        list.add(obj);
//    }
//    
//    public void setList(int index , Person p)
//    {
//        list.set(index, p);
//    }
//    
//    public Person getObject(int index){
//        return list.get(index);
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void saveTeacher() {
        ListClass l = ListClass.getInstance();

        ArrayList list = l.getTeacherList();
        int size = list.size();
//        JOptionPane.showMessageDialog(null, "Size of list "+size);
        try {
            File f = new File("Teacher.txt");
            FileWriter w = new FileWriter(f);
            for (int i = 0; i < size; i++) {
//                JOptionPane.showMessageDialog(null,"I am writing in file");
                Person p = (Teacher) list.get(i);
                w.write(p.getName() + "," + p.getFName() + ","
                        + p.getEmail() + "," + p.getNumber() + ",");
                Teacher t = (Teacher) p;
                w.write(t.getStatus() + "\n");
            }
            w.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Some error occured in writing files.");
        }

    }
    
    public void loadTeacher()
    {
//        JOptionPane.showMessageDialog(null, "Reading file");
        ListClass l = ListClass.getInstance();
        int instance = 1;
        try {
            File f = new File("Teacher.txt");
            Scanner input = new Scanner(f);
            while (input.hasNextLine()) {
//                JOptionPane.showMessageDialog(null,"Reading from file");
                Person p = new Teacher();
               String s = input.nextLine();
               String [] arr = s.split(",");
               p.setName(arr[0]);
//               JOptionPane.showMessageDialog(null, "arr[0] = "+arr[0]);
               p.setFName(arr[1]);
//               JOptionPane.showMessageDialog(null, "arr[1] = "+arr[1]);
               p.setEmail(arr[2]);
//               JOptionPane.showMessageDialog(null, "arr[2] = "+arr[2]);
               p.setNumber(arr[3]);
//               JOptionPane.showMessageDialog(null, "arr[3] = "+arr[3]);
               ((Teacher)p).setStatus(arr[4]);
//               JOptionPane.showMessageDialog(null, "arr[4] = "+arr[4]);
               l.addTeacher(p);
               instance++;
               
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occured in loading data");
        }
    }
}
