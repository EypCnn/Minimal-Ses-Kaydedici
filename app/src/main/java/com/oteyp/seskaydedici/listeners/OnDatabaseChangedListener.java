package com.oteyp.seskaydedici.listeners;

/**
 * EypCnn
 * Listen for add/rename items in database
 */
public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}