package subProj_430

import subProj_430.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_430")
    name = "subProj 430"

    buildType(subProj_bt_430_4)
    buildType(subProj_bt_430_3)
    buildType(subProj_bt_430_5)
    buildType(subProj_bt_430_0)
    buildType(subProj_bt_430_2)
    buildType(subProj_bt_430_1)
})
