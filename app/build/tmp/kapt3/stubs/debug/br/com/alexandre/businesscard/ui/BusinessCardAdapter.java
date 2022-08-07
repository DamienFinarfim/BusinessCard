package br.com.alexandre.businesscard.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lbr/com/alexandre/businesscard/ui/BusinessCardAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lbr/com/alexandre/businesscard/data/BusinessCard;", "Lbr/com/alexandre/businesscard/ui/BusinessCardAdapter$ViewHolder;", "()V", "listenerShare", "Lkotlin/Function1;", "Landroid/view/View;", "", "getListenerShare", "()Lkotlin/jvm/functions/Function1;", "setListenerShare", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class BusinessCardAdapter extends androidx.recyclerview.widget.ListAdapter<br.com.alexandre.businesscard.data.BusinessCard, br.com.alexandre.businesscard.ui.BusinessCardAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listenerShare;
    
    public BusinessCardAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getListenerShare() {
        return null;
    }
    
    public final void setListenerShare(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.alexandre.businesscard.ui.BusinessCardAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.alexandre.businesscard.ui.BusinessCardAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/alexandre/businesscard/ui/BusinessCardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbr/com/alexandre/businesscard/databinding/ItemBusinessCardBinding;", "(Lbr/com/alexandre/businesscard/ui/BusinessCardAdapter;Lbr/com/alexandre/businesscard/databinding/ItemBusinessCardBinding;)V", "bind", "", "item", "Lbr/com/alexandre/businesscard/data/BusinessCard;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final br.com.alexandre.businesscard.databinding.ItemBusinessCardBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        br.com.alexandre.businesscard.databinding.ItemBusinessCardBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        br.com.alexandre.businesscard.data.BusinessCard item) {
        }
    }
}