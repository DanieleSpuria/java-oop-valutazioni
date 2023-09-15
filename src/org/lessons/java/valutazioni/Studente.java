package org.lessons.java.valutazioni;

public class Studente {

	public int     id;
	public int     assenze;
	public float   media;
	public boolean res;
	
	public boolean risultato() {
		if (this.assenze > 50) res = false;
		if (this.assenze > 25 && this.assenze < 50 && this.media >= 2) res = true;
		if (this.assenze < 25 && this.media >= 2) res = true;
		return res;
	}
}
