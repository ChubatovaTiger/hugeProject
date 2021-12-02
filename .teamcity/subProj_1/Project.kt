package subProj_1

import subProj_1.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1")
    name = "subProj 1"

    buildType(subProj_bt_1_1)
    buildType(subProj_bt_1_2)
    buildType(subProj_bt_1_0)
    buildType(subProj_bt_1_5)
    buildType(subProj_bt_1_3)
    buildType(subProj_bt_1_4)
})
