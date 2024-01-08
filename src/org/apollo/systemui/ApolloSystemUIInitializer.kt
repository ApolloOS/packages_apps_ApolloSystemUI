/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.apollo.systemui

import android.content.Context

import org.apollo.systemui.dagger.DaggerApolloGlobalRootComponent

import com.android.systemui.SystemUIInitializer
import com.android.systemui.dagger.GlobalRootComponent

class ApolloSystemUIInitializer(context: Context) : SystemUIInitializer(context) {

    override fun getGlobalRootComponentBuilder(): GlobalRootComponent.Builder {
        return DaggerApolloGlobalRootComponent.builder()
    }
}
