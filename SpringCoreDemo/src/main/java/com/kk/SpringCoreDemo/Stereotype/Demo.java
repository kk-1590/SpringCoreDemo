package com.kk.SpringCoreDemo.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{4 + 8}")
	private int x;
	@Value("#{4 * 7}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new String('ABCDEFG')}")
	private String name;
	
	@Value("#{5 < 8}")
	private boolean isValid;
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isValid=" + isValid + "]";
	}
	
	
}
