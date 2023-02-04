package com.capacitorjs.plugins.googlemaps

import com.getcapacitor.PluginCall
import com.google.android.gms.maps.model.LatLng

class OverlayCallEvents {
    public val realLatLng : LatLng;
    public val call : PluginCall;
    public val map : CapacitorGoogleMap;

    constructor(_call : PluginCall, _map : CapacitorGoogleMap, _lat : Double, _lng : Double) {
        call = _call;
        var lat = _lat;
        var lng = _lng
        if( lat == null || lng == null )
            throw ExceptionInInitializerError();
        realLatLng = LatLng(lat, lng);
        map = _map;
    }
}
