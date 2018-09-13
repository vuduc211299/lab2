/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_tuan2;


/**
 *
 * @author VŨ ĐỨC
 */
public class StudentManagement {
    static final int maxStudent = 100;
    
    static Student [] s = new Student[maxStudent];
    public static void  main(String [] args){
        s[0]= new Student("john","122","John@");
        s[1]= new Student("jack","120","jack@");
        s[2]= new Student("jack1","1201","jack1@");
        s[2].setGroup("K59CLC");
       // Remove("122"); 
       studentsbyGroup("K59CB");
    }
    /*Return true if 2 students have the same Group*/
    public static boolean sameGroup(Student s, Student m){
        return s.getGroup().equals(m.getGroup());
    }

    /* Print student depend on their group*/
    public  static void studentsbyGroup(String gr){
        for(int i=0 ; i<3 ;i++){
            if(gr.equals(s[i].getGroup())){
                System.out.println(gr + ":");
                s[i].getInfo();
            }
        }
    }
    /* Remove student with ID*/
    
    public static void Remove(String ID){
        for(int i =0; i<3;i++){
            if(s[i].getId().equals(ID)){
                s[i] = null;
            }
        }
        for(int i=0;i<3;i++){
            if(s[i]!=null){
               s[i].getInfo();
            }
        }
    }
}
