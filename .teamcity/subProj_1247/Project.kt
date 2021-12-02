package subProj_1247

import subProj_1247.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1247")
    name = "subProj 1247"

    buildType(subProj_bt_1247_0)
    buildType(subProj_bt_1247_1)
    buildType(subProj_bt_1247_2)
    buildType(subProj_bt_1247_3)
    buildType(subProj_bt_1247_4)
    buildType(subProj_bt_1247_5)
})
