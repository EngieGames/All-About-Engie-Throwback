
package net.mcreator.allaboutengiethrowback.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class MetalChestUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public MetalChestUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AllAboutEngieThrowbackModMenus.METAL_CHEST_UI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(112);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 5, 6) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 23, 6) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 41, 6) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 59, 6) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 77, 6) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 95, 6) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 113, 6) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 131, 6) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 149, 6) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 167, 6) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 185, 6) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 203, 6) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 221, 6) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 239, 6) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 257, 6) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 275, 6) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 5, 24) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 23, 24) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 41, 24) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 59, 24) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 77, 24) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 95, 24) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 113, 24) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 131, 24) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 149, 24) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 167, 24) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 185, 24) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 203, 24) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 221, 24) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 239, 24) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 257, 24) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 275, 24) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 5, 42) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 23, 42) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 41, 42) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 59, 42) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 77, 42) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 95, 42) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 113, 42) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 131, 42) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 149, 42) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 167, 42) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 185, 42) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 203, 42) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 221, 42) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 239, 42) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 257, 42) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 275, 42) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 5, 60) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 23, 60) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 41, 60) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 59, 60) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 77, 60) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 95, 60) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 113, 60) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 131, 60) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 149, 60) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 167, 60) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 185, 60) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 203, 60) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 221, 60) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 239, 60) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 257, 60) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 275, 60) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 5, 78) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 23, 78) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 41, 78) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 59, 78) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 77, 78) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 95, 78) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 113, 78) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 131, 78) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 149, 78) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 167, 78) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 185, 78) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 203, 78) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 221, 78) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 239, 78) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 257, 78) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 275, 78) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 5, 96) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 23, 96) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 41, 96) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 59, 96) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 77, 96) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 95, 96) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 113, 96) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 131, 96) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 149, 96) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 167, 96) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 185, 96) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 203, 96) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 221, 96) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 239, 96) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 257, 96) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 275, 96) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 5, 114) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 23, 114) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 41, 114) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 59, 114) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 77, 114) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 95, 114) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 113, 114) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 131, 114) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 149, 114) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 167, 114) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 185, 114) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 203, 114) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 221, 114) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 239, 114) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 257, 114) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 275, 114) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 60 + 8 + sj * 18, 55 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 60 + 8 + si * 18, 55 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 112) {
				if (!this.moveItemStackTo(itemstack1, 112, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 112, false)) {
				if (index < 112 + 27) {
					if (!this.moveItemStackTo(itemstack1, 112 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 112, 112 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
