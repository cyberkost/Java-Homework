package enumExample;

public class Day {

    public static void main(String[] args) {
        Week w1 = Week.MONDAY;
        Week w2 = Week.TUESDAY;
        Week w3 = Week.WEDNESDAY;
        Week w4 = Week.THURSDAY;
        Week w5 = Week.FRIDAY;
        Week w6 = Week.SATURDAY;
        Week w7 = Week.SUNDAY;

        Today today = new Today(w6);
        today.getDay();
    }
}
