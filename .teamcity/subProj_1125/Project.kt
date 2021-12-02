package subProj_1125

import subProj_1125.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1125")
    name = "subProj 1125"

    buildType(subProj_bt_1125_0)
    buildType(subProj_bt_1125_2)
    buildType(subProj_bt_1125_1)
    buildType(subProj_bt_1125_4)
    buildType(subProj_bt_1125_3)
    buildType(subProj_bt_1125_5)
})
