package com.gabrielsmm.gof.criacionais.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final ConnectionPool pool = new ConnectionPool();
	private static final int POOL_SIZE = 2;
	private final List<Connection> connectionsPool = new ArrayList<Connection>();

	public static ConnectionPool getInstance() {
		return pool;
	}
	
	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public Connection getConnection() {
		Connection available = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				available = conn;
				break;
			}
		}
		if(available == null) {
			System.out.println("No Connections available");
			return null;
		}
		available.setInUse(true);
		return available;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
