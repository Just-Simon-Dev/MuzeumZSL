package com.muzeum.zsl.muzeumzsl;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<ItemEntity> {
    @Override
    public ItemEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setId(rs.getInt("id"));
        itemEntity.setDescription(rs.getString("description"));
        itemEntity.setImg_url(rs.getString("img_url"));
        itemEntity.setInformations(rs.getString("informations"));
        itemEntity.setTitle(rs.getString("title"));
        itemEntity.setType(rs.getString("item_name"));

        return itemEntity;
    }
}
