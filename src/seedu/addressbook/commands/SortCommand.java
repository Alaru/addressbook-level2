package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

/**
 * Sorts and displays all Persons in the address book to the user.
 */
public class SortCommand extends seedu.addressbook.commands.Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book in ascending order and displays them.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public seedu.addressbook.commands.CommandResult execute() {
        List<ReadOnlyPerson> allSortPersons = addressBook.getAllPersons().sortedPersonView();
        return new CommandResult(getMessageForPersonListShownSummary(allSortPersons), allSortPersons);
    }
}
