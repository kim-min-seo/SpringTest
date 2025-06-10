package com.minse0.spring.test.ajax.repository;

import java.util.List;

import com.minse0.spring.test.ajax.domain.Favorite;

public interface FavoriteRepository {
	void insert(Favorite favorite);
    List<Favorite> selectAll();
}
