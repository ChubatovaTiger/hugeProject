package subProj_1091

import subProj_1091.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1091")
    name = "subProj 1091"

    buildType(subProj_bt_1091_1)
    buildType(subProj_bt_1091_2)
    buildType(subProj_bt_1091_0)
    buildType(subProj_bt_1091_5)
    buildType(subProj_bt_1091_3)
    buildType(subProj_bt_1091_4)
})
