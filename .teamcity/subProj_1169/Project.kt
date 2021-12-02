package subProj_1169

import subProj_1169.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1169")
    name = "subProj 1169"

    buildType(subProj_bt_1169_2)
    buildType(subProj_bt_1169_1)
    buildType(subProj_bt_1169_0)
    buildType(subProj_bt_1169_5)
    buildType(subProj_bt_1169_4)
    buildType(subProj_bt_1169_3)
})
