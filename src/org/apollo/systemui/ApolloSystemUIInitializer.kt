/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.apollo.systemui

import android.content.Context
import android.util.Log
import com.android.systemui.SystemUIInitializer
import com.android.systemui.dagger.GlobalRootComponent
import org.apollo.systemui.dagger.DaggerApolloGlobalRootComponent

class ApolloSystemUIInitializer(context: Context) : SystemUIInitializer(context) {

    private val TAG = "ApolloSystemUIInitializer"

    init {
        Log.d(TAG, "ApolloSystemUIInitializer initialized")
    }

    override fun getGlobalRootComponentBuilder(): GlobalRootComponent.Builder {
        return DaggerApolloGlobalRootComponent.builder()
    }
}
