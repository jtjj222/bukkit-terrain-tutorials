package me.jtjj222.biomegen.noisegenerators;

import org.bukkit.World;

public class PlainsNoiseGenerator extends BiomeNoiseGenerator {

	@Override
	public void setWorld(World world) {
		super.setWorld(world);
		this.generator.setScale(1.0/256.0);
		this.magnitude = 3.0;
	}
	
	@Override
	public double get3dNoise(double x, double y, double z) {
		return 0;
	}

}
