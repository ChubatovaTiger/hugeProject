package subProj_986

import subProj_986.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_986")
    name = "subProj 986"

    buildType(subProj_bt_986_5)
    buildType(subProj_bt_986_0)
    buildType(subProj_bt_986_3)
    buildType(subProj_bt_986_4)
    buildType(subProj_bt_986_1)
    buildType(subProj_bt_986_2)
})
