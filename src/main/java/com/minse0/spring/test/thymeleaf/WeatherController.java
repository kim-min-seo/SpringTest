package com.minse0.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minse0.spring.test.thymeleaf.domain.Weather;
import com.minse0.spring.test.thymeleaf.service.WeatherService;

@Controller
@RequestMapping("/thymeleaf/weather")
public class WeatherController {

   @Autowired
   private WeatherService weatherService;
   

    @GetMapping("/input")
    public String weatherInput() {
        return "thymeleaf/weather/input";
    }

    @PostMapping("/input")
    public String postInput(Weather weather) {
        weatherService.addWeather(weather);
    	return "redirect:/thymeleaf/weather/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {
    	List<Weather> weatherList = weatherService.getWeaterHistory();
        model.addAttribute("weatherList", weatherList);
        return "thymeleaf/weather/list";
    }
}
