package com.multiexpansion.world.gen.feature;

import com.mojang.serialization.Codec;
import com.multiexpansion.block.MEBlocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BlockStateProvidingFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.structure.StructureManager;

public class SoulSproutFeature extends Feature<BlockStateProvidingFeatureConfig> {
	
	public SoulSproutFeature(Codec<BlockStateProvidingFeatureConfig> p_i231971_1_) {
		
		super(p_i231971_1_);
		
	}
	
	public boolean func_230362_a_(ISeedReader p_230362_1_, StructureManager p_230362_2_, ChunkGenerator p_230362_3_, Random p_230362_4_, BlockPos p_230362_5_, BlockStateProvidingFeatureConfig p_230362_6_) {
		
		return place(p_230362_1_, p_230362_4_, p_230362_5_, p_230362_6_, 8, 4);
		
	}
	
	public static boolean place(IWorld p_236325_0_, Random p_236325_1_, BlockPos p_236325_2_, BlockStateProvidingFeatureConfig p_236325_3_, int p_236325_4_, int p_236325_5_) {
		
		for (Block block = p_236325_0_.getBlockState(p_236325_2_.down()).getBlock(); !(block == Blocks.SOUL_SAND || block == Blocks.SOUL_SOIL || block == MEBlocks.SOUL_SAND_FARMLAND.get()) && p_236325_2_.getY() > 0; block = p_236325_0_.getBlockState(p_236325_2_).getBlock()) {
			
			p_236325_2_ = p_236325_2_.down();
			
		}
		
		int i = p_236325_2_.getY();
		
		if (i >= 1 && i + 1 < 256) {
			
			int j = 0;
			
			for(int k = 0; k < p_236325_4_ * p_236325_4_; ++k) {
				
				BlockPos blockpos = p_236325_2_.add(p_236325_1_.nextInt(p_236325_4_) - p_236325_1_.nextInt(p_236325_4_), p_236325_1_.nextInt(p_236325_5_) - p_236325_1_.nextInt(p_236325_5_), p_236325_1_.nextInt(p_236325_4_) - p_236325_1_.nextInt(p_236325_4_));
				BlockState blockstate = p_236325_3_.stateProvider.getBlockState(p_236325_1_, blockpos);
				
				if (p_236325_0_.isAirBlock(blockpos) && blockpos.getY() > 0 && blockstate.isValidPosition(p_236325_0_, blockpos)) {
					
					p_236325_0_.setBlockState(blockpos, blockstate, 2);
					++j;
					
				}
				
			}
			
			return j > 0;
			
		} else {
			
			return false;
			
		}
		
	}
	
}