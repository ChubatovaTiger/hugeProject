package subProj_1642

import subProj_1642.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1642")
    name = "subProj 1642"

    buildType(subProj_bt_1642_0)
    buildType(subProj_bt_1642_2)
    buildType(subProj_bt_1642_1)
    buildType(subProj_bt_1642_4)
    buildType(subProj_bt_1642_3)
    buildType(subProj_bt_1642_5)
})
