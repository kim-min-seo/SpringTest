package com.minse0.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.minse0.spring.test.ajax.domain.Favorite;
import com.minse0.spring.test.ajax.repository.FavoriteRepository;

@Service
public class FavoriteSerive implements FavoriteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Favorite favorite) {
        String sql = "INSERT INTO favorite (name, url) VALUES (?, ?)";
        jdbcTemplate.update(sql, favorite.getName(), favorite.getUrl());
    }

    @Override
    public List<Favorite> selectAll() {
        String sql = "SELECT id, name, url FROM favorite";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Favorite fav = new Favorite();
            fav.setId(rs.getInt("id"));
            fav.setName(rs.getString("name"));
            fav.setUrl(rs.getString("url"));
            return fav;
        });
    }
}
