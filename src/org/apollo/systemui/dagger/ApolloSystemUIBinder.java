/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.apollo.systemui.dagger;

import com.android.systemui.keyguard.dagger.KeyguardModule;
import com.android.systemui.recents.RecentsModule;
import com.android.systemui.statusbar.dagger.CentralSurfacesModule;

import dagger.Module;

/**
 * SystemUI objects that are injectable should go here.
 */
@Module(includes = {
        RecentsModule.class,
        CentralSurfacesModule.class,
        KeyguardModule.class,
})
public abstract class ApolloSystemUIBinder {
}
