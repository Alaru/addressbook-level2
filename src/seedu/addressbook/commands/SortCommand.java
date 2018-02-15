package seedu.addressbook.commands;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends seedu.addressbook.commands.Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list with index numbers.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public seedu.addressbook.commands.CommandResult execute() {
        java.util.List<seedu.addressbook.data.person.ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new seedu.addressbook.commands.CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
