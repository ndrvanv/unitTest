package seminar5.task2;

public class User {
    private int userId;
    private String firstName;
    private String lastName;

// Конструктор, геттеры и сеттеры


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(int userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private User createFakeUser() {
        User user = new User(1, "John", "Doe");
        return user;
    }
}
