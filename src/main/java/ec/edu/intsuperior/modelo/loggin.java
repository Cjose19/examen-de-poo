/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author MEGAPC
 */
public class loggin {

    private String use ;
    private String password;

    public loggin() {
    }

    public loggin(String use, String password) {
        this.use = use;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getPassword() {
        return password;
    }

    public String getUse() {
        return use;
    }
    
   
    
}
