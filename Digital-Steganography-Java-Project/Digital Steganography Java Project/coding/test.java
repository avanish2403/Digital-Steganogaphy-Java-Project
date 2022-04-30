package com.bmpl.Green.io;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class test extends JFrame
{
	Image newimg;
	test()
	{
	}
	test(Image m)
	{
		newimg=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(newimg,100,100,null);
	}

	public static void main(String args[])
	{
		test bp=new test();
		bp.setSize(1035,740);
		bp.setVisible(true);
	}
}
