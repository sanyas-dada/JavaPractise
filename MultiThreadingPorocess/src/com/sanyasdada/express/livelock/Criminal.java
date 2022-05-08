package com.sanyasdada.express.livelock;

 class Criminal {
	private boolean hostageReleased = false;
	public void releaseHostage(Police police) {
		while(!police.isMoneySent()) {
			System.out.println("Criminal: waiting poice to give ransom");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Criminal: released hostage");
		this.hostageReleased = true;
	}
	public boolean isHosetageReleased() {
		return this.hostageReleased;
	}

 }
