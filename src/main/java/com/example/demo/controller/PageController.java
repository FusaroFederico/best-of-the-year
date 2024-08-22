package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Movie;
import com.example.demo.model.Song;

@Controller
@RequestMapping("/")
public class PageController {
	
	@GetMapping("/")
	public String greeting(@RequestParam(name = "name") String name, Model model) {
		model.addAttribute("name", name);
		return "homepage";
	}
	
	@GetMapping("/movies")
	public String movieTitles(Model model) {
		model.addAttribute("title", "Best Movies");
		String bestMovies = "";
		
		for ( Movie movie : getBestMovies()) {
			bestMovies += movie.getTitle() + " - ";
		}
		model.addAttribute("list", bestMovies);
		return "titles";
	}
	
	@GetMapping("/songs")
	public String songTitles(Model model) {
		model.addAttribute("title", "Best Songs");
		
		String bestSongs = "";
		
		for ( Song song : getBestSongs()) {
			bestSongs += song.getTitle() + " - ";
		}
		
		model.addAttribute("list", bestSongs);
		return "titles";
	}
	
	private List<Movie> getBestMovies(){
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(0, "Il Signore Degli Anelli"));
		movies.add(new Movie(1, "The Matrix"));
		movies.add(new Movie(2, "Star Wars: L'Impero Colpisce Ancora"));
		movies.add(new Movie(3, "Il Re Leone"));
		movies.add(new Movie(4, "The Truman Show"));
		return movies;
	}
	
	private List<Song> getBestSongs(){
		List<Song> songs = new ArrayList<Song>();
		songs.add(new Song(0, "Imagine"));
		songs.add(new Song(1, "Hey Jude"));
		songs.add(new Song(2, "Billie Jean"));
		songs.add(new Song(3, "Bohemian Rhapsody"));
		songs.add(new Song(4, "Heroes"));
		return songs;
	}
}
