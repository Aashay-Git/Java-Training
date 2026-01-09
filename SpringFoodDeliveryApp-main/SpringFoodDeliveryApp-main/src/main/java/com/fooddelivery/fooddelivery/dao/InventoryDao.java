package com.fooddelivery.fooddelivery.dao;

import com.fooddelivery.fooddelivery.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class InventoryDao {
    private JdbcTemplate jdbcTemplate;

    public InventoryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Inventory inventory){
        jdbcTemplate.update("INSERT INTO inventory VALUES(?,?,?)",
                inventory.getInid(),
                inventory.getInName(),
                inventory.getPrice()
        );
    }

    public  void update(Inventory inventory){
        jdbcTemplate.update("UPDATE table inventory SET (inName = ?, price = ?) WHERE inid = ?",
                inventory.getInName(),
                inventory.getPrice(),
                inventory.getInid()
        );
    }

    RowMapper<Inventory> inventoryRowMapper = (rs, rowNum) -> {
        Inventory i = new Inventory();
        i.setInid(rs.getInt("inid"));
        i.setInName(rs.getString("inName"));
        i.setPrice(rs.getInt("price"));
        return i;
    };

    public List<Inventory> findAll(){
        return jdbcTemplate.query("SELECT * FROM inventory", inventoryRowMapper);
    }
}