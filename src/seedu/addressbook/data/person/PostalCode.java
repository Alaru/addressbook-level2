package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book.
 */
public class PostalCode {

    private final String value;

    /**
     * Initialises a PostalCode object that represents the postal code in an Address
     */
    public PostalCode(String postalCode) {
        String trimmedPostalCode = postalCode.trim();
        this.value = trimmedPostalCode;
    }

    public String getPostalCode() { return value; }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
