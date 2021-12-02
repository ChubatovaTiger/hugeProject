package subProj_709

import subProj_709.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_709")
    name = "subProj 709"

    buildType(subProj_bt_709_2)
    buildType(subProj_bt_709_3)
    buildType(subProj_bt_709_0)
    buildType(subProj_bt_709_1)
    buildType(subProj_bt_709_4)
    buildType(subProj_bt_709_5)
})
