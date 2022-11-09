public class PopulationOfChina {
    public static void main(String[] args) {

        System.out.println("Level1:");
        int numberOfCountries = 197;
        long populationOfChina = 1_411_778_724;
        System.out.println("Answer: " + numberOfCountries * populationOfChina);

        System.out.println("Level2:");
        long liveTimeSec = 3_011_456_567L;
        int numberOfDaysInYear = 365;
        int numberOfHourInDay = 24;
        int numberOfMinInHour = 60;
        int numberOfSekInMin = 60;
        long timeSecInYear = numberOfSekInMin * numberOfMinInHour * numberOfHourInDay * numberOfDaysInYear;
        System.out.println("Answer: " + liveTimeSec / timeSecInYear);

    }
}
