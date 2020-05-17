/*
 * ShoppingList - A simple shopping list for Android
 *
 * Copyright (C) 2018.  Wolfgang Popp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.woefe.shoppinglist.shoppinglist;

/**
 * @author Wolfgang Popp.
 */
public class ListItem {
    private boolean isChecked;
    private String description;
    private String quantity;
    private String category;

    public ListItem(boolean isChecked, String description, String quantity, String category) {
        this.isChecked = isChecked;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    static class ListItemWithID extends ListItem {
        private final int id;

        public ListItemWithID(int id, ListItem item) {
            super(item.isChecked, item.description, item.quantity, item.category);
            this.id = id;
        }

        public int getId() {
            return id;
        }

    }
}
