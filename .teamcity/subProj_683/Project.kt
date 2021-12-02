package subProj_683

import subProj_683.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_683")
    name = "subProj 683"

    buildType(subProj_bt_683_3)
    buildType(subProj_bt_683_4)
    buildType(subProj_bt_683_5)
    buildType(subProj_bt_683_0)
    buildType(subProj_bt_683_1)
    buildType(subProj_bt_683_2)
})
