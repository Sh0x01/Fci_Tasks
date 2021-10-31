/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment1;

/**
 *
 * @author Shehab
 */
public class person
{
    public String name;
    public String address;
    public String phonenumber;
   public String emailaddress;
   
   public String tostring()
   {
       return "class name:"+this.getClass().getName() +"person name"+name;
   }   
}
