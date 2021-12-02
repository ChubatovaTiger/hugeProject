package subProj_451

import subProj_451.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_451")
    name = "subProj 451"

    buildType(subProj_bt_451_4)
    buildType(subProj_bt_451_5)
    buildType(subProj_bt_451_2)
    buildType(subProj_bt_451_3)
    buildType(subProj_bt_451_0)
    buildType(subProj_bt_451_1)
})
