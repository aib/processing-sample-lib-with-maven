package net.aib42.processing;

import processing.core.PApplet;
import controlP5.ControlP5;

public class TestLibWithLibrary
{
	private PApplet papplet;

	public TestLibWithLibrary(PApplet papplet) {
		this.papplet = papplet;
		papplet.println("TestLibWithLibrary loaded");
	}

	public void test() {
		papplet.println("ControlP5 version is " + ControlP5.VERSION);
	}
}
