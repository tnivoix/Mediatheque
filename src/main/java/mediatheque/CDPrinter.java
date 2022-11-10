/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author tnivoix
 */
public class CDPrinter implements ItemVisitor {
    
    @Override
    public void visit(CD i){
        System.out.println(i.toString());
    }
    
    @Override
    public void visit(Book i){
        
    }
}
