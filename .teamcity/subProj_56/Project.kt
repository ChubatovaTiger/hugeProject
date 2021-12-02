package subProj_56

import subProj_56.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_56")
    name = "subProj 56"

    buildType(subProj_bt_56_0)
    buildType(subProj_bt_56_2)
    buildType(subProj_bt_56_1)
    buildType(subProj_bt_56_4)
    buildType(subProj_bt_56_3)
    buildType(subProj_bt_56_5)
})
