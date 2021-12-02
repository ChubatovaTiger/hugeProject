package subProj_399

import subProj_399.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_399")
    name = "subProj 399"

    buildType(subProj_bt_399_5)
    buildType(subProj_bt_399_3)
    buildType(subProj_bt_399_4)
    buildType(subProj_bt_399_1)
    buildType(subProj_bt_399_2)
    buildType(subProj_bt_399_0)
})
