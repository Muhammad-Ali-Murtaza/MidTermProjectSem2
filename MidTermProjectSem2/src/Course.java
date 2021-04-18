
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Ali Murtaza
 */
public class Course {
    private String CourseName;
    private String CourseCode;
    private String TeacherName;
    private String CreditHour;
    private String ContactHour;
    private String Semester;
    private ArrayList<CLO> clo = new ArrayList<CLO>();
    
    public String getCourseName(){
        return CourseName;
    }
    
    public String getCourseCode(){
        return CourseCode;
    }
    
    public String getTeachername(){
        return TeacherName;
    }
    
    public String getCreditHour(){
        return CreditHour;
    }
    
    public String getContactHour(){
        return ContactHour;
    }
    
    public String getSemester()
    {
        return Semester;
    }
    
    public void setCourseName(String name){
        CourseName = name;
    }
    
    public void setCourseCode(String code){
        CourseCode = code;
    }
    
    public void setTeachername(String name){
        TeacherName = name;
    }
    
    public void setCreditHour(String hour){
        CreditHour = hour;
    }
    
    public void setContactHour(String hour){
        ContactHour = hour;
    }
    
    public void setSemester(String sem)
    {
        Semester = sem;
    }
}
