package subProj_1709

import subProj_1709.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1709")
    name = "subProj 1709"

    buildType(subProj_bt_1709_4)
    buildType(subProj_bt_1709_3)
    buildType(subProj_bt_1709_5)
    buildType(subProj_bt_1709_0)
    buildType(subProj_bt_1709_2)
    buildType(subProj_bt_1709_1)
})
