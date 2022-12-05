public class CompetitionRules {
    private static CompetitionRules instance = null;

    public static CompetitionRules getInstance(){
        if (instance == null) {
            instance = new CompetitionRules();
        }
        return instance;
    }
    private String competitionRule1 = "Do not copy and paste from StackOverflow! ";
    private String competitionRule2 = "Learn every day! ";
    private String competitionRule3 = "Be the best team! ";

    public void printRules() {
        System.out.println(competitionRule1 + competitionRule2 + competitionRule3);
    }
}
