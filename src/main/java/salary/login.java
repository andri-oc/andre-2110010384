/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package salary;


public class login {

    private String username;
    private String password;
    private String nama;
    
    
    login (String username, String password, String nama) {
        this.username = username;
        this.password = password;
        this.nama = nama;
    }
    
    
    public login(){}
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
}
