package subProj_1126

import subProj_1126.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1126")
    name = "subProj 1126"

    buildType(subProj_bt_1126_1)
    buildType(subProj_bt_1126_0)
    buildType(subProj_bt_1126_3)
    buildType(subProj_bt_1126_2)
    buildType(subProj_bt_1126_5)
    buildType(subProj_bt_1126_4)
})
