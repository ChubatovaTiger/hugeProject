package subProj_84

import subProj_84.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_84")
    name = "subProj 84"

    buildType(subProj_bt_84_0)
    buildType(subProj_bt_84_1)
    buildType(subProj_bt_84_4)
    buildType(subProj_bt_84_5)
    buildType(subProj_bt_84_2)
    buildType(subProj_bt_84_3)
})
