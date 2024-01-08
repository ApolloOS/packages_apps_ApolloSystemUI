/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.apollo.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SystemUICoreStartableModule;
import com.android.systemui.dagger.SystemUIModule;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.globalactions.ShutdownUiModule;
import com.android.systemui.keyguard.CustomizationProvider;
import com.android.systemui.shade.ShadeModule;
import com.android.systemui.statusbar.NotificationInsetsModule;
import com.android.systemui.statusbar.QsFrameTranslateModule;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        DefaultComponentBinder.class,
        DependencyProvider.class,
        NotificationInsetsModule.class,
        QsFrameTranslateModule.class,
        ShadeModule.class,
        ShutdownUiModule.class,
        SystemUIBinder.class,
        SystemUIModule.class,
        SystemUICoreStartableModule.class,
        ApolloSystemUIModule.class})
public interface ApolloSysUIComponent extends SysUIComponent {

    /**
     * Builder for a ApolloSystemUIComponent.
     */
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        ApolloSysUIComponent build();
    }

    /**
     * Member injection into the supplied argument.
     */
    void inject(CustomizationProvider customizationProvider);
}
