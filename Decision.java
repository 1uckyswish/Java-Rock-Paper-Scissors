public class Decision {
    private String userValue;
    private String computerValue;

    public Decision(String input, String input2){
        this.userValue = input;
        this.computerValue = input2;
    }

    static void checkWinner(String user, String computer) {
    if (!user.equalsIgnoreCase("Paper") && !user.equalsIgnoreCase("Rock") && !user.equalsIgnoreCase("Scissors")) {
        System.out.println("Sorry, try again, and use one of the three options.");
    } else if (user.equalsIgnoreCase(computer)) {
        System.out.println("It's a tie!");
        System.out.println(user + " cannot beat " + computer);
    } else if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
               (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
               (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
        System.out.println("You win!");
        System.out.println(user + " beats " + computer);
    } else {
        System.out.println("Computer wins!");
        System.out.println(computer + " beats " + user);
    }
}



    public String getUserValue() {
        return this.userValue;
    }


    public String getComputerValue() {
        return this.computerValue;
    }

}
