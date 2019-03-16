package com.step.library;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<String> books = new HashSet<>(Arrays.asList("firstBook", "secondBook"));
		Reader ankon = new Reader("ankon");
		Reader chandan = new Reader("chandan");
		List<Reader> readers = new ArrayList<>(Arrays.asList(ankon, chandan));
		Library library = new Library(books, readers, "librarian");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to library.");
		while (true) {
			System.out.println("Enter Choice.");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
				case 1:
					System.out.println("Book name to remove");
					String readerName = scanner.nextLine();
					boolean wasSuccessfull = library.removeBook("java", "librarian");
					System.out.println(wasSuccessfull ? "Added Successfully" : "doesnt have");
					break;

				case 2:
					System.out.println("Book Name to insert");
					String bookname = scanner.nextLine();
					wasSuccessfull = library.addBook("java", "librarian");
					System.out.println(wasSuccessfull ? "Added Successfully" : "Already Exist");
					break;

				case 3:
					System.out.println("Showing Library details");
					System.out.println(library);
					break;

				default:
					System.out.println("Quitting Library");
					System.exit(0);
			}
		}
	}
}
