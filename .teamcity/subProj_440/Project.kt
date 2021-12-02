package subProj_440

import subProj_440.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_440")
    name = "subProj 440"

    buildType(subProj_bt_440_4)
    buildType(subProj_bt_440_5)
    buildType(subProj_bt_440_2)
    buildType(subProj_bt_440_3)
    buildType(subProj_bt_440_0)
    buildType(subProj_bt_440_1)
})
