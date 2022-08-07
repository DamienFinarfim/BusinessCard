package br.com.alexandre.businesscard.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/alexandre/businesscard/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "businessCardRepository", "Lbr/com/alexandre/businesscard/data/BusinessCardRepository;", "(Lbr/com/alexandre/businesscard/data/BusinessCardRepository;)V", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lbr/com/alexandre/businesscard/data/BusinessCard;", "insert", "", "businessCard", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.alexandre.businesscard.data.BusinessCardRepository businessCardRepository = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    br.com.alexandre.businesscard.data.BusinessCardRepository businessCardRepository) {
        super();
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    br.com.alexandre.businesscard.data.BusinessCard businessCard) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<br.com.alexandre.businesscard.data.BusinessCard>> getAll() {
        return null;
    }
}