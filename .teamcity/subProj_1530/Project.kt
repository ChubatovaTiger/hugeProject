package subProj_1530

import subProj_1530.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1530")
    name = "subProj 1530"

    buildType(subProj_bt_1530_0)
    buildType(subProj_bt_1530_3)
    buildType(subProj_bt_1530_4)
    buildType(subProj_bt_1530_1)
    buildType(subProj_bt_1530_2)
    buildType(subProj_bt_1530_5)
})
