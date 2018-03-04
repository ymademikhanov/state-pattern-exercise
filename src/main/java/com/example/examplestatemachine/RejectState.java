package com.example.examplestatemachine;

public class RejectState extends State {
	public RejectState(StateContext sc) {
		this.sc = sc;
		this.accept = false;
	}
	
	public void actionA() {
		if (sc.firstAction == ACTION.ACTION_B) {
			sc.setCurrentState(sc.getRejectState());
		} else {
			sc.firstAction = ACTION.ACTION_A;
			sc.setCurrentState(sc.getAcceptState());
		}
	}
	
	public void actionB() {
		if (sc.firstAction == ACTION.ACTION_A) {
			sc.setCurrentState(sc.getRejectState());
		} else {
			sc.firstAction = ACTION.ACTION_B;
			sc.setCurrentState(sc.getAcceptState());
		}
	}
}
