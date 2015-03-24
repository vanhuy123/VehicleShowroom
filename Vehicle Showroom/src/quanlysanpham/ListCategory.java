/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class ListCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<Category> listCate = new ArrayList<Category>();

    public Category findCateById(String id) {

        for (Category cate : listCate) {

            if (cate.getCateId().equalsIgnoreCase(id)) {
                return cate;
            }

        }

        return null;

    }

    public void addCate(Category cate) {

        Category cateFind = findCateById(cate.getCateId());

        if (cateFind != null) {
            cateFind = cate;
        } else {
            listCate.add(cate);
        }

    }

    public void removeCateById(String id) {

        Category cateFind = findCateById(id);

        if (cateFind != null) {
            listCate.remove(cateFind);
        }

    }

    public ArrayList<Category> getList() {

        return listCate;

    }
}
