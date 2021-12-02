package subProj_130

import subProj_130.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_130")
    name = "subProj 130"

    buildType(subProj_bt_130_5)
    buildType(subProj_bt_130_4)
    buildType(subProj_bt_130_3)
    buildType(subProj_bt_130_2)
    buildType(subProj_bt_130_1)
    buildType(subProj_bt_130_0)
})
