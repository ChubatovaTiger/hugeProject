package subProj_1103

import subProj_1103.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1103")
    name = "subProj 1103"

    buildType(subProj_bt_1103_0)
    buildType(subProj_bt_1103_2)
    buildType(subProj_bt_1103_1)
    buildType(subProj_bt_1103_4)
    buildType(subProj_bt_1103_3)
    buildType(subProj_bt_1103_5)
})
