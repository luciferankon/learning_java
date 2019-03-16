package com.step.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader {
	private String name;
	private List<String> books;

	public Reader(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}

	public void borrowBook(String book) {
		if (!this.hasBook(book)) this.books.add(book);
	}

	public boolean hasBook(String book) {
		return this.books.contains(book);
	}

	public List<String> getBooks() {
		return Collections.unmodifiableList(this.books);
	}

	public String returnBook(String book){
		if(this.books.contains(book)){
			return book;
		}
		return null;
	}
}
