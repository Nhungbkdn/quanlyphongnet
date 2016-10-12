/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bo;

import java.util.ArrayList;
import model.bean.PhienNguoiDung;
import model.dao.PhienNguoiDungDAO;

/**
 *
 * @author vuongluis
 */
public class PhienNguoiDungBO {

    public ArrayList<PhienNguoiDung> getList() {
        return new PhienNguoiDungDAO().getList();
    }

    public int addItem(PhienNguoiDung obj) {
        return new PhienNguoiDungDAO().addItem(obj);
    }

    public int delItem(int id) {
        return new PhienNguoiDungDAO().delItem(id);
    }

    public int editItem(PhienNguoiDung obj) {
        return new PhienNguoiDungDAO().editItem(obj);
    }
    
}
