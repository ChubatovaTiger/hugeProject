package subProj_1121

import subProj_1121.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1121")
    name = "subProj 1121"

    buildType(subProj_bt_1121_4)
    buildType(subProj_bt_1121_3)
    buildType(subProj_bt_1121_5)
    buildType(subProj_bt_1121_0)
    buildType(subProj_bt_1121_2)
    buildType(subProj_bt_1121_1)
})
