package com.example.examplestatemachine;

public class AcceptState extends State {
	public AcceptState(StateContext sc) {
		this.sc = sc;
		this.accept = true;
	}
	
	public void actionA() {
		if (sc.firstAction == ACTION.NO_ACTION || sc.firstAction == ACTION.ACTION_A) {
			sc.firstAction = ACTION.ACTION_A;
			sc.setCurrentState(sc.getAcceptState());
		} else {
			sc.setCurrentState(sc.getRejectState());
		}
	}
	
	public void actionB() {
		if (sc.firstAction == ACTION.NO_ACTION || sc.firstAction == ACTION.ACTION_B) {
			sc.firstAction = ACTION.ACTION_B;
			sc.setCurrentState(sc.getAcceptState());
		} else {
			sc.setCurrentState(sc.getRejectState());
		}
	}
}
