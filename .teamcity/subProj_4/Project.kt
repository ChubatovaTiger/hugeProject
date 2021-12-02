package subProj_4

import subProj_4.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_4")
    name = "subProj 4"

    buildType(subProj_bt_4_2)
    buildType(subProj_bt_4_3)
    buildType(subProj_bt_4_0)
    buildType(subProj_bt_4_1)
    buildType(subProj_bt_4_4)
    buildType(subProj_bt_4_5)
})
