import java.util.*;

public class Crew {

    // ArrayList containing the Strings of each memeber

    ArrayList<String> crewList = new ArrayList<String>();

    // Constructor

    public Crew(int initCaptians, int initEngineerCrew, int initDeckCrew, int initCatering, int initMedical) {

        for (int i = initCaptians; i > 0; i--) {
            crewList.add("Captain");
        }
        for (int i = initEngineerCrew; i > 0; i--) {
            crewList.add("Engineer");
        }
        for (int i = initDeckCrew; i > 0; i--) {
            crewList.add("Deck");
        }
        for (int i = initCatering; i > 0; i--) {
            crewList.add("Catering");
        }
        for (int i = initMedical; i > 0; i--) {
            crewList.add("Medical");
        }

    }

    // 2 Algorithms from class

    private int countCrew(String crewType) {            // "Determines the number of elements meeting specific criteria"
        int count = 0;

        for (int i = 0; i < crewList.size(); i++) {
            if (crewList.get(i).equals(crewType)) {
                count++;
            }
        }

        return count;
    }

    public void removeExtraCaptains() {                  // "Determine the presence of a duplicate" AND "Delete elements"
        int count = 0;

        for (int i = 0; i < crewList.size(); i++) {
            if (crewList.get(i).equals("Captain")) {
                count++;
            }
        }
        for (int i = 0; i <= count; i++) {
            crewList.remove(i);
        }
    }

    // Get and Extra Methods

    public int getCaptains() {
        return countCrew("Captain");
    }

    public int getEngineeringCrew() {
        return countCrew("Engineer");
    }

    public int getDeckCrew() {
        return countCrew("Deck");
    }

    public int getCateringCrew() {
        return countCrew("Catering");
    }

    public int getMedicalCrew() {
        return countCrew("Medical");
    }

    public void printCrew(){
        System.out.println(crewList);
    }

    // toString Method

    public String toString(){
        return getCaptains() + " Captains \n\r" + getEngineeringCrew() + " Engineers \n\r" + getDeckCrew() + " Deck Members \n\r" + getCateringCrew() + " Caterers \n\r" + getMedicalCrew() + " Medics";
    }

}
