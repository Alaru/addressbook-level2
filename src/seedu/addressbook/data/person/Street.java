package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book.
 */
public class Street {

    private final String value;

    /**
     * Creates a Street object that represents the street in an Address
     */
    public Street(String street) {
        String trimmedStreet = street.trim();
        this.value = trimmedStreet;
    }

    public String getStreet() { return value; }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
