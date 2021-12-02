package subProj_1130

import subProj_1130.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1130")
    name = "subProj 1130"

    buildType(subProj_bt_1130_5)
    buildType(subProj_bt_1130_0)
    buildType(subProj_bt_1130_3)
    buildType(subProj_bt_1130_4)
    buildType(subProj_bt_1130_1)
    buildType(subProj_bt_1130_2)
})