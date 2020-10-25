package com.coldbreath.frost.items;

import com.coldbreath.frost.Frost;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Frost.TAB));
    }
}
