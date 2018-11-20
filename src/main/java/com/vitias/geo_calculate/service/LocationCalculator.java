package com.vitias.geo_calculate.service;

import com.vitias.geo_calculate.data.dto.GeoRequest;
import com.vitias.geo_calculate.data.dto.LocationData;
import org.springframework.stereotype.Service;

@Service
public class LocationCalculator {

    public LocationData calculate(GeoRequest request) {
        return new LocationData();
    }
}
