package be.vdab;

import java.util.Arrays;

public class HelpdeskMedewerkers {

    private String[] namen;

    public void setNamen(String[] namen) {
	this.namen = namen;
    }

    @Override
    public String toString() {
	return Arrays.toString(namen);
    }

}
