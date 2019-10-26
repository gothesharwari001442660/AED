/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

/**
 *
 * @author sharw
 */
public class Mainclass {
    
    
   // Product product;
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product product= new Product();
        
        //Supplier supplier =new Supplier();
        
        Scanner sc=new Scanner(System.in);
         
        try{
        System.out.println("Please enter name ");
        String name = sc.nextLine();
        //System.out.println("Name :" +name);
        product.setName(name);
        
         
        System.out.println("\nPlease enter price ");
          
        int price=sc.nextInt();
        product.setPrice(price);
           
        
        System.out.println("\nPlease enter availability number");
        int availno=sc.nextInt();
        product.setAvailNum(availno);
        
        System.out.println("\nPlease enter Description");
        sc.nextLine(); 
        String description=sc.nextLine();
        product.setDescription(description);
        
        System.out.println("\nPlease enter Supplier name");
        //sc.nextLine();
        String suppname=sc.nextLine();
        product.getSupplier().setSupplierName(suppname);
        
        System.out.println("\nPlease enter Supplier address");
        //sc.nextLine();
        String suppadd=sc.nextLine();
        product.getSupplier().setSupplierAddress(suppadd);
           
        display(product);
        
       
        int option;
        do{
        System.out.println("\nDO YOU WISH TO UPDATE ANY OF THESE ATTRIBUTES\n1. NAME\n2. PRICE\n3. AVAILABILITY NUMBER\n4. DESCRIPTION\n5. SUPPLIER NAME\n6. SUPPLIER ADDRESS\n7. VIEW DATA \n8. EXIT");
        option=sc.nextInt();
        
        sc.nextLine();
       
        switch(option){
        
            case 1:
                  
              System.out.println("\nPlease update name- ");
              String name1 = sc.nextLine();
                product.setName(name1);
                break;
                
            case 2:
                System.out.println("\nPlease enter price- ");
                int price1=sc.nextInt();
                product.setPrice(price1);
                break;
        
            case 3:
                System.out.println("\nPlease enter availability number-");
                int availno1=sc.nextInt();
                product.setAvailNum(availno1);
                break;
                
            case 4:
                System.out.println("\nPlease enter Description-");
                //sc.nextLine();
                String description1=sc.nextLine();
                product.setDescription(description1);
                break;
        
            case 5:
                System.out.println("\nPlease enter Supplier name-");
                //sc.nextLine();
                String suppname1=sc.nextLine();
                product.getSupplier().setSupplierName(suppname1);
                break;
        
            case 6:
                System.out.println("\nPlease enter Supplier address-");
                //sc.nextLine();
                String suppadd1=sc.nextLine();
                product.getSupplier().setSupplierAddress(suppadd1);
                break;
                
            case 7:
                System.out.println("\nFollowing are the details:-\n");
                display(product);
                break;
                
        }    
        }while(option!=8); 
        }
        catch(Exception e)
        {
        System.out.println("Please Enter Correct Data");
        }
        
    }
    public static void display(Product product){
   
        //Product product;
       
        System.out.println("\nName: "+product.getName());
        System.out.println("\nPrice: "+product.getPrice());
        System.out.println("\nAvailable number: "+product.getAvailNum());
        System.out.println("\nDescription: "+product.getDescription());
        System.out.println("\nSupplier Name: "+product.getSupplier().getSupplierName());
        System.out.println("\nSupplier Address: "+product.getSupplier().getSupplierAddress());
        
       
   }
}
