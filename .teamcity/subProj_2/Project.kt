package subProj_2

import subProj_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_2")
    name = "subProj 2"

    buildType(subProj_bt_2_0)
    buildType(subProj_bt_2_1)
    buildType(subProj_bt_2_4)
    buildType(subProj_bt_2_5)
    buildType(subProj_bt_2_2)
    buildType(subProj_bt_2_3)
})
