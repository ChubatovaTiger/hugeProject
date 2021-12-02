package subProj_1578

import subProj_1578.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1578")
    name = "subProj 1578"

    buildType(subProj_bt_1578_5)
    buildType(subProj_bt_1578_1)
    buildType(subProj_bt_1578_2)
    buildType(subProj_bt_1578_3)
    buildType(subProj_bt_1578_4)
    buildType(subProj_bt_1578_0)
})
