package subProj_23

import subProj_23.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_23")
    name = "subProj 23"

    buildType(subProj_bt_23_0)
    buildType(subProj_bt_23_1)
    buildType(subProj_bt_23_2)
    buildType(subProj_bt_23_3)
    buildType(subProj_bt_23_4)
    buildType(subProj_bt_23_5)
})
