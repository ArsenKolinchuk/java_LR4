public class Gym {

    private String name;
    private String address;

    public Gym(String name, String address) {

        this.name = name;
        this.address = address;
    }

    public void showGym() {

        System.out.println("Gym: " + name);
        System.out.println("Address: " + address);
    }

    // static nested class
    static class Subscription {

        private String type;
        private int days;

        public Subscription(String type, int days) {

            this.type = type;
            this.days = days;
        }

        void showSubscription() {

            System.out.println(
                    "Subscription: "
                            + type
                            + ", Days: "
                            + days
            );
        }
    }

    // inner class
    class Administrator {

        private String fullName;
        private String phoneNumber;
        private String email;

        Administrator(
                String fullName,
                String phoneNumber,
                String email
        ) {

            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        void manageGym() {

            System.out.println(
                    fullName + " manages the gym."
            );
        }
    }
}