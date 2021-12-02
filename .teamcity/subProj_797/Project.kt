package subProj_797

import subProj_797.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_797")
    name = "subProj 797"

    buildType(subProj_bt_797_5)
    buildType(subProj_bt_797_3)
    buildType(subProj_bt_797_4)
    buildType(subProj_bt_797_1)
    buildType(subProj_bt_797_2)
    buildType(subProj_bt_797_0)
})
