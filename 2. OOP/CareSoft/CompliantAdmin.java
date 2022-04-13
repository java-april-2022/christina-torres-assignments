package CareSoft;

import java.util.ArrayList;

interface CompliantAdmin {
    abstract ArrayList<String> reportSecurityIncidents();

    default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }

    default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }

}
