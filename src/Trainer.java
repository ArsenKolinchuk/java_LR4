public class Trainer {

    private String fullName;
    private String specialization;
    private String phoneNumber;
    private String email;

    public Trainer(
            String fullName,
            String specialization,
            String phoneNumber,
            String email
    ) {

        this.fullName = fullName;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void trainClient(Client client) {

        System.out.println(
                "Trainer "
                        + fullName
                        + " trains "
                        + client.getName()
        );
    }
}