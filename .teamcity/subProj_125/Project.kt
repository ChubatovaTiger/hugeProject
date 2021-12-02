package subProj_125

import subProj_125.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_125")
    name = "subProj 125"

    buildType(subProj_bt_125_5)
    buildType(subProj_bt_125_4)
    buildType(subProj_bt_125_3)
    buildType(subProj_bt_125_2)
    buildType(subProj_bt_125_1)
    buildType(subProj_bt_125_0)
})
