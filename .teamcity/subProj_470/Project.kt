package subProj_470

import subProj_470.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_470")
    name = "subProj 470"

    buildType(subProj_bt_470_2)
    buildType(subProj_bt_470_1)
    buildType(subProj_bt_470_0)
    buildType(subProj_bt_470_5)
    buildType(subProj_bt_470_4)
    buildType(subProj_bt_470_3)
})
