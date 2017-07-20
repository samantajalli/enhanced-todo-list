package com.sargent.mark.todolist.data;

import android.view.View;
import android.widget.CheckBox;

import com.sargent.mark.todolist.R;

/**
 * Created by mark on 7/4/17.
 */

public class ToDoItem {
    private String description;
    private String dueDate;

    public ToDoItem(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
/*
    public void itemClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (!checkBox.isChecked()) {
            checkBox.setChecked(true);
        }
        else
            checkBox.setChecked(false);
    }
    */
}
