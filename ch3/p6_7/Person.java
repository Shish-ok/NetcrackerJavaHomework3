package comm.netcracker.homework3.ch3.p6_7;

public class Person {
    private String name;
    private String friends;
    private int friendCount;

    public Person(String name) {
        this.name = name;
    }

    public void befriend (Person p) {
        if (friends != null) { friends = friends.concat(" " + p.name); }
        else { friends = p.name; }
        ++friendCount;
    }

    public void unfriend (Person p) {
        StringBuilder newFriends = new StringBuilder();
        for (String friend : friends.split(" ")) {
            if (!friend.equals(p.name)) { newFriends.append(" ".concat(friend)); }
            else { --friendCount; }
        }
        friends = newFriends.toString().replaceFirst(" ", "");
    }

    public int getFriendCount() { return friendCount; }
}
