package com.slimbo.BowAdds;

import net.Indyuce.moarbows.MoarBows;

public class LoadBows extends MoarBows{
    public void onLoad() {
        MoarBows.plugin.getBowManager().register(new TestBow.Test_Bow());
    }
}

