package com.studentdb.util;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection con = DBUtil.getConnection();
        if (con != null) {
            System.out.println("🎉 Database Connected Successfully!");
        } else {
            System.out.println("❌ Connection Failed");
        }
    }
}
