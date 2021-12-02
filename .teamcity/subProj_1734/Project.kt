package subProj_1734

import subProj_1734.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1734")
    name = "subProj 1734"

    buildType(subProj_bt_1734_1)
    buildType(subProj_bt_1734_2)
    buildType(subProj_bt_1734_0)
    buildType(subProj_bt_1734_5)
    buildType(subProj_bt_1734_3)
    buildType(subProj_bt_1734_4)
})