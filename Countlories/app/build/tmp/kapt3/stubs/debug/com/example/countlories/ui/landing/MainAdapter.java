package com.example.countlories.ui.landing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/countlories/ui/landing/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/countlories/ui/landing/MainAdapter$ViewHolder;", "listFood", "", "Lcom/example/countlories/data/remote/response/OutputItem;", "(Ljava/util/List;)V", "onItemClickCallback", "Lcom/example/countlories/ui/landing/MainAdapter$OnItemClickCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickCallback", "OnItemClickCallback", "ViewHolder", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.countlories.ui.landing.MainAdapter.ViewHolder> {
    private final java.util.List<com.example.countlories.data.remote.response.OutputItem> listFood = null;
    private com.example.countlories.ui.landing.MainAdapter.OnItemClickCallback onItemClickCallback;
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.countlories.data.remote.response.OutputItem> listFood) {
        super();
    }
    
    public final void setOnClickCallback(@org.jetbrains.annotations.NotNull()
    com.example.countlories.ui.landing.MainAdapter.OnItemClickCallback onItemClickCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.countlories.ui.landing.MainAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.countlories.ui.landing.MainAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/example/countlories/ui/landing/MainAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/countlories/databinding/ItemFoodBinding;", "(Lcom/example/countlories/databinding/ItemFoodBinding;)V", "getBinding", "()Lcom/example/countlories/databinding/ItemFoodBinding;", "setBinding", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.countlories.databinding.ItemFoodBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.countlories.databinding.ItemFoodBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.countlories.databinding.ItemFoodBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.countlories.databinding.ItemFoodBinding p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/countlories/ui/landing/MainAdapter$OnItemClickCallback;", "", "onItemClicked", "", "data", "Lcom/example/countlories/data/remote/response/OutputItem;", "holder", "Lcom/example/countlories/ui/landing/MainAdapter$ViewHolder;", "app_debug"})
    public static abstract interface OnItemClickCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.countlories.data.remote.response.OutputItem data, @org.jetbrains.annotations.NotNull()
        com.example.countlories.ui.landing.MainAdapter.ViewHolder holder);
    }
}