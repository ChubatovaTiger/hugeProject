package subProj_1140

import subProj_1140.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1140")
    name = "subProj 1140"

    buildType(subProj_bt_1140_0)
    buildType(subProj_bt_1140_1)
    buildType(subProj_bt_1140_4)
    buildType(subProj_bt_1140_5)
    buildType(subProj_bt_1140_2)
    buildType(subProj_bt_1140_3)
})
