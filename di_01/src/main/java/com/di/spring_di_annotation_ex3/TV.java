package com.di.spring_di_annotation_ex3;

import org.springframework.beans.factory.annotation.Autowired;

public class TV {
	Speaker speaker;
	
	@Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumDown() {
		speaker.volumeDown();
	}
	

}
