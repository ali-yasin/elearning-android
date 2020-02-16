package sch.id.aqilah4.elearning.models;

import com.google.gson.annotations.SerializedName;

public class ResponseReport {

    @SerializedName("examreport")
    private Examreport mExamreport;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("status")
    private Boolean mStatus;

    public Examreport getExamreport() {
        return mExamreport;
    }

    public void setExamreport(Examreport examreport) {
        mExamreport = examreport;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Boolean getStatus() {
        return mStatus;
    }

    public void setStatus(Boolean status) {
        mStatus = status;
    }

}