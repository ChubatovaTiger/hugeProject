package subProj_1356

import subProj_1356.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1356")
    name = "subProj 1356"

    buildType(subProj_bt_1356_5)
    buildType(subProj_bt_1356_4)
    buildType(subProj_bt_1356_3)
    buildType(subProj_bt_1356_2)
    buildType(subProj_bt_1356_1)
    buildType(subProj_bt_1356_0)
})
