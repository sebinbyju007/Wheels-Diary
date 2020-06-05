package com.android.myapplication1

object constants {

    const val DB_NAME = "APP_Record"
    const val DB_VERSION = 1
    const val TABLE_NAME = "Driver_Record"

    const val XID = "ID"
    const val XNAME = "Full Name"
    const val XDOB = "Date Of Birth"
    const val XPHONE = "Phone Number"
    const val XEMAIL = "E-mail"
    const val XBLOOD = "Blood Group"
    const val XEXPERIENCE = "Experience"
    const val XLICENSE = "License"
    const val TIMESTAMP = "Time Recorded"



    const val CREATE_TABLE =("CREATE TABLE" + TABLE_NAME + "("
            + XID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + XNAME + "TEXT,"
            + XDOB + "TEXT,"
            + XPHONE + "TEXT,"
            + XEMAIL + "TEXT,"
            + XBLOOD + "TEXT,"
            + XEXPERIENCE + "TEXT,"
            + XLICENSE + "TEXT,"
            + TIMESTAMP + "TEXT,"
            + ")"
            )
}