package org.example.db;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityDataEntity {
    private Long id;
    private String name;
    private WeatherDataEntity weatherDataEntity;
}
