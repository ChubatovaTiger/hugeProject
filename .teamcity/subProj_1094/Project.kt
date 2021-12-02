package subProj_1094

import subProj_1094.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1094")
    name = "subProj 1094"

    buildType(subProj_bt_1094_5)
    buildType(subProj_bt_1094_4)
    buildType(subProj_bt_1094_3)
    buildType(subProj_bt_1094_2)
    buildType(subProj_bt_1094_1)
    buildType(subProj_bt_1094_0)
})
