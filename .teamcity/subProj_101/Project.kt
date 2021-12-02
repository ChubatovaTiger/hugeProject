package subProj_101

import subProj_101.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_101")
    name = "subProj 101"

    buildType(subProj_bt_101_4)
    buildType(subProj_bt_101_5)
    buildType(subProj_bt_101_2)
    buildType(subProj_bt_101_3)
    buildType(subProj_bt_101_0)
    buildType(subProj_bt_101_1)
})
