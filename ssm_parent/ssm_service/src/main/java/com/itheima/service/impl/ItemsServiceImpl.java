package com.itheima.service.impl;

import com.itheima.dao.ItemDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Davis
 * @date 2019/4/14 13:38
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemDao itemDao;

    public Items findById(Integer id) {
        return itemDao.findById(id);
    }
}
