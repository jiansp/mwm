package com.anxhit.mwm.cache;

import com.anxhit.mwm.model.MdMwmType;
import com.anxhit.mwm.model.MwmTrolley;
import com.anxhit.mwm.model.OrgHospital;
import com.anxhit.mwm.model.OrgOrgnization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
    public static Map<String, List> BASE_CACHE = new HashMap<>();
    public static List FACE_CACHE = new ArrayList();

    public static OrgOrgnization ORG;
    public static OrgHospital HOSPITAL;
    public static MdMwmType MWM_TYPE;
    public static MwmTrolley TROLLEY;
}
