public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d" );
        }
    }
}
