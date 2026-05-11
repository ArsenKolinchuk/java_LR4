public class Main {

    public static void main(String[] args) {

        Gym gym1 = new Gym("Power Gym", "Teatralna street.");
        gym1.showGym();

        // inner class
        Gym.Administrator admin1 =
                gym1.new Administrator(
                        "Anna Kovalenko",
                        "0988877665",
                        "admin@gmail.com"
                );

        admin1.manageGym();

        // static nested class
        Gym.Subscription subscription1 =
                new Gym.Subscription(
                        "Premium",
                        30
                );

        subscription1.showSubscription();

        // association
        Trainer trainer1 =
                new Trainer(
                        "Oleg Bondar",
                        "Fitness Trainer",
                        "0991122334",
                        "trainer@gmail.com"
                );

        Client client1 =
                new Client(
                        "Arsen Kolinchuk",
                        "male",
                        "0974455667",
                        "Ternopil",
                        "arsen@gmail.com"
                );

        trainer1.trainClient(client1);

        // local class
        class LockerRoom {

            void openLockerRoom() {

                System.out.println(
                        "Locker room is opened for clients."
                );
            }
        }

        LockerRoom room1 = new LockerRoom();
        room1.openLockerRoom();
    }
}