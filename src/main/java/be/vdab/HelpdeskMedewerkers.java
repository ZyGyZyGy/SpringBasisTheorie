package be.vdab;

import java.util.Set;

public class HelpdeskMedewerkers {

    private Set<String> namen;

    public void setNamen(Set<String> namen)  {
	this.namen = namen;
    }

    @Override
    public String toString() {
	return namen.toString();
    }

}
