package com.minse0.spring.test.ajax;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.test.ajax.domain.Favorite;
import com.minse0.spring.test.ajax.repository.FavoriteRepository;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {

	 private final FavoriteRepository favoriteRepository;

	    public FavoriteController(FavoriteRepository favoriteRepository) {
	        this.favoriteRepository = favoriteRepository;
	    }

	   
	    @GetMapping("/page")
	    public String showFavoritePage() {
	        return "ajax/favorite";  // templates/favorite.html 렌더링
	    }

	    @PostMapping("/add")
	    @ResponseBody
	    public Map<String, Object> addFavorite(@RequestBody Favorite favorite) {
	        favoriteRepository.insert(favorite);
	        return Map.of("result", "success");
	    }

	    @GetMapping("/list")
	    @ResponseBody
	    public List<Favorite> getFavorites() {
	        return favoriteRepository.selectAll();
	    }

}
