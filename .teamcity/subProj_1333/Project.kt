package subProj_1333

import subProj_1333.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1333")
    name = "subProj 1333"

    buildType(subProj_bt_1333_4)
    buildType(subProj_bt_1333_5)
    buildType(subProj_bt_1333_2)
    buildType(subProj_bt_1333_3)
    buildType(subProj_bt_1333_0)
    buildType(subProj_bt_1333_1)
})
