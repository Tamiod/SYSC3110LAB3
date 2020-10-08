import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addBook;

    public AddressBook(){
        addBook = new ArrayList<BuddyInfo>();

    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null){
            addBook.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < addBook.size()) {
            addBook.remove(index);
        }
        return null;
    }

    /*public BuddyInfo getBuddy(int i){
        return addBook.get(i);
    }*/

    //This is the main method
    public static void main(String[] args) {
        AddressBook addB = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("John");
        addB.addBuddy(buddy);
        //addB.getBuddy(0);
        addB.removeBuddy(0);
        //System.out.println("Hello "+addB.getBuddy(0));
        System.out.println("Address Book");

    }
}