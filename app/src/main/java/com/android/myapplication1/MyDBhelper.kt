package com.android.myapplication1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBhelper (context: Context?):SQLiteOpenHelper(context, constants.DB_NAME, null,constants.DB_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(constants.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    db.execSQL("DROP TABLE IF EXISTS "+ constants.TABLE_NAME)
        onCreate(db)
    }

    fun insertRecord(
        name:String?,
        dob: String?,
        phone: String,
        email: String?,
        blood: String?,
        experience: String?,
        license: String?,
        timestamps:String
    ):Long{
        val db = this.writableDatabase
        val values = ContentValues()

        values.put(constants.XNAME, name)
        values.put(constants.XDOB, dob)
        values.put(constants.XPHONE,phone)
        values.put(constants.XEMAIL, email)
        values.put(constants.XBLOOD,blood)
        values.put(constants.XEXPERIENCE,experience)
        values.put(constants.XLICENSE,license)
        values.put(constants.TIMESTAMP,timestamps)

        val id = db.insert(constants.TABLE_NAME, null,values)
        db.close()
        return id
    }
}