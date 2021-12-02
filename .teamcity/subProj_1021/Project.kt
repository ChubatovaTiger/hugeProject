package subProj_1021

import subProj_1021.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1021")
    name = "subProj 1021"

    buildType(subProj_bt_1021_5)
    buildType(subProj_bt_1021_4)
    buildType(subProj_bt_1021_3)
    buildType(subProj_bt_1021_2)
    buildType(subProj_bt_1021_1)
    buildType(subProj_bt_1021_0)
})
