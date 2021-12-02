package subProj_1093

import subProj_1093.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1093")
    name = "subProj 1093"

    buildType(subProj_bt_1093_0)
    buildType(subProj_bt_1093_5)
    buildType(subProj_bt_1093_4)
    buildType(subProj_bt_1093_3)
    buildType(subProj_bt_1093_2)
    buildType(subProj_bt_1093_1)
})
