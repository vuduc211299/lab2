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
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    /*Default Constructor */
    public Student(){
        name = "student";
        id = "000";
        group = "K59CB";
        email = "uet@uetmail.com";
    }
    /* Construtor with parameter*/
    public Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "K59CB";
    }
    /* Copy Constructor */ 
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    /*return id of student*/
    public String getId(){return id;}
    public void setId(String i){id=i;}
    
     /*return name of student*/
    public String getName(){return name;}
    public void setName(String n){name = n;}
    
     /*return group of student*/
    public String getGroup(){return group;}
    public void setGroup(String g){group = g;}
    
     /*return email of student*/
    public String getEmail(){return email;}
    public void setEmail(String e){name = e;}
    
    /*get info of student*/
    
    public void getInfo(){
        System.out.println("Name: " + name + ", Id: " + id + ", Group: " + group + ", Email:" + email);
    }
}
