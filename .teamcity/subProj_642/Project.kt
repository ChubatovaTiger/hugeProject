package subProj_642

import subProj_642.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_642")
    name = "subProj 642"

    buildType(subProj_bt_642_4)
    buildType(subProj_bt_642_5)
    buildType(subProj_bt_642_2)
    buildType(subProj_bt_642_3)
    buildType(subProj_bt_642_0)
    buildType(subProj_bt_642_1)
})
