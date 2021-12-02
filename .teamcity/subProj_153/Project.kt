package subProj_153

import subProj_153.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_153")
    name = "subProj 153"

    buildType(subProj_bt_153_0)
    buildType(subProj_bt_153_1)
    buildType(subProj_bt_153_2)
    buildType(subProj_bt_153_3)
    buildType(subProj_bt_153_4)
    buildType(subProj_bt_153_5)
})
