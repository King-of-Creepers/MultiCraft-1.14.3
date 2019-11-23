package com.multicraft.registries;

import com.multicraft.Multicraft;
import com.multicraft.block.BlueBerryBushBlock;
import com.multicraft.block.PottedBerryBushBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockRegistry {
	
	public static Block BLUE_BERRY_BUSH;
	public static Block POTTED_BERRY_BUSH;
	
	public static Block MOSSY_BRICKS;
	
	public static Block TERRACOTTA_BRICKS;
	public static Block WHITE_TERRACOTTA_BRICKS;
	public static Block ORANGE_TERRACOTTA_BRICKS;
	public static Block MAGENTA_TERRACOTTA_BRICKS;
	public static Block LIGHT_BLUE_TERRACOTTA_BRICKS;
	public static Block YELLOW_TERRACOTTA_BRICKS;
	public static Block LIME_TERRACOTTA_BRICKS;
	public static Block PINK_TERRACOTTA_BRICKS;
	public static Block GRAY_TERRACOTTA_BRICKS;
	public static Block LIGHT_GRAY_TERRACOTTA_BRICKS;
	public static Block CYAN_TERRACOTTA_BRICKS;
	public static Block PURPLE_TERRACOTTA_BRICKS;
	public static Block BLUE_TERRACOTTA_BRICKS;
	public static Block BROWN_TERRACOTTA_BRICKS;
	public static Block GREEN_TERRACOTTA_BRICKS;
	public static Block RED_TERRACOTTA_BRICKS;
	public static Block BLACK_TERRACOTTA_BRICKS;
	
	public static Block WHITE_PLANKS;
	public static Block ORANGE_PLANKS;
	public static Block MAGENTA_PLANKS;
	public static Block LIGHT_BLUE_PLANKS;
	public static Block YELLOW_PLANKS;
	public static Block LIME_PLANKS;
	public static Block PINK_PLANKS;
	public static Block GRAY_PLANKS;
	public static Block LIGHT_GRAY_PLANKS;
	public static Block CYAN_PLANKS;
	public static Block PURPLE_PLANKS;
	public static Block BLUE_PLANKS;
	public static Block BROWN_PLANKS;
	public static Block GREEN_PLANKS;
	public static Block RED_PLANKS;
	public static Block BLACK_PLANKS;
	
	public static Block RUBY_ORE;
	public static Block RUBY_BLOCK;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> blockRegistryEvent) {
		
		blockRegistryEvent.getRegistry().registerAll(
				
				BLUE_BERRY_BUSH = new BlueBerryBushBlock(Block.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().sound(SoundType.SWEET_BERRY_BUSH)).setRegistryName(Multicraft.multicraftLocation("block_blue_berry_bush")),
				POTTED_BERRY_BUSH = new PottedBerryBushBlock(Block.Properties.create(Material.MISCELLANEOUS).tickRandomly().hardnessAndResistance(0)).setRegistryName(Multicraft.multicraftLocation("block_potted_berry")),
				
				MOSSY_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_mossy")),
				
				TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta")),
				WHITE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_white")),
				ORANGE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_orange")),
				MAGENTA_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_magenta")),
				LIGHT_BLUE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_light_blue")),
				YELLOW_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_yellow")),
				LIME_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_lime")),
				PINK_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_pink")),
				GRAY_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_gray")),
				LIGHT_GRAY_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_light_gray")),
				CYAN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_cyan")),
				PURPLE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_purple")),
				BLUE_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_blue")),
				BROWN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_brown")),
				GREEN_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_green")),
				RED_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_red")),
				BLACK_TERRACOTTA_BRICKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F)).setRegistryName(Multicraft.multicraftLocation("block_brick_terracotta_black")),
				
				WHITE_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.SNOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_white_planks")),
				ORANGE_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_orange_planks")),
				MAGENTA_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_magenta_planks")),
				LIGHT_BLUE_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_light_blue_planks")),
				YELLOW_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_yellow_planks")),
				LIME_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_lime_planks")),
				PINK_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_pink_planks")),
				GRAY_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_gray_planks")),
				LIGHT_GRAY_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_light_gray_planks")),
				CYAN_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_cyan_planks")),
				PURPLE_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_purple_planks")),
				BLUE_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_blue_planks")),
				BROWN_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_brown_planks")),
				GREEN_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_green_planks")),
				RED_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_red_planks")),
				BLACK_PLANKS = new Block(Block.Properties.create(Material.ROCK, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(Multicraft.multicraftLocation("block_black_planks")),
				
				RUBY_ORE = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)).setRegistryName(Multicraft.multicraftLocation("block_ruby_ore")),
				RUBY_BLOCK = new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED).sound(SoundType.STONE)).setRegistryName(Multicraft.multicraftLocation("block_ruby_block"))
				
		);
		
	}
	
}