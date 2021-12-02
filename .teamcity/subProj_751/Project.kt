package subProj_751

import subProj_751.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_751")
    name = "subProj 751"

    buildType(subProj_bt_751_0)
    buildType(subProj_bt_751_5)
    buildType(subProj_bt_751_1)
    buildType(subProj_bt_751_2)
    buildType(subProj_bt_751_3)
    buildType(subProj_bt_751_4)
})
