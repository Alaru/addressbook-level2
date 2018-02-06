package seedu.addressbook.data.person;

/**
 * Represents a Person's unit number in the address book.
 */
public class Unit {

    private final String value;

    /**
     * Creates a Unit object that represents the unit number in an Address
     */
    public Unit(String unit) {
        String trimmedUnit = unit.trim();
        this.value = trimmedUnit;
    }

    public String getUnit() { return value; }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
