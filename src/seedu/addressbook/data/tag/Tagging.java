package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents a Tagging in the address book.
 * Each tagging is an addition or removal of a Person's tag.
 */
public class Tagging {

    private static final String ADDED_SYMBOL = "+";
    private static final String REMOVED_SYMBOL = "-";

    public enum Status {
        ADD, REMOVE
    }

    private Person person;
    private Tag tag;
    private Status status;

    /**
     * Creates a tagging based on the tag being added/removed from a Person
     *
     */
    public Tagging(Person person, Tag tag, Status status) {
        this.person = person;
        this.tag = tag;
        this.status = status;
    }

    @Override
    public String toString() {
        String change = "";
        switch (status) {
            case ADD:
                change = ADDED_SYMBOL;
                break;
            case REMOVE:
                change = REMOVED_SYMBOL;
        }
        return change + " " + person.getName() + " [" + tag.toString() + "]";
    }

}
