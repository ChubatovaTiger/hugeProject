package subProj_1764

import subProj_1764.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1764")
    name = "subProj 1764"

    buildType(subProj_bt_1764_0)
    buildType(subProj_bt_1764_1)
    buildType(subProj_bt_1764_2)
    buildType(subProj_bt_1764_3)
    buildType(subProj_bt_1764_4)
    buildType(subProj_bt_1764_5)
})
