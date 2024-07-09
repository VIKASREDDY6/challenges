package solutions.challenge1;

/*
Question:
Two new databases (MongoDB and MariaDB) need to be added.
How would you code it so that the user can select which one to use?

Hints:
Which design patterns can be used?
*/
public class Main {

    public static void main(String[] args) {
        MySQL mySQL = new MySQL();
        LoadDataBase.connect(mySQL);
    }
}