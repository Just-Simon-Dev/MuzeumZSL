package com.muzeum.zsl.muzeumzsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetItemService {
    @Autowired private JdbcTemplate jdbcTemplate;
    public List<ItemEntity> getItem(String type_name){
        List<ItemEntity> itemRowMappers = jdbcTemplate.query("SELECT id, title, description, img_url, informations, item_name FROM items INNER JOIN types ON types.types_id = items.type WHERE item_name = '"+type_name+"'", new ItemRowMapper());
        return itemRowMappers;
    }
}
