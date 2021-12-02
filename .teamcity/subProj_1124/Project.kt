package subProj_1124

import subProj_1124.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1124")
    name = "subProj 1124"

    buildType(subProj_bt_1124_1)
    buildType(subProj_bt_1124_0)
    buildType(subProj_bt_1124_3)
    buildType(subProj_bt_1124_2)
    buildType(subProj_bt_1124_5)
    buildType(subProj_bt_1124_4)
})
