package com.arcproject.arcriderapp.Common;

import com.arcproject.arcriderapp.Remote.FCMClient;
import com.arcproject.arcriderapp.Remote.IFCMService;

public class Common {

    public static final String token_tbl = "Tokens";

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequests";



    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
