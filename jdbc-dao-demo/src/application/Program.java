/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author lucas
 */
public class Program {
    public static void main(String[] args) {
        SellerDao sllerDao = DaoFactory.createSellerDao();
        Seller seller = sllerDao.findById(3);
        System.out.println(seller);
    }
}