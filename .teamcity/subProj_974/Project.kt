package subProj_974

import subProj_974.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_974")
    name = "subProj 974"

    buildType(subProj_bt_974_0)
    buildType(subProj_bt_974_1)
    buildType(subProj_bt_974_4)
    buildType(subProj_bt_974_5)
    buildType(subProj_bt_974_2)
    buildType(subProj_bt_974_3)
})
