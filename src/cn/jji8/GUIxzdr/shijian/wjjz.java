package cn.jji8.GUIxzdr.shijian;

import cn.jji8.GUIxzdr.wanjia;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class wjjz extends Event implements Cancellable {//玩家加载
    private static final HandlerList handlers = new HandlerList();
    boolean isCancelled = false;
    Player Player;
    wanjia wanjia;
    public wjjz(Player a, wanjia b){
        Player = a;
        wanjia = b;
    }
    public wanjia getWanjia(){
        return wanjia;
    }
    public Player getPlayer(){//获取登入成功的玩家
        return Player;
    }
    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList(){
        return handlers;
    }
}
