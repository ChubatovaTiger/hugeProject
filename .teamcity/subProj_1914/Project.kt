package subProj_1914

import subProj_1914.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1914")
    name = "subProj 1914"

    buildType(subProj_bt_1914_1)
    buildType(subProj_bt_1914_2)
    buildType(subProj_bt_1914_0)
    buildType(subProj_bt_1914_5)
    buildType(subProj_bt_1914_3)
    buildType(subProj_bt_1914_4)
})
