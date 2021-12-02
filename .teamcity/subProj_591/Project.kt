package subProj_591

import subProj_591.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_591")
    name = "subProj 591"

    buildType(subProj_bt_591_1)
    buildType(subProj_bt_591_2)
    buildType(subProj_bt_591_0)
    buildType(subProj_bt_591_5)
    buildType(subProj_bt_591_3)
    buildType(subProj_bt_591_4)
})
