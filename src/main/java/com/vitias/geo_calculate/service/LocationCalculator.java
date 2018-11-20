package com.vitias.geo_calculate.service;

import com.vitias.geo_calculate.data.dto.GeoRequest;
import com.vitias.geo_calculate.data.dto.LocationData;
import org.springframework.stereotype.Service;

@Service
public class LocationCalculator {

    public LocationData calculate(GeoRequest request) {
        LocationData locationData = new LocationData();
        locationData.setLon("1111");
        locationData.setLat("2222");
        return locationData;
    }
}
