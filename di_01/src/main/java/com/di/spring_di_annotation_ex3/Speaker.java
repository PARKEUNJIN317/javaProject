package com.di.spring_di_annotation_ex3;

public class Speaker {
	int volume;
	public void volumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volume++;
	}
	public void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volume--;
	}

}
