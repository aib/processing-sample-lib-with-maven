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
		ControlP5 cp5 = new ControlP5(papplet);
	}
}
