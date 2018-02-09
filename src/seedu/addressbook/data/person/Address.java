package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must follow the format {Block, Street," +
                                                                " Unit Number, Postal Code)";
    public static final String ADDRESS_VALIDATION_REGEX = "\\d+, .+, .+, \\d+";
    private static final String ADDRESS_DELIMITER = ", ";
    private static final int BLOCK_INDEX = 0;
    private static final int STREET_INDEX = 1;
    private static final int UNIT_INDEX = 2;
    private static final int POSTALCODE_INDEX = 3;

    public final String value;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        createAddress(trimmedAddress);
        this.value = trimmedAddress;
    }

    /**
     * Splits the address into the 4 parts and initializes the objects
     * @param address argument supplied by user
     */
    private void createAddress(String address) {
        String[] addressValues = address.split(ADDRESS_DELIMITER);
        block = new Block(addressValues[BLOCK_INDEX]);
        street = new Street(addressValues[STREET_INDEX]);
        unit = new Unit(addressValues[UNIT_INDEX]);
        postalCode = new PostalCode(addressValues[POSTALCODE_INDEX]);
    }

    private Block getBlock() { return block; }

    private Street getStreet() { return street; }

    private Unit getUnit() { return unit; }

    private PostalCode getPostalCode() { return postalCode; }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address) other).getBlock())
                && this.street.equals(((Address) other).getStreet())
                && this.unit.equals(((Address) other).getUnit())
                && this.postalCode.equals(((Address) other).getPostalCode()));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
