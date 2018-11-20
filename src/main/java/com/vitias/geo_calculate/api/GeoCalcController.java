package com.vitias.geo_calculate.api;

import com.vitias.geo_calculate.data.dto.GeoRequest;
import com.vitias.geo_calculate.data.dto.LocationData;
import com.vitias.geo_calculate.service.LocationCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoCalcController {

    private Logger LOG = LoggerFactory.getLogger(GeoCalcController.class);

    @Autowired
    private LocationCalculator locationCalculator;

    @RequestMapping(path = "/calculate", method = RequestMethod.POST)
    public ResponseEntity dataImportAuto(GeoRequest data) {
        LocationData res = locationCalculator.calculate(data);
        return new ResponseEntity(res, HttpStatus.OK);
    }
}
