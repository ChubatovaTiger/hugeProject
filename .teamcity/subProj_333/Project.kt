package subProj_333

import subProj_333.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_333")
    name = "subProj 333"

    buildType(subProj_bt_333_4)
    buildType(subProj_bt_333_3)
    buildType(subProj_bt_333_2)
    buildType(subProj_bt_333_1)
    buildType(subProj_bt_333_5)
    buildType(subProj_bt_333_0)
})
