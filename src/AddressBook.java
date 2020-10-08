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

    public BuddyInfo removeBuddy(int index) {//remove buddy method
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
        addB.addBuddy(buddy); //adding buddy info
        //addB.getBuddy(0);
        addB.removeBuddy(0); ///removing buddy info
        //System.out.println("Hello "+addB.getBuddy(0));
        System.out.println("Address Book"); //Prints address book

    }
}
