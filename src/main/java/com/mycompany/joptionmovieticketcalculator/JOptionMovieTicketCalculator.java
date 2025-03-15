/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.JOptionMovieTicketCalculator ;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class JOptionMovieTicketCalculator {

    public static void main(String[] args) {
       String Input01 = JOptionPane.showInputDialog(null, "How Old Are You? ") ;
      
      int age = Integer.parseInt(Input01) ;
        if (age <=5 {
        JOptionPane.showMessageDialog(null, "Your ticket is free") ;
        }
            
     else if (age <=12) {
      JOptionPane.showMessageDialog(null, "The Ticket will cost: R5") ;
         
      } else if  (age <60) {
              JOptionPane.showMessageDialog (null, "The Ticket will cost: R10") ;
         
      } else if (age >=60) {
      JOptionPane.showMessageDialog(null, "The Ticket will cost: R7 ");
              }
    }
}
