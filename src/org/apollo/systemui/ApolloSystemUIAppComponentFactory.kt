/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.apollo.systemui

import android.content.Context
import com.android.systemui.SystemUIAppComponentFactoryBase
import com.android.systemui.SystemUIInitializer

class ApolloSystemUIAppComponentFactory: SystemUIAppComponentFactoryBase() {

    override fun createSystemUIInitializer(context: Context) = ApolloSystemUIInitializer(context)
}
