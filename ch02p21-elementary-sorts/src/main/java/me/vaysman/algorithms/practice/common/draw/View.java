package me.vaysman.algorithms.practice.common.draw;

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;

/**
 * The static position on the screen which is used for displaying
 * some data graphical representation.
 * 
 * @author Sergey Vaysman
 */
public class View {

	private double x0;
	private double y0;
	private double width;
	private double height;
	
	public void clear() {
		double halfWidth = width / 2;
		double halfHeight = height / 2;
		double xMiddle = x0 + halfWidth;
		double yMiddle = y0 + halfHeight;
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(xMiddle, yMiddle, halfWidth, halfHeight);
	}

	public void setX0(double x0) {
		this.x0 = x0;
	}

	public void setY0(double y0) {
		this.y0 = y0;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
