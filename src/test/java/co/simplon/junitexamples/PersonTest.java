package co.simplon.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Test for person class")
class PersonTest {
	
	@Test
	@DisplayName("Test for constructor exception")
	 void shouldConstructorThrowsIllegalArgumentExceptionWithNullParams() {
		// (event) => {console.log}
		 assertThrows(IllegalArgumentException.class, () -> new Person(null, null));
	 }
	
	@Test
	 void shouldConstructorReturnsWithNonNullParams() {
		 Person actual = new Person("Super", "Snippet");
		 assertNotNull(actual);
	 }
	
	@Test
	void shouldGetFirstNameReturnsSameAsInit() {
		Person person = new Person("Super", "Snippet");
		String actual = person.getFirstName();
		assertEquals("Super", actual);
	}
	
	@Test
	void shouldGetFirstNameReturnsNotSameAsInit() {
		Person person = new Person("super", "Snippet");
		String actual = person.getFirstName();
		assertNotEquals("SUPER", actual);
	}
	
	@Test
	void shouldGetLastNameReturnsSameAsInit() {
		Person person = new Person("Super", "Snippet");
		String actual = person.getLastName();
		assertEquals("Snippet", actual);
	}
	
	@Test
	void shouldGetLastNameReturnsNotSameAsInit() {
		Person person = new Person("Super", "snippet");
		String actual = person.getLastName();
		assertNotEquals("Snippet", actual);
	}
	
	@Test
	void shouldGetFullNameReturnsSameAsInit() {
		Person person = new Person("Super", "Snippet");
		String actual = person.getFullName();
		assertEquals("Super Snippet", actual);
	}
	
	@Test
	void shouldGetFullNameReturnsNotSameAsInit() {
		Person person = new Person("super", "snippet");
		String actual = person.getFullName();
		assertNotEquals("Super Snippet", actual);
	}
	
	@Test
	void shouldReturnToStringAsInit() {
		Person person = new Person("Super", "Snippet");
		String actual = person.toString();
		assertEquals("Super Snippet", actual);
	}
	@Test
	void shouldToStringReturnsNotNull() {
		Person person = new Person("Super", "Snippet");
		String actual = person.toString();
		assertNotNull(actual);
		//Verify invariants after each test (method invoked an object under test)
		boolean checked = checkInvariants(person , "Super", "Snippet");
		assertTrue(checked, "invariant violation");
	}
	
	private static boolean checkInvariants(Person person, String initialFirstName, String initialLastName) {
		boolean result = false;
		
		return person.getFirstName().equals(initialFirstName)
				&& person.getLastName().equals(initialLastName) 
				&& person.getFullName().equals(initialFirstName + " "+ initialLastName);
	}
	
}
