package subProj_448

import subProj_448.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_448")
    name = "subProj 448"

    buildType(subProj_bt_448_2)
    buildType(subProj_bt_448_3)
    buildType(subProj_bt_448_0)
    buildType(subProj_bt_448_1)
    buildType(subProj_bt_448_4)
    buildType(subProj_bt_448_5)
})
