/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author info
 */
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    private ArrayList<Product> searchDirectory;
    public ProductDirectory(){
        productDirectory = new ArrayList<Product>();
        searchDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public Product addProduct(){
        Product newProduct = new Product();
        productDirectory.add(newProduct);
        return newProduct;
    }
    
    public void deleteProduct(Product product){
        productDirectory.remove(product);
    }
    
    public ArrayList<Product> searchProduct(String name){
       searchDirectory.removeAll(searchDirectory);
        for(Product prod : this.productDirectory){
            if(prod.getName().equalsIgnoreCase(name)){
                searchDirectory.add(prod);
//return prod;
            }
            
        }
        return searchDirectory;
    }
}
