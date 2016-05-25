package net.aib42.processing;

import processing.core.PApplet;

public class TestLibMain {
	private PApplet papplet;

	public TestLibMain() {
		System.out.println("TestLibMain()");
		this.papplet = null;
	}

	public TestLibMain(PApplet papplet) {
		this.papplet = papplet;
		papplet.println("TestLibMain loaded");
	}

	public int test() {
		return 42;
	}

	public void printSketchInfo() {
		if (papplet != null) {
			papplet.println(
				"Sketch, size " + papplet.width + "x" + papplet.height + ", " +
				"is using renderer " + papplet.sketchRenderer()
			);
		}
	}
}
