package domain.db;

import domain.DomainException;
import domain.model.CV;

import java.util.ArrayList;

public class CvDB {

    private ArrayList<CV> cvs = new ArrayList<CV>();

    public CvDB() {

    }

    public void addCV(CV cv) {
        if (cv == null) throw new DomainException("CVDB ERROR JE PENSE!");
        this.cvs.add(cv);
    }

    public CV getCVById(int id) {
        for (CV cv : cvs) {
            if (cv.getId() == id) return cv;
        }
        throw new DomainException("Geen cv met deze id");
    }

    public int getLastID() {
        int result;
        if (this.cvs.size() == 0) result = 0;
        else {
            CV cv = this.cvs.get(cvs.size() - 1);
            result = cv.getId();
        }
        return result;
    }

}
