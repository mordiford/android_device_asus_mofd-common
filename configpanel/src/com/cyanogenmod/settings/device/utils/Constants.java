/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.settings.device.utils;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Constants {

    // Preference keys
    public static final String TOUCHSCREEN_C_GESTURE_KEY = "touchscreen_gesture_c";
    public static final String TOUCHSCREEN_E_GESTURE_KEY = "touchscreen_gesture_e";
    public static final String TOUCHSCREEN_S_GESTURE_KEY = "touchscreen_gesture_s";
    public static final String TOUCHSCREEN_V_GESTURE_KEY = "touchscreen_gesture_v";
    public static final String TOUCHSCREEN_W_GESTURE_KEY = "touchscreen_gesture_w";
    public static final String TOUCHSCREEN_Z_GESTURE_KEY = "touchscreen_gesture_z";

    // Proc nodes
    public static final String TOUCHSCREEN_C_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_c";
    public static final String TOUCHSCREEN_E_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_e";
    public static final String TOUCHSCREEN_S_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_s";
    public static final String TOUCHSCREEN_V_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_v";
    public static final String TOUCHSCREEN_W_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_w";
    public static final String TOUCHSCREEN_Z_GESTURE_NODE = "/sys/bus/i2c/devices/i2c-7/7-0038/ftsgesture_z";

    // Proc nodes default values
    public static final boolean TOUCHSCREEN_C_GESTURE_DEFAULT = false;
    public static final boolean TOUCHSCREEN_E_GESTURE_DEFAULT = false;
    public static final boolean TOUCHSCREEN_S_GESTURE_DEFAULT = false;
    public static final boolean TOUCHSCREEN_V_GESTURE_DEFAULT = false;
    public static final boolean TOUCHSCREEN_W_GESTURE_DEFAULT = false;
    public static final boolean TOUCHSCREEN_Z_GESTURE_DEFAULT = false;

    // Holds <preference_key> -> <proc_node> mapping
    public static final Map<String, String> sNodePreferenceMap = new HashMap<String, String>();

    // Holds <preference_key> -> <default_values> mapping
    public static final Map<String, Boolean> sNodeDefaultMap = new HashMap<String, Boolean>();

    static {
        sNodePreferenceMap.put(TOUCHSCREEN_C_GESTURE_KEY, TOUCHSCREEN_C_GESTURE_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_E_GESTURE_KEY, TOUCHSCREEN_E_GESTURE_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_S_GESTURE_KEY, TOUCHSCREEN_S_GESTURE_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_V_GESTURE_KEY, TOUCHSCREEN_V_GESTURE_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_W_GESTURE_KEY, TOUCHSCREEN_W_GESTURE_NODE);
        sNodePreferenceMap.put(TOUCHSCREEN_Z_GESTURE_KEY, TOUCHSCREEN_Z_GESTURE_NODE);

        sNodeDefaultMap.put(TOUCHSCREEN_C_GESTURE_KEY, TOUCHSCREEN_C_GESTURE_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_E_GESTURE_KEY, TOUCHSCREEN_E_GESTURE_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_S_GESTURE_KEY, TOUCHSCREEN_S_GESTURE_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_V_GESTURE_KEY, TOUCHSCREEN_V_GESTURE_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_W_GESTURE_KEY, TOUCHSCREEN_W_GESTURE_DEFAULT);
        sNodeDefaultMap.put(TOUCHSCREEN_Z_GESTURE_KEY, TOUCHSCREEN_Z_GESTURE_DEFAULT);
    }

    public static boolean isPreferenceEnabled(Context context, String key, boolean defaultValue) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(key, defaultValue);
    }
}
