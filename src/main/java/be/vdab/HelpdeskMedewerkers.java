package be.vdab;

import java.util.List;

public class HelpdeskMedewerkers {

    private List<String> namen;

    public void setNamen(List<String> namen)  {
	this.namen = namen;
    }

    @Override
    public String toString() {
	return namen.toString();
    }

}
