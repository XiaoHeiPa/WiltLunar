package op.wawa.wilt.mixins;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

/**
 * Skid or Made By WaWa
 *
 * @author WaWa
 * @date 2023/7/31 16:18
 */
@Mixin(value={Block.class})
public abstract class MixinBlock {
    @Shadow
    public double minX;
    @Shadow
    public double minY;
    @Shadow
    public double minZ;
    @Shadow
    public double maxX;
    @Shadow
    public double maxY;
    @Shadow
    public double maxZ;
    @Shadow
    public abstract void setBlockBounds(float var1, float var2, float var3, float var4, float var5, float var6);

    @Shadow
    public abstract AxisAlignedBB getCollisionBoundingBox(World var1, BlockPos var2, IBlockState var3);

    /**
     * @author a
     * @reason a
     */
    @Overwrite
    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List<AxisAlignedBB> list, Entity collidingEntity) {
        AxisAlignedBB axisalignedbb = this.getCollisionBoundingBox(worldIn, pos, state);
        if(axisalignedbb != null && mask.intersectsWith(axisalignedbb))
            list.add(axisalignedbb);
    }
}
