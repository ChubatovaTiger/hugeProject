package subProj_764

import subProj_764.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_764")
    name = "subProj 764"

    buildType(subProj_bt_764_4)
    buildType(subProj_bt_764_3)
    buildType(subProj_bt_764_5)
    buildType(subProj_bt_764_0)
    buildType(subProj_bt_764_2)
    buildType(subProj_bt_764_1)
})
