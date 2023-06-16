package com.example.countlories.ui.landing;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010\'\u001a\u00020\u001eJ\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/countlories/ui/landing/LandingViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Ldagger/Lazy;", "Lcom/example/countlories/domain/MyRepository;", "loginPref", "Lcom/example/countlories/helper/LoginPreferences;", "(Ldagger/Lazy;Lcom/example/countlories/helper/LoginPreferences;)V", "_addedToTrack", "Landroidx/lifecycle/MutableLiveData;", "", "_foodName", "", "_isFavorite", "", "_isLoading", "_listFood", "", "Lcom/example/countlories/data/remote/response/OutputItem;", "addedToTrack", "Landroidx/lifecycle/LiveData;", "getAddedToTrack", "()Landroidx/lifecycle/LiveData;", "foodName", "getFoodName", "isFavorite", "isLoading", "listFood", "getListFood", "addToTracker", "", "foodId", "getAllFood", "getFoodByName", "name", "getNameFromImage", "file", "Lokhttp3/MultipartBody$Part;", "isFavoriteFood", "setAddToTrackerDone", "setFavorite", "Companion", "app_debug"})
public final class LandingViewModel extends androidx.lifecycle.ViewModel {
    private final dagger.Lazy<com.example.countlories.domain.MyRepository> repo = null;
    private final com.example.countlories.helper.LoginPreferences loginPref = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _foodName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> foodName = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.countlories.data.remote.response.OutputItem>> _listFood = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.countlories.data.remote.response.OutputItem>> listFood = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _addedToTrack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> addedToTrack = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.countlories.ui.landing.LandingViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Landing View Model";
    
    @javax.inject.Inject()
    public LandingViewModel(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.example.countlories.domain.MyRepository> repo, @org.jetbrains.annotations.NotNull()
    com.example.countlories.helper.LoginPreferences loginPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFoodName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.countlories.data.remote.response.OutputItem>> getListFood() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getAddedToTrack() {
        return null;
    }
    
    public final void getNameFromImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file) {
    }
    
    public final void getAllFood() {
    }
    
    public final void getFoodByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void addToTracker(@org.jetbrains.annotations.NotNull()
    java.lang.String foodId) {
    }
    
    public final void setAddToTrackerDone() {
    }
    
    public final void isFavoriteFood(@org.jetbrains.annotations.NotNull()
    java.lang.String foodId) {
    }
    
    public final void setFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String foodId) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/countlories/ui/landing/LandingViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}