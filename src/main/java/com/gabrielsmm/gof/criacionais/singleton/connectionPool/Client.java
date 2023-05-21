package com.gabrielsmm.gof.criacionais.singleton.connectionPool;

import com.gabrielsmm.gof.criacionais.singleton.connectionPool.conn.Connection;
import com.gabrielsmm.gof.criacionais.singleton.connectionPool.conn.ConnectionPool;

public class Client {
	public static void doQuery1() {
		Connection conn = ConnectionPool.getInstance().getConnection();
		if(conn != null) {
			conn.query("SELECT * FROM A1");
			ConnectionPool.getInstance().leaveConnection(conn);
		}
	}
	
	public static void doQuery2() {
		Connection conn = ConnectionPool.getInstance().getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		Connection conn = ConnectionPool.getInstance().getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
