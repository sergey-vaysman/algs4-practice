package me.vaysman.algorithms.practice.common.draw;

import edu.princeton.cs.algs4.StdDraw;

public class DrawSegment {

	private Point begin;
	private Point end;
	
	public void draw() {
		double x0 = begin.getX();
		double y0 = begin.getY();
		double x1 = end.getX();
		double y1 = end.getY();
		StdDraw.line(x0, y0, x1, y1);
	}
	
}
