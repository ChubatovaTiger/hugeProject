package subProj_1591

import subProj_1591.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1591")
    name = "subProj 1591"

    buildType(subProj_bt_1591_3)
    buildType(subProj_bt_1591_2)
    buildType(subProj_bt_1591_5)
    buildType(subProj_bt_1591_4)
    buildType(subProj_bt_1591_1)
    buildType(subProj_bt_1591_0)
})
