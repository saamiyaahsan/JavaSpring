package com.iiht.training.elibrary.exception;

import static com.iiht.training.elibrary.testutils.TestUtils.currentTest;
import static com.iiht.training.elibrary.testutils.TestUtils.exceptionTestFile;
import static com.iiht.training.elibrary.testutils.TestUtils.testReport;
import static com.iiht.training.elibrary.testutils.TestUtils.yakshaAssert;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.iiht.training.elibrary.inventory.BookInventory;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.testutils.MasterData;

class BookIssueExceptionTest {

	static BookInventory inventory;

	@BeforeAll
	public static void setUp() {
		inventory = new BookInventory();
		inventory.books = MasterData.getBookList();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test()
	public void testBookIssueBookAlreadyIssuedException() throws IOException {
		Book book = MasterData.getBookData();
		BookAlreadyIssuedException exception = Assertions.assertThrows(BookAlreadyIssuedException.class, () -> {
			inventory.issueBook(book.getIsbn(), "Rohit");
		});
		String message = "The Book is already Issued";
		yakshaAssert(currentTest(), message.contentEquals(exception.getMessage()) ? true : false, exceptionTestFile);
	}

	@Test()
	public void testBookIssueISBNDoesNotExistsException() throws IOException {
		Book book = MasterData.getBookData();
		book.setIsbn("1111111111");
		ISBNDoesNotExistsException exception = Assertions.assertThrows(ISBNDoesNotExistsException.class, () -> {
			inventory.issueBook(book.getIsbn(), "Rohit");
		});
		String message = "ISBN " + book.getIsbn() + " does not exists";
		yakshaAssert(currentTest(), message.contentEquals(exception.getMessage()) ? true : false, exceptionTestFile);
	}

}
