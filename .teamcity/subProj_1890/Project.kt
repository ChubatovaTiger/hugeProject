package subProj_1890

import subProj_1890.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1890")
    name = "subProj 1890"

    buildType(subProj_bt_1890_5)
    buildType(subProj_bt_1890_4)
    buildType(subProj_bt_1890_3)
    buildType(subProj_bt_1890_2)
    buildType(subProj_bt_1890_1)
    buildType(subProj_bt_1890_0)
})
