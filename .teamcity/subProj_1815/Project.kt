package subProj_1815

import subProj_1815.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1815")
    name = "subProj 1815"

    buildType(subProj_bt_1815_3)
    buildType(subProj_bt_1815_4)
    buildType(subProj_bt_1815_5)
    buildType(subProj_bt_1815_0)
    buildType(subProj_bt_1815_1)
    buildType(subProj_bt_1815_2)
})
