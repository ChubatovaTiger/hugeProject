package subProj_1470

import subProj_1470.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1470")
    name = "subProj 1470"

    buildType(subProj_bt_1470_4)
    buildType(subProj_bt_1470_5)
    buildType(subProj_bt_1470_2)
    buildType(subProj_bt_1470_3)
    buildType(subProj_bt_1470_0)
    buildType(subProj_bt_1470_1)
})
