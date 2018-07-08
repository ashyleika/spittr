package com.ashyleika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashyleika.data.Spittle;
import com.ashyleika.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittlesController {
	
	private static final String MAX_LONG_AS_STRING = "" + Long.MAX_VALUE;

	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittlesController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute("spittles", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
	public List<Spittle> spittles(
			@RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
			@RequestParam(value="count", defaultValue="20") int count
			) {
		return spittleRepository.findSpittles(max, count);
	}
	
	@RequestMapping(value="/{spittleId}")
	public String spittle(@PathVariable long spittleId, Model model) {
		model.addAttribute("spittle", spittleRepository.findOne(spittleId));
		return "spittle";
	}
}
