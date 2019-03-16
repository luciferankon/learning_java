package com.step.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LibraryTest {
	Library library;
	Reader ankon;
	Reader chandan;

	@BeforeEach
	void setUp() {
		Set<String> books = new HashSet<>(Arrays.asList("firstBook", "secondBook"));
		ankon = new Reader("ankon");
		chandan = new Reader("chandan");
		List<Reader> readers = new ArrayList<>(Arrays.asList(ankon, chandan));
		library = new Library(books, readers, "librarian");
	}

	@Test
	void searchBookShouldGiveMeTrueIfTheBookIsInTheLibrary() {
		assertEquals("firstBook", library.searchBook("firstBook"));
	}

	@Test
	void searchBookShouldGiveMeFalseIfTheBookIsNotInTheLibrary() {
		assertEquals(null, library.searchBook("thirdBook"));
	}

	@Test
	void shouldAddTheReaderToTheRegisterIfAlreadyIsNotThere() {
		library.borrowBook("secondBook", ankon);
		Map<Reader, List<String>> register = library.getRegister();
		assertEquals(true, register.containsKey(ankon));
	}

	@Test
	void shouldGiveTheBookToTheReader() {
		library.borrowBook("secondBook", ankon);
		List<String> books = ankon.getBooks();
		assertEquals(true, books.contains("secondBook"));
	}

	@Test
	void shouldAddTheBookToTheReaderKeyIfHeIsAlreadyThere() {
		library.borrowBook("firstBook", ankon);
		Map<Reader, List<String>> register = library.getRegister();
		assertEquals(register.get(ankon), Arrays.asList("firstBook"));
	}

	@Test
	void shouldGiveMeTheBorrowedBooks() {
		library.borrowBook("firstBook", ankon);
		assertEquals(new ArrayList<>(Arrays.asList("firstBook")), library.getBorrowedBooks(ankon));
	}

	@Test
	void shouldGiveFalseIfIAlreadyHaveNotBorrowedTheBook() {
		assertEquals(library.hasAlreadyBorrowed("firstBook", chandan), false);
	}

	@Test
	void shouldGiveTrueIfIAlreadyHasBorrowedTheBook() {
		library.borrowBook("firstBook", ankon);
		assertEquals(library.hasAlreadyBorrowed("firstBook", ankon), true);
	}

	@Test
	void shouldNotAddTheBookInTheLibraryIfTheReaderDoesNotHaveThat() {
		library.returnBook("firstBook", ankon);
		Set<String> libraryBooks = library.getBooks();
		assertEquals(Set.of("firstBook", "secondBook"), libraryBooks);
	}

	@Test
	void shouldAddTheBookInTheLibraryIfTheReaderHasThat() {
		library.borrowBook("firstBook", ankon);
		library.returnBook("firstBook", ankon);
		Set<String> libraryBooks = library.getBooks();
		assertEquals(Set.of("firstBook", "secondBook"), libraryBooks);
	}

	@Test
	void shouldAddTheBookIfThatIsNotThere() {
		assertEquals("added successfully", library.addBook("thirdBook", "librarian"));
	}

	@Test
	void shouldNotAddTheBookIfThatIsAlreadyThere() {
		assertEquals("Book is already there", library.addBook("secondBook", "librarian"));
	}

	@Test
	void shouldNotRemoveIfTheBookIsNotThere() {
		assertEquals("Book is not available", library.removeBook("thirdBook", "librarian"));
	}

	@Test
	void shouldRemoveTheBookIfTheBookIsThere() {
		assertEquals("removed successfully ", library.removeBook("secondBook", "librarian"));
	}

	@Test
	void shouldGiveMeTheReaderWhoHasBorrowedTheBook() {
		library.borrowBook("firstBook",ankon);
		assertEquals(ankon,library.getReader("firstBook"));
	}

	@Test
	void shouldGiveMeTheBooksBorrowedByReader() {
		library.borrowBook("firstBook",ankon);
		library.borrowBook("secondBook",ankon);
		assertEquals(List.of("firstBook","secondBook"),library.getReaderBooks(ankon));
	}

	@Test
	void shouldGiveMeTrueIfTheBookWasThereInTheLibrary() {
		library.removeBook("firstBook","librarian");
		assertEquals(true,library.wasRemoved("firstBook"));
	}
}