package subProj_1816

import subProj_1816.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1816")
    name = "subProj 1816"

    buildType(subProj_bt_1816_2)
    buildType(subProj_bt_1816_3)
    buildType(subProj_bt_1816_4)
    buildType(subProj_bt_1816_5)
    buildType(subProj_bt_1816_0)
    buildType(subProj_bt_1816_1)
})
