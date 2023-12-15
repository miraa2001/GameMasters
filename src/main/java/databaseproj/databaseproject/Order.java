/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseproj.databaseproject;

/**
 *
 * @author miraj
 */
public class Order implements Comparable<Order>{
    int productid;
    int quantity;
    public Order()
    {
        productid=1;
        quantity=0;
    }
    public void setIDQ(int id,int Q){
    productid=id;
    quantity=Q;
    }
    public int getpid(){
        return productid;
    }
    public int getq(){
        return quantity;
    }
    @Override
    public String toString()
    {
        return ""+productid+"\t"+quantity+"\t";
    }
    
    @Override public int compareTo(Order o)
    {
        int id
            = ((Order)o).getpid();
  
        //  For Ascending order
        return this.productid - id;
  
        // For Descending order do like this
        // return compareage-this.studentage;
    }
    
}
