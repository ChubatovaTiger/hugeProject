package subProj_943

import subProj_943.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_943")
    name = "subProj 943"

    buildType(subProj_bt_943_4)
    buildType(subProj_bt_943_5)
    buildType(subProj_bt_943_0)
    buildType(subProj_bt_943_1)
    buildType(subProj_bt_943_2)
    buildType(subProj_bt_943_3)
})
