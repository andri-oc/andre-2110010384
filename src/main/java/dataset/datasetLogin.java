/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dataset;
import java.util.ArrayList;

import java.util.ArrayList;

public class datasetLogin {
//    usernname, password, nama

    private ArrayList<String> username;
    private ArrayList<String> passowrd;
    private ArrayList<String> nama;

    public datasetLogin() {
        username = new ArrayList<String>();
        passowrd = new ArrayList<String>();
        nama = new ArrayList<String>();
    }

//    Username
    public void insertUsername(String isi) {
        this.username.add(isi);
    }

    public ArrayList<String> getRecordUsername() {
        return this.username;
    }

//    PASSWORD
    public void insertPassword(String isi) {
        this.passowrd.add(isi);
    }

    public ArrayList<String> getRecordPassword() {
        return this.passowrd;
    }

//    Nama
    public void insertNama(String isi) {
        this.nama.add(isi);
    }

    public ArrayList<String> getRecordNama() {
        return this.nama;
    }
    
    public void insertLogin (String username, String password, String nama) {
        this.username.add(nama);
        this.passowrd.add(password);
        this.nama.add(nama);
    }

}

