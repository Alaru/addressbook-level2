package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address book.
 */
public class Block {

    private final String value;

    /**
     * Creates a Block object that represents the block number in an Address
     */
    public Block(String block) {
        String trimmedBlock = block.trim();
        this.value = trimmedBlock;
    }

    public String getBlock() { return value; }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
