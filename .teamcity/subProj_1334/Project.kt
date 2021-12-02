package subProj_1334

import subProj_1334.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1334")
    name = "subProj 1334"

    buildType(subProj_bt_1334_5)
    buildType(subProj_bt_1334_3)
    buildType(subProj_bt_1334_4)
    buildType(subProj_bt_1334_1)
    buildType(subProj_bt_1334_2)
    buildType(subProj_bt_1334_0)
})
