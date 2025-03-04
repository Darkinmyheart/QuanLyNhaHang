/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author PhamNgocMinh
 */
public class TaiKhoan implements Serializable {

    private int id;
    private String idNhanVien;
    private String username;
    private String passwords;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String idNhanVien, String username, String passwords) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.username = username;
        this.passwords = passwords;
    }

    public TaiKhoan(String idNhanVien, String username, String passwords) {
        this.idNhanVien = idNhanVien;
        this.username = username;
        this.passwords = passwords;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
}
