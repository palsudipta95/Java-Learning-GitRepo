public class Switch {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {
            case "Sunday":
                System.out.println("It's workday");
                break;
            case "Monday":
                System.out.println("It's workday");
                break;
            case "Tuesday":
                System.out.println("It's workday");
                break;
            case "Wednesday":
                System.out.println("It's workday");
                break;
            case "Thursday":
                System.out.println("It's workday");
                break;
            case "Friday":
                System.out.println("It's Weekend");
                break;
            case "Saturday":
                System.out.println("It's Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
