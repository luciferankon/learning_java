package com.step.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReaderTest {
	Reader ankon;

	@BeforeEach
	void setUp() {
		ankon = new Reader("ankon");
	}

	@Test
	void shouldAddTheBookToReaderIfAlreadyDoesnotHaveThat() {
		ankon.borrowBook("firstBook");
		List<String> booksOfAnkon = ankon.getBooks();
		assertEquals(true, booksOfAnkon.contains("firstBook"));
	}

	@Test
	void shouldGiveMeFalseIfTheReaderDoesnotHaveTheBook() {
		assertEquals(false, ankon.hasBook("firstBook"));
	}

	@Test
	void shouldGiveMeTrueIfTheReaderHasTheBook() {
		ankon.borrowBook("firstBook");
		assertEquals(true, ankon.hasBook("firstBook"));
	}

	@Test
	void shouldGiveMeNullIfTheReaderDoesnotHaveTheBook() {
		assertEquals(null,ankon.returnBook("firstBook"));
	}

	@Test
	void shouldGiveMeTheBookIfTheReaderAlreadyHaveTheBook() {
		ankon.borrowBook("firstBook");
		assertEquals("firstBook",ankon.returnBook("firstBook"));
	}
}