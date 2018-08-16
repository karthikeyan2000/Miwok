package in.co.skylifeinc.miwok;

public class Word {
    private int mid = 0, msid = 0;
    private String mDefaultTranslation, mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation, int id) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        msid = id;
    }

    public Word(int imageid, String defaultTranslation, String miwokTranslation, int id) {
        mid = imageid;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        msid = id;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getMid() {
        return mid;
    }

    public int getmsid() {
        return msid;
    }
}