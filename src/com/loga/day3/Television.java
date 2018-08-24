package com.loga.day3;

public class Television {
	private boolean state;
	private int currentChannel;
	private int currentVolume;
	private final int Min=0;
	private final int Max=100;
	public Television() {
	}
	public Television(boolean state,int currentChannel, int currentVolume) {
		this.state= state;
		this.currentChannel= currentChannel;
		this.currentVolume= currentVolume;
	}
	public boolean stateOfTv() {
		state =! state;
		return state;
	}
	public int incVolume() {
		if(currentVolume != Max) {
			currentVolume++;
		}
		return currentVolume;
		}
	public int decVolume() {
		
		if(currentVolume != Min) {
			currentVolume--;
		}
		return currentVolume;
		}
	public int channel(int currentChannel) {
		this.currentChannel = currentChannel;
		return currentChannel;
	}
}
	
