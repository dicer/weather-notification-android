/*
 *  Weather API.
 *  Copyright (C) 2010  Denis Nelubin, Vladimir Kubyshev
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *  http://gelin.ru
 *  mailto:den@gelin.ru
 */

package ru.gelin.android.weather;

//import java.net.URL;

import java.util.Set;

/**
 *  Common weather conditions.
 */
public interface WeatherCondition {
    
    /**
     *  Returns condition as a human readable text.
     */
    String getConditionText();
    
    /**
     *  Returns URL to condition icon.
     */
    //URL getConditionIcon();
    
    /**
     *  Returns the temperature in default units.
     *  Default unit depends on the weather source.
     *  Any unit conversions loses precision, so the default units are useful when cloning/copying the weather. 
     */
    Temperature getTemperature();
    
    /**
     *  Returns the temperature in specified units.
     */
    @Deprecated
    Temperature getTemperature(UnitSystem units);
    
    /**
     *  Returns the temperature in specified units.
     */
    Temperature getTemperature(TemperatureUnit unit);
    
    /**
     *  Returns humidity as a human readable text.
     *  Can return null. 
     */
    @Deprecated
    String getHumidityText();
    
    /**
     *  Returns wind conditions as a human readable text.
     *  Can return null.
     */
    @Deprecated
    String getWindText();

    /**
     *  Returns humidity.
     */
    Humidity getHumidity();

    /**
     *  Returns wind in default units.
     *  Default unit depends on the weather source.
     *  Any unit conversions loses precision, so the default units are useful when cloning/copying the weather.
     */
    Wind getWind();
    
    /**
     *  Returns wind in specified units.
     */
    Wind getWind(WindSpeedUnit unit);

    /**
     *  Returns cloudiness in default units.
     *  Default unit depends on the weather source.
     *  Any unit conversions loses precision, so the default units are useful when cloning/copying the weather.
     */
    Cloudiness getCloudiness();

    /**
     *  Returns cloudiness in specified units.
     */
    Cloudiness getCloudiness(CloudinessUnit unit);

    /**
     *  Returns precipitation value available for this weather condition.
     */
    Precipitation getPrecipitation();

    /**
     *  Returns the set of weather condition types.
     *  The returned set is unmodifiable.
     */
    Set<WeatherConditionType> getConditionTypes();

}
