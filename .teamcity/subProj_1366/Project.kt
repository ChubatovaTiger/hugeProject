package subProj_1366

import subProj_1366.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1366")
    name = "subProj 1366"

    buildType(subProj_bt_1366_5)
    buildType(subProj_bt_1366_4)
    buildType(subProj_bt_1366_3)
    buildType(subProj_bt_1366_2)
    buildType(subProj_bt_1366_1)
    buildType(subProj_bt_1366_0)
})
