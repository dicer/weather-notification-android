/*
 *  Android Weather Notification.
 *  Copyright (C) 2010  Denis Nelubin aka Gelin
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

package ru.gelin.android.weather.notification.skin.blacktextplus;

import android.content.Context;
import android.view.View;
import ru.gelin.android.weather.notification.skin.impl.BaseWeatherInfoActivity;

/**
 *  Extends the basic weather info activity.
 *  Overrides weather layout to render temp values with "+" sign.
 */
public class WeatherInfoActivity extends BaseWeatherInfoActivity {

    protected WeatherLayout createWeatherLayout(Context context, View view) {
        return new WeatherLayout(context, view);
    }
    
}
