package me.contaria.glacier.optimization.memory.structures;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundTag;

public interface MutableStructureBlockInfo {
    void glacier$set(int x, int y, int z, BlockState state, CompoundTag tag);
}
