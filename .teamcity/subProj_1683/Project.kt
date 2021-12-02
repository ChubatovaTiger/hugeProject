package subProj_1683

import subProj_1683.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1683")
    name = "subProj 1683"

    buildType(subProj_bt_1683_1)
    buildType(subProj_bt_1683_0)
    buildType(subProj_bt_1683_5)
    buildType(subProj_bt_1683_4)
    buildType(subProj_bt_1683_3)
    buildType(subProj_bt_1683_2)
})
