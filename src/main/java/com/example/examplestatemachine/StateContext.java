package com.example.examplestatemachine;

public class StateContext {
	private State acceptState;
	private State rejectState;
	private State currentState;
	ACTION firstAction;
	
	public StateContext() {
		this.acceptState = new AcceptState(this);
		this.rejectState = new RejectState(this);
		this.currentState = this.rejectState;
		this.firstAction = ACTION.NO_ACTION;
	}
	
	public void actionA() {
		this.currentState.actionA();
	}
	
	public void actionB() {
		this.currentState.actionB();
	}
	
	public boolean isAccept() {
		return this.currentState.isAccept();
    }

	public void setCurrentState(State state) {
		this.currentState = state;
	}

	public State getAcceptState() {
		return acceptState;
	}

	public State getRejectState() {
		return rejectState;
	}
}
