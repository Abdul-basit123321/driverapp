package com.example.muneeb.uokdriver.Common;

import com.example.muneeb.uokdriver.Remote.IGoogleAPI;
import com.example.muneeb.uokdriver.Remote.RetrofitClient;

/**
 * Created by munee on 12/16/2017.
 */
public class Common
{
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_student_tbl = "StudentsInformation";
    public static final String pickup_request_tbl = "PickupRequest";

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
