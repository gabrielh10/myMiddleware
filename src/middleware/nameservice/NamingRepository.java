package middleware.nameservice;

import java.util.ArrayList;

public class NamingRepository {
    public ArrayList<NamingRecord> getNamingRecord() {
        return namingRecord;
    }

    public void setNamingRecord(ArrayList<NamingRecord> namingRecord) {
        this.namingRecord = namingRecord;
    }

    protected ArrayList<NamingRecord> namingRecord = new ArrayList<NamingRecord>();
}
