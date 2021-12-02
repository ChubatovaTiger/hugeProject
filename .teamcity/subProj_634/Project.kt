package subProj_634

import subProj_634.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_634")
    name = "subProj 634"

    buildType(subProj_bt_634_5)
    buildType(subProj_bt_634_2)
    buildType(subProj_bt_634_1)
    buildType(subProj_bt_634_4)
    buildType(subProj_bt_634_3)
    buildType(subProj_bt_634_0)
})
