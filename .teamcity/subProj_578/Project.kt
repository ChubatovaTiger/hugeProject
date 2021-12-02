package subProj_578

import subProj_578.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_578")
    name = "subProj 578"

    buildType(subProj_bt_578_1)
    buildType(subProj_bt_578_0)
    buildType(subProj_bt_578_3)
    buildType(subProj_bt_578_2)
    buildType(subProj_bt_578_5)
    buildType(subProj_bt_578_4)
})
