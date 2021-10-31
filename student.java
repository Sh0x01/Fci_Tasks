/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shehab
 */
public class student
{
  public  String studentname;
    public int privatestudentid;
    public double studentgpa;
    public subject sub;
    public address add;
    public student()
    {
        studentname="Ahmed";
        privatestudentid=101010;
        studentgpa=3.5;
        sub.subjectname="computer science";
        sub.subjecthours=3;
        sub.subjectid=1515;
        add.City="Minia";
        add.StreetNum=5;
    }
    public student(String stdname,int id,double stdgpa,int subhour,int subid,String subname,int strnum,String city,String country)
    {
        studentname=stdname;
        privatestudentid=id;
        studentgpa=stdgpa;
        sub.subjecthours=subhour;
        sub.subjectid=subid;
        sub.subjectname=subname;
        add.City=city;
        add.Country=country;
        add.StreetNum=strnum;
    }
    
    public void PrintData()
    {
        System.out.println("student name:"+studentname+"student id :"+privatestudentid+"student gpa :"+studentgpa);
        System.out.println("subjecthours"+sub.subjecthours+"subjectid"+sub.subjectid+"subjectname"+sub.subjectname);
        System.out.println("City"+add.City+"Country"+add.Country+"StreetNum"+add.StreetNum);
        
    }
    
    
}
