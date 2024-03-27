package com.mygomii.sharedpreferences

import android.content.Context
import android.content.SharedPreferences


object SharedPreferencesUtils {
    private const val DEF_PREF_NAME = "Default"
    private const val CONFIG_PREF_NAME = "Config"

    fun clearAll(context: Context) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.clear()
        editor.apply()
    }

    private fun getPref(context: Context, name: String?): SharedPreferences {
        return context.getSharedPreferences(name, Context.MODE_MULTI_PROCESS)
    }

    fun putString(editor: SharedPreferences.Editor, name: String?, value: String?) {
        editor.putString(name, value)
    }

    fun putString(context: Context, name: String?, value: String?) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.putString(name, value)
        editor.apply()
    }

    fun putInt(context: Context, name: String?, value: Int) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.putInt(name, value)
        editor.apply()
    }

    fun putLong(context: Context, name: String?, value: Long) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.putLong(name, value)
        editor.apply()
    }

    fun putFloat(context: Context, name: String?, value: Float) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.putFloat(name, value)
        editor.apply()
    }

    fun putBoolean(context: Context, name: String?, value: Boolean) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.putBoolean(name, value)
        editor.apply()
    }

    fun getString(context: Context, name: String?, defValue: String?): String? {
        val pref = getPref(context, DEF_PREF_NAME)
        return pref.getString(name, defValue)
    }

    fun getInt(context: Context, name: String?, defValue: Int): Int {
        val pref = getPref(context, DEF_PREF_NAME)
        return pref.getInt(name, defValue)
    }

    fun getLong(context: Context, name: String?, defValue: Long): Long {
        val pref = getPref(context, DEF_PREF_NAME)
        return pref.getLong(name, defValue)
    }

    fun getFloat(context: Context, name: String?, defValue: Float): Float {
        val pref = getPref(context, DEF_PREF_NAME)
        return pref.getFloat(name, defValue)
    }

    fun getBoolean(context: Context, name: String?, defValue: Boolean): Boolean {
        val pref = getPref(context, DEF_PREF_NAME)
        return pref.getBoolean(name, defValue)
    }

    fun removeValue(context: Context, name: String?) {
        val pref = getPref(context, DEF_PREF_NAME)
        val editor = pref.edit()
        editor.remove(name)
        editor.apply()
    }

    fun getConfigString(context: Context, key: String?, defaultValue: String?): String? {
        val pref = getPref(context, CONFIG_PREF_NAME)
        return pref.getString(key, defaultValue)
    }

    fun putConfigString(context: Context, key: String?, value: String?) {
        val pref = getPref(context, CONFIG_PREF_NAME)
        val editor = pref.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getConfigBoolean(context: Context, key: String?, defaultValue: Boolean): Boolean {
        val pref = getPref(context, CONFIG_PREF_NAME)
        return pref.getBoolean(key, defaultValue)
    }

    fun putConfigBoolean(context: Context, key: String?, value: Boolean) {
        val pref = getPref(context, CONFIG_PREF_NAME)
        val editor = pref.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getConfigLong(context: Context, key: String?, defaultValue: Long): Long {
        val pref = getPref(context, CONFIG_PREF_NAME)
        return pref.getLong(key, defaultValue)
    }

    fun putConfigLong(context: Context, key: String?, value: Long) {
        val pref = getPref(context, CONFIG_PREF_NAME)
        val editor = pref.edit()
        editor.putLong(key, value)
        editor.apply()
    }

    fun getConfigFloat(context: Context, key: String?, defaultValue: Float): Float {
        val pref = getPref(context, CONFIG_PREF_NAME)
        return pref.getFloat(key, defaultValue)
    }

    fun putConfigFloat(context: Context, key: String?, value: Float) {
        val pref = getPref(context, CONFIG_PREF_NAME)
        val editor = pref.edit()
        editor.putFloat(key, value)
        editor.apply()
    }
}