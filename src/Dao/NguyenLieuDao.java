/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.NguyenLieu;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhamNgocMinh
 */
public class NguyenLieuDao implements Dao<NguyenLieu> {

    @Override
    public ArrayList<NguyenLieu> GetArrayListAll() {
        ArrayList<NguyenLieu> nguyenLieuList = new ArrayList<>();
        try {
            Connection conn = new Conn.ConnectionSQL().getConnection();
            String sql = "SELECT * FROM NguyenLieu";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String ten = rs.getString("TEN");
                BigDecimal dongia = rs.getBigDecimal("Dongia");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngayKetThuc = rs.getDate("NgayKetThuc");
                int soluong = rs.getInt("soluong");
                String dvt = rs.getString("DVT");
                String idLoai = rs.getString("IDLoai");
                NguyenLieu nguyenLieu = new NguyenLieu(id, ten, dongia,soluong, ngayTao, ngayKetThuc, dvt, idLoai);
                nguyenLieuList.add(nguyenLieu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguyenLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nguyenLieuList;
    }

    public  ArrayList<NguyenLieu>  checkSoLuongNguyenLieu(){
        ArrayList<NguyenLieu> nguyenLieuList = new ArrayList<>();
        try {
            Connection conn = new Conn.ConnectionSQL().getConnection();
            String sql = "SELECT * FROM NguyenLieu WHERE soluong <= 10";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                String id = rs.getString("ID");
                String ten = rs.getString("TEN");
                BigDecimal dongia = rs.getBigDecimal("Dongia");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngayKetThuc = rs.getDate("NgayKetThuc");
                int soluong = rs.getInt("SoLuong");
                String dvt = rs.getString("DVT");
                String idLoai = rs.getString("IDLoai");
                NguyenLieu nguyenLieu = new NguyenLieu(id, ten, dongia,soluong, ngayTao, ngayKetThuc, dvt, idLoai);
                System.out.println(nguyenLieu.getSoluong());
                nguyenLieuList.add(nguyenLieu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguyenLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nguyenLieuList;
    }
    
    @Override
    public int UpdateSQL(NguyenLieu ObObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int InsertSQL(NguyenLieu Object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NguyenLieu> GetArrayListoderByDESC(String kieusapxep, boolean tangGiam) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NguyenLieu getObjectById(String Id) {
         NguyenLieu nl = new NguyenLieu();
        try {
            Connection conn = new Conn.ConnectionSQL().getConnection();
            String sql = "SELECT * FROM NguyenLieu where id like '"+Id+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String ten = rs.getString("TEN");
                BigDecimal dongia = rs.getBigDecimal("Dongia");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngayKetThuc = rs.getDate("NgayKetThuc");
                int soluong = rs.getInt("soluong");
                String dvt = rs.getString("DVT");
                String idLoai = rs.getString("IDLoai");
                nl = new NguyenLieu(id, ten, dongia,soluong, ngayTao, ngayKetThuc, dvt, idLoai);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguyenLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nl;
    }

    @Override
    public int DeleteSQL(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
