package com.example.demo.model;

public class Movie {
		// instance variables
		private Integer id;
		private String title;
		
		// constructor
		public Movie(Integer id, String title) {
			this.id = id;
			this.title = title;
		}
		
		// getters and setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
}
