package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_GOODBYE;
import static seedu.addressbook.common.Messages.MESSAGE_INIT_FAILED;
import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_USING_STORAGE_FILE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

import java.util.*;
import seedu.addressbook.commands.*;

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;


	public String userCommand() {
		// TODO Auto-generated method stub
		return LINE_PREFIX + "Enter command: ";
	}


	public String[] welcomeMessage(String version, String storageFilePath) {
		// TODO Auto-generated method stub
        String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
        return new String[] {
                DIVIDER,
                DIVIDER,
                MESSAGE_WELCOME,
                version,
                MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
                storageFileInfo,
                DIVIDER};
	}


	public String[] goodByeMessage() {
		// TODO Auto-generated method stub
		return new String[] {MESSAGE_GOODBYE, DIVIDER, DIVIDER};
	}


	public String[] messageInitFailed() {
		// TODO Auto-generated method stub
        return new String[] {MESSAGE_INIT_FAILED, DIVIDER, DIVIDER};
	}


	public String userMessage(String m) {
		// TODO Auto-generated method stub
        return LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);
	}


	public String[] resultMessage(CommandResult result) {
		// TODO Auto-generated method stub
        return new String[] {result.feedbackToUser, DIVIDER};
	}




    /** Formats a list of strings as a viewable indexed list. */
    public String indexedList(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(indexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    public String indexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
	}

	
}
