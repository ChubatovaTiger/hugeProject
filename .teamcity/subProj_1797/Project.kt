package subProj_1797

import subProj_1797.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1797")
    name = "subProj 1797"

    buildType(subProj_bt_1797_1)
    buildType(subProj_bt_1797_0)
    buildType(subProj_bt_1797_3)
    buildType(subProj_bt_1797_2)
    buildType(subProj_bt_1797_5)
    buildType(subProj_bt_1797_4)
})
