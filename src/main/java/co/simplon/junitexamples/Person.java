package co.simplon.junitexamples;
/**
 * Class represent a person
 * <p>
 * class contract clauses (class invariants)
 * <ul>
 * <li>Firstname is never {@code null} and garanties the original case
 * <li>Lastname is never {@code null} and invariant, once assigned never changes
 * and garanties the original case
 * </ul>
 * Preconditions are documented at constructor and methods level
 */
public class Person {

	private final String firstName;
	private final String lastName;
	
	/**
	 * Construct a new person with given arguments
	 * <p>
	 * The newly created person is ensured to have any modifiable last name
	 * 
	 * @param firstName a first name, not {@code null}
	 * @param lastName a last name, not {@code null}
	 * 
	 *  @throws IllegalArgumentException if any of the arguments is {@code null}
	 */
	public Person(String firstName, String lastName) {
		if(firstName ==null || lastName == null) {
			throw new IllegalArgumentException();
		}
		this.firstName =firstName;
		this.lastName = lastName;
		// post conditions
	}
	/**
	 * Returns the person firstname.
	 * @return the person first name, may be {@code null}
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Returns the person  lastname.
	 * 
	 * @return the person last name, never {@code null}
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Returns the person full name
	 * <p>
	 * The result is the concatenation of the firstname, a white space character and 
	 *  and the lastname
	 * @return the person full name, never {@code null}
	 */
	public String getFullName() {
	 return firstName + " " + lastName;
	}
	
	/**
	 * 
	 */
	@Override
    public String toString() {
        return firstName + " " + lastName ;
    }
}


