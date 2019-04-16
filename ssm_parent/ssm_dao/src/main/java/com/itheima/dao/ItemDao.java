package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * @author Davis
 * @date 2019/4/14 13:15
 */
public interface ItemDao {
    public Items findById(Integer id);
}
