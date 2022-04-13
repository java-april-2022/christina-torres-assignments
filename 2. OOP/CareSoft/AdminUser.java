package CareSoft;

import java.util.ArrayList;
import java.util.Date;

class AdminUser extends User implements CompliantAdmin, CompliantUser {
    private String role;
    private ArrayList<String> secIncidents;

    AdminUser(Integer id, String role) {
        super(id);
        this.role = role;
        this.secIncidents = new ArrayList<String>();
    }


    public void newIncident(String e) {
        String report = String.format(
            "Datetime Submitted: %s \n, Reported By ID: %s\n Notes: %s \n",
            new Date(), this.id, e);
        secIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        secIncidents.add(report);
    }

    @Override
    public boolean assignPin(int p) {
        boolean status = (p > 1000 && p < 10000) ? true : false;
        if (status) this.pin = p;
        return status;
    }

    @Override
    public boolean accessAuthorized(Integer e) {
        boolean status = (e == this.id) ? true : false;
        if (!status) this.authIncident();
        return status;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.secIncidents;
    }

}
