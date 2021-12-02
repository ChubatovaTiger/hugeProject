package subProj_385

import subProj_385.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_385")
    name = "subProj 385"

    buildType(subProj_bt_385_5)
    buildType(subProj_bt_385_4)
    buildType(subProj_bt_385_1)
    buildType(subProj_bt_385_0)
    buildType(subProj_bt_385_3)
    buildType(subProj_bt_385_2)
})
