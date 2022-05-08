package com.sanyasdada.express.livelock;

public class Police {
	private boolean moneySent = false;
	
	public void giveRansom(Criminal criminal) {
		while(!criminal.isHosetageReleased()) {
			System.out.println("Police: waiting criminal to release hostaage");
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
		}
		System.out.println("Police: sent money");
		this.moneySent = true;
	}


	public boolean isMoneySent() {
		// TODO Auto-generated method stub
		return this.moneySent;
	}

}
