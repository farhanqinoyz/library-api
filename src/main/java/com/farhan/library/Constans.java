package com.farhan.library;

public class Constans {

    private Constans() {
        //not called
	}

    public static final String RESPONSE_TYPE_ERROR = "Error";
    public static final String RESPONSE_TYPE_SUCCESS = "Success";
    public static final String RESPONSE_TYPE_WARN = "Warning";
    public static final String RESPONSE_TYPE_NOT_FOUND = "Not Found";
    public static final String RESPONSE_TYPE_INFO = "Info";

    public static final String ERROR_EXCEPTION = "Unexpected Exception in processing!";
    public static final String ERROR_SEND_EMAIL= "Unexpected Exception in Send-mail processing!";

    public static final String EVENT_MEDIA_WHATSAPP = "whatsapp";
    public static final String EVENT_MEDIA_INSTAGRAM = "instagram";
    public static final String EVENT_MEDIA_FACEBOOK = "facebook";
    public static final String EVENT_MEDIA_TWITTER = "twitter";
    public static final String EVENT_MEDIA_ZOOM = "zoom";
 
    public static final String PROJECT_CONTRIBUTOR_PAYMENT_STATUS_WAITING = "Waiting";
    public static final String PROJECT_CONTRIBUTOR_PAYMENT_STATUS_COMPLETED = "Completed";
 
    public static final String DOCUMENTATION_STATUS_APPROVED = "Approved";
    public static final String DOCUMENTATION_STATUS_ON_APPROVAL = "On Approval";
    public static final String DOCUMENTATION_STATUS_REJECTED = "Rejected";
 
    public static final String ORDER_BY_ID = "id";
    public static final String ORDER_BY_NAME = "name";
    public static final String ORDER_BY_TITLE = "title";
    public static final String ORDER_BY_PERIOD = "period";
    public static final String ORDER_BY_YEAR = "year";
    public static final String ORDER_BY_STATUS = "status";
    public static final String ORDER_BY_CATEGORY = "category";
    public static final String ORDER_BY_DATE = "date";
 
    public static final String ORDER_ID_CODE_CROWFUNDING = "CF";
    public static final String ORDER_ID_CODE_VOLUNTARY_DONATION = "DS";
    public static final String ORDER_ID_CODE_SCHOLARSHIP_DONOR = "DB";
 
    public static final String DOMAIN_YAYASAN_DEV = "https://loyola-yayasan-dev.cloudias79.com/";
    public static final String DOMAIN_YAYASAN_PROD = "https://loyola-yayasan.cloudias79.com/";
    public static final String DOMAIN_YAYASAN_AWS = "https://portal.yayasanloyola.org/";
 
    public static final long SIZE_1_MB = 1000000;
    public static final long SIZE_5_MB = 5000000;
    public static final long SIZE_10_MB = 10000000;
} 
