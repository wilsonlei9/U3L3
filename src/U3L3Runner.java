import java.util.Scanner;
    public class U3L3Runner {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
            String command = scan.nextLine();

            if (command.equals("n"))
            {
                System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
                System.out.println("Do you want to continue?");
                String choice = scan.nextLine();
                /* add nested if statements for possible next actions! */
                if (choice.equals("yes"))
                {
                    System.out.println("It was just monkeys.");
                }
            }

            // Add else-ifs for s, e, and an else for any other input. Be creative!
            else if (command.equals("s"))
            {
                System.out.println("You enter the beach, with the sea in front of you.\nThere appears to be something in the water.\nDo you want to continue?");
                String choice = scan.nextLine();
                if (choice.equals("yes"))
                {
                    System.out.println("It is a giant shark!");
                }

                }
            else if (command.equals("e"))
            {
                System.out.println("You see a beach shack.\nDo you want to enter?");
                String choice = scan.nextLine();
                if (choice.equals("yes"))
                {
                    System.out.println("You enter and order a refreshing drink.");
                }

            }

            System.out.println("End of adventure!");
        }
    }


