package subProj_1995

import subProj_1995.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1995")
    name = "subProj 1995"

    buildType(subProj_bt_1995_3)
    buildType(subProj_bt_1995_2)
    buildType(subProj_bt_1995_5)
    buildType(subProj_bt_1995_4)
    buildType(subProj_bt_1995_1)
    buildType(subProj_bt_1995_0)
})
