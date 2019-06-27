package com.shapes;

import java.text.DecimalFormat;

public abstract class Shape {

	abstract double volume (double size);

	protected double round(double d)
	{
		DecimalFormat  df = new DecimalFormat("#.##");
		return Double.valueOf(df.format(d));
	}
}
