package com.step.library;

import java.util.*;

public class Library {
	List<Reader> readers;
	private Set<String> books;
	private Map<Reader, List<String>> register;
	private Map<String, Reader> borrowedBooks;
	private String librarian;
	private Set<String> removedBooks;

	public Library(Set<String> books, List<Reader> readers, String librarian) {
		this.books = books;
		this.readers = readers;
		this.register = new HashMap<>();
		this.borrowedBooks = new HashMap<>();
		this.librarian = librarian;
		this.removedBooks = new HashSet<>();
	}

	public String searchBook(String book) {
		if (this.books.contains(book)) {
			return book;
		}
		return null;
	}

	public void borrowBook(String book, Reader reader) {
		if (borrowedBooks.containsKey(book)) return;
		reader.borrowBook(book);
		borrowedBooks.put(book, reader);
		List<String> borrowedBooks = register.getOrDefault(reader, new ArrayList<>());
		borrowedBooks.add(book);
		register.put(reader, borrowedBooks);
	}

	public List<String> getBorrowedBooks(Reader reader) {
		return register.get(reader);
	}

	Map<Reader, List<String>> getRegister() {
		return Collections.unmodifiableMap(register);
	}

	public boolean hasAlreadyBorrowed(String book, Reader reader) {
		return reader.hasBook(book);
	}

	public void returnBook(String book, Reader reader) {
		String returnedBook = reader.returnBook(book);
		if (returnedBook != null) {
			this.borrowedBooks.remove(returnedBook);
			this.register.get(reader).remove(returnedBook);
		}
	}

	public Set<String> getBooks() {
		return Collections.unmodifiableSet(this.books);
	}

	public boolean addBook(String book, String librarian) {
		if (this.librarian.equals(librarian)) {
			boolean isAdded = this.books.add(book);
			if (isAdded) this.removedBooks.remove(book);
			return isAdded;
		}
		return false;
	}


	public boolean removeBook(String book, String librarian) {
		if (this.librarian.equals(librarian)) {
			boolean isRemoved = this.books.remove(book);
			if (isRemoved) this.removedBooks.add(book);
			return isRemoved;
		}
		return false;
	}

	public Reader getReader(String book) {
		return borrowedBooks.get(book);
	}

	public List<String> getReaderBooks(Reader reader) {
		return register.get(reader);
	}

	public boolean wasRemoved(String book) {
		return this.removedBooks.contains(book);
	}
}