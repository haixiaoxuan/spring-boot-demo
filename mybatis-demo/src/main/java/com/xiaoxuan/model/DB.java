package com.xiaoxuan.model;

import org.springframework.stereotype.Component;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */

@Component
public class DB {

    private long DB_ID;

    private String DESC;

    private String DB_LOCATION_URI;

    private String NAME;

    private String OWNER_NAME;

    private String OWNER_TYPE;

    public DB() {
    }

    public DB(long DB_ID, String DESC, String DB_LOCATION_URI, String NAME, String OWNER_NAME, String OWNER_TYPE) {
        this.DB_ID = DB_ID;
        this.DESC = DESC;
        this.DB_LOCATION_URI = DB_LOCATION_URI;
        this.NAME = NAME;
        this.OWNER_NAME = OWNER_NAME;
        this.OWNER_TYPE = OWNER_TYPE;
    }

    @Override
    public String toString() {
        return "DB{" +
                "DB_ID=" + DB_ID +
                ", DESC='" + DESC + '\'' +
                ", DB_LOCATION_URI='" + DB_LOCATION_URI + '\'' +
                ", NAME='" + NAME + '\'' +
                ", OWNER_NAME='" + OWNER_NAME + '\'' +
                ", OWNER_TYPE='" + OWNER_TYPE + '\'' +
                '}';
    }

    public long getDB_ID() {
        return DB_ID;
    }

    public void setDB_ID(long DB_ID) {
        this.DB_ID = DB_ID;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getDB_LOCATION_URI() {
        return DB_LOCATION_URI;
    }

    public void setDB_LOCATION_URI(String DB_LOCATION_URI) {
        this.DB_LOCATION_URI = DB_LOCATION_URI;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getOWNER_NAME() {
        return OWNER_NAME;
    }

    public void setOWNER_NAME(String OWNER_NAME) {
        this.OWNER_NAME = OWNER_NAME;
    }

    public String getOWNER_TYPE() {
        return OWNER_TYPE;
    }

    public void setOWNER_TYPE(String OWNER_TYPE) {
        this.OWNER_TYPE = OWNER_TYPE;
    }
}
